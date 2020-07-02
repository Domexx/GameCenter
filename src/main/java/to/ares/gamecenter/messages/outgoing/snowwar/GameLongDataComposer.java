package to.ares.gamecenter.messages.outgoing.snowwar;

/*
 * ****************
 * @author capos *
 * ****************
 */

import to.ares.gamecenter.games.snowwar.room.RoomQueue;
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeGame2;

public class GameLongDataComposer extends MessageComposer {

	private final RoomQueue lobby;

	public GameLongDataComposer(RoomQueue lobby) {
		this.lobby = lobby;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5013);
		SerializeGame2.parse(this.response, lobby);
		return this.response;
	}


}
