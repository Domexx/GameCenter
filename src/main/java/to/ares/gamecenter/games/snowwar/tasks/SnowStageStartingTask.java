package to.ares.gamecenter.games.snowwar.tasks;

import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.objects.BaseObject;
import to.ares.gamecenter.games.snowwar.objects.HumanObject;
import to.ares.gamecenter.messages.outgoing.snowwar.StageStartingComposer;

import java.util.ArrayList;

public class SnowStageStartingTask {
	public static void exec(SnowWarRoom room) {
		room.gameObjects.clear();

		room.arenaType.gameObjects(room.gameObjects, room);

		for (final BaseObject obj : room.gameObjects.values()) {
			// TODO: use "addGameObject" in ArenaType.gameObjects and set objectId
			obj._active = true;
			obj.objectId = room.objectIdCounter++;
			//room.addGameObject(obj);
		}

		for (final HumanObject player : room.players.values()) {
			room.addGameObject(player);
		}

		room.checksum = 0;
		for (final BaseObject Object : room.gameObjects.values()) {
			Object.GenerateCHECKSUM(room, 1);
		}

		room.broadcast(new StageStartingComposer(room));

		room.fullGameStatusQueue = new ArrayList<>();
	}
}
