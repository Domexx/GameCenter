package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.RoomQueue;
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeGame2;

public class GameStartedComposer extends MessageComposer {

	private final RoomQueue queue;

	public static int HEADER;

	public GameStartedComposer(RoomQueue queue) {
		this.queue = queue;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5000);
		SerializeGame2.parse(this.response, queue);
		return this.response;
	}


}
