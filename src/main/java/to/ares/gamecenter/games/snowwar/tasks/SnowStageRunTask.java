package to.ares.gamecenter.games.snowwar.tasks;

import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import to.ares.gamecenter.messages.outgoing.snowwar.StageRunningComposer;

public class SnowStageRunTask {
	public static void exec(SnowWarRoom room) {
		room.broadcast(new StageRunningComposer(SnowWar.GAMESECONDS));
	}
}
