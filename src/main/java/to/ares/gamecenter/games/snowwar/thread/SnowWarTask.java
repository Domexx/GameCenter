package to.ares.gamecenter.games.snowwar.thread;

import to.ares.gamecenter.games.snowwar.RoomQueue;
import to.ares.gamecenter.games.snowwar.SnowPlayerQueue;
import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.tasks.*;

import java.util.concurrent.ScheduledFuture;

public class SnowWarTask extends GameTask {

    public static void addTask(final GameTask task, final int initDelay, final int repeatDelay) {
        SnowWarWorkerTasks.addTask(task, initDelay, repeatDelay, SnowWarWorkerTasks.SnowWarTasks);
    }

    public SnowWarRoom room;
    private RoomQueue pickRoom;

    public SnowWarTask(final SnowWarRoom snowRoom, final RoomQueue queue) {
        room = snowRoom;
        pickRoom = queue;
    }

    @Override
    public void run() {
        try {
            if (room.STATUS == SnowWar.ARENA_END) {
                future.cancel(false);
                SnowArenaEnd.exec(room);
                return;
            }

            if (room.STATUS == SnowWar.ARENA) {
                SnowArenaRun.exec(room);
                return;
            }

            if (room.STATUS == SnowWar.STAGE_RUNNING) {
                SnowStageRun.exec(room);
                room.STATUS = SnowWar.ARENA;
                return;
            }

            if (room.STATUS == SnowWar.STAGE_STARTING) {
                SnowStageStarting.exec(room);
                room.STATUS = SnowWar.STAGE_RUNNING;
                SnowWarTask.addTask(this, 6000, SnowWar.GAMETURNMILLIS);
                return;
            }

            if (room.STATUS == SnowWar.STAGE_LOADING) {
                SnowStageLoading.exec(room);

                if (room.STATUS == SnowWar.STAGE_STARTING) {
                    future.cancel(false);
                    SnowWarTask.addTask(this, 6000, 0);
                }
                return;
            }

            if (room.STATUS == SnowWar.TIMER_TOLOBBY) {
                if (room.TimeToStart-- == 0) {
                    future.cancel(false);
                   
                    if(pickRoom.players.size() == 1) {
                    	room.STATUS = 0;
                    	
                    	return;
                    }
                    
                    SnowPlayerQueue.roomLoaded(room);
                    room.STATUS = SnowWar.STAGE_LOADING;
                    SnowWarTask.addTask(this, 100, 200);
                }
            }
        } catch(final Exception ex) {
            future.cancel(false);
            ex.printStackTrace();
            System.out.println("SnowEngine " + ex);
        }
    }
}

abstract class GameTask extends Thread {
    ScheduledFuture<?> future;
}