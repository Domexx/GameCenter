package to.ares.gamecenter.games.snowwar.tasks;

import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.messages.outgoing.snowwar.StageRunningComposer;

public class SnowStageRun {
	public static void exec(SnowWarRoom room) {
		room.broadcast(new StageRunningComposer(SnowWar.GAMESECONDS));
	}
}
