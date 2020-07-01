package to.ares.gamecenter.games.snowwar.tasks;

import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.objects.GameItemObject;
import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import to.ares.gamecenter.messages.outgoing.snowwar.StageStartingComposer;

import java.util.ArrayList;

public class SnowStageStarting {
	public static void exec(SnowWarRoom room) {
		room.gameObjects.clear();

		room.arenaType.gameObjects(room.gameObjects, room);

		for (final GameItemObject obj : room.gameObjects.values()) {
			// TODO: use "addGameObject" in ArenaType.gameObjects and set objectId
			obj._active = true;
			obj.objectId = room.objectIdCounter++;
			//room.addGameObject(obj);
		}

		for (final HumanGameObject player : room.players.values()) {
			room.addGameObject(player);
		}

		room.checksum = 0;
		for (final GameItemObject Object : room.gameObjects.values()) {
			Object.GenerateCHECKSUM(room, 1);
		}

		room.broadcast(new StageStartingComposer(room));

		room.fullGameStatusQueue = new ArrayList<>();
	}
}
