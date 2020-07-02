package to.ares.gamecenter.games.snowwar.thread;

import to.ares.gamecenter.games.snowwar.room.RoomQueue;
import to.ares.gamecenter.games.snowwar.player.SnowPlayerQueue;
import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
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
            if (room.status == SnowWar.ARENA_END) {
                future.cancel(false);
                SnowArenaEnd.exec(room);
                return;
            }

            if (room.status == SnowWar.ARENA) {
                SnowArenaRun.exec(room);
                return;
            }

            if (room.status == SnowWar.STAGE_RUNNING) {
                SnowStageRun.exec(room);
                room.status = SnowWar.ARENA;
                return;
            }

            if (room.status == SnowWar.STAGE_STARTING) {
                SnowStageStarting.exec(room);
                room.status = SnowWar.STAGE_RUNNING;
                SnowWarTask.addTask(this, 6000, SnowWar.GAMETURNMILLIS);
                return;
            }

            if (room.status == SnowWar.STAGE_LOADING) {
                SnowStageLoading.exec(room);

                if (room.status == SnowWar.STAGE_STARTING) {
                    future.cancel(false);
                    SnowWarTask.addTask(this, 6000, 0);
                }
                return;
            }

            if (room.status == SnowWar.TIMER_TOLOBBY) {
                if (room.timeToStart-- == 0) {
                    future.cancel(false);
                   
                    if(pickRoom.players.size() == 1) {
                    	room.status = 0;
                    	
                    	return;
                    }
                    
                    SnowPlayerQueue.roomLoaded(room);
                    room.status = SnowWar.STAGE_LOADING;
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