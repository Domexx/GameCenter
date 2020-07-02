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

public class GameCreatedComposer  extends MessageComposer {

	private final RoomQueue roomQueue;

	public GameCreatedComposer(RoomQueue roomQueue) {
		this.roomQueue = roomQueue;
	}
	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5005);
		SerializeGame2.parse(this.response, roomQueue);
		return this.response;
	}


}
