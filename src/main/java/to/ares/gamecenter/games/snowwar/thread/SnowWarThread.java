package to.ares.gamecenter.games.snowwar.thread;

import to.ares.gamecenter.games.snowwar.room.RoomQueue;
import to.ares.gamecenter.games.snowwar.player.SnowPlayerQueue;
import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.tasks.*;

import java.util.concurrent.ScheduledFuture;

public class SnowWarThread extends Thread {
    public ScheduledFuture<?> future;

    public static void addTask(final SnowWarThread task, final int initDelay, final int repeatDelay) {
        SnowWarWorkerThread.addTask(task, initDelay, repeatDelay, SnowWarWorkerThread.SnowWarTasks);
    }

    public SnowWarRoom room;
    private RoomQueue pickRoom;

    public SnowWarThread(final SnowWarRoom snowRoom, final RoomQueue queue) {
        room = snowRoom;
        pickRoom = queue;
    }

    @Override
    public void run() {
        try {
            if (room.status == to.ares.gamecenter.games.snowwar.SnowWar.ARENA_END) {
                future.cancel(false);
                SnowArenaEndTask.exec(room);
                return;
            }

            if (room.status == to.ares.gamecenter.games.snowwar.SnowWar.ARENA) {
                SnowArenaRunTask.exec(room);
                return;
            }

            if (room.status == to.ares.gamecenter.games.snowwar.SnowWar.STAGE_RUNNING) {
                SnowStageRunTask.exec(room);
                room.status = to.ares.gamecenter.games.snowwar.SnowWar.ARENA;
                return;
            }

            if (room.status == to.ares.gamecenter.games.snowwar.SnowWar.STAGE_STARTING) {
                SnowStageStartingTask.exec(room);
                room.status = to.ares.gamecenter.games.snowwar.SnowWar.STAGE_RUNNING;
                SnowWarThread.addTask(this, 6000, to.ares.gamecenter.games.snowwar.SnowWar.GAMETURNMILLIS);
                return;
            }

            if (room.status == to.ares.gamecenter.games.snowwar.SnowWar.STAGE_LOADING) {
                SnowStageLoadingTask.exec(room);

                if (room.status == to.ares.gamecenter.games.snowwar.SnowWar.STAGE_STARTING) {
                    future.cancel(false);
                    SnowWarThread.addTask(this, 6000, 0);
                }
                return;
            }

            if (room.status == to.ares.gamecenter.games.snowwar.SnowWar.TIMER_TOLOBBY) {
                if (room.timeToStart-- == 0) {
                    future.cancel(false);
                   
                    if(pickRoom.players.size() == 1) {
                    	room.status = 0;
                    	
                    	return;
                    }
                    
                    SnowPlayerQueue.roomLoaded(room);
                    room.status = to.ares.gamecenter.games.snowwar.SnowWar.STAGE_LOADING;
                    SnowWarThread.addTask(this, 100, 200);
                }
            }
        } catch(final Exception ex) {
            future.cancel(false);
            ex.printStackTrace();
            System.out.println("SnowEngine " + ex);
        }
    }
}