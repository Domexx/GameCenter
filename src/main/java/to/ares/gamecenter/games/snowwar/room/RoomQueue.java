package to.ares.gamecenter.games.snowwar.room;

import com.eu.habbo.habbohotel.gameclients.GameClient;
import com.eu.habbo.messages.outgoing.MessageComposer;
import to.ares.gamecenter.games.snowwar.SnowWar;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RoomQueue {
	public SnowWarRoom room;
	public final Map<Integer, GameClient> players = new ConcurrentHashMap<Integer, GameClient>(SnowWar.MAXPLAYERS);

	public RoomQueue(SnowWarRoom snowRoom) {
		room = snowRoom;
	}

	public void broadcast(final MessageComposer Message) {
		for (final GameClient cn : players.values()) {
			cn.sendResponse(Message);
		}
	}
}
