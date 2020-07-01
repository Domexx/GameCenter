package to.ares.gamecenter.games.snowwar.tasks;

import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import to.ares.gamecenter.messages.outgoing.snowwar.StageStillLoadingComposer;

import java.util.Collection;

public class SnowStageLoading {
	public static void exec(SnowWarRoom room) {
		final Collection<HumanGameObject> playersLoaded = room.getStageLoadedPlayers();

		if(playersLoaded != null) {
			room.broadcast(new StageStillLoadingComposer(playersLoaded));

			if (!playersLoaded.isEmpty()) {
				return;
			}
		}

		for (final HumanGameObject player : room.players.values()) {
			if(!player.stageLoaded) {
				return;
			}
		}

		room.STATUS = SnowWar.STAGE_STARTING;
	}
}
