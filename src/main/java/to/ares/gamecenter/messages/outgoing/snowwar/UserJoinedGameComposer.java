package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.habbohotel.gameclients.GameClient;
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeGame2Player;

public class UserJoinedGameComposer extends MessageComposer {

	private final GameClient session;

	public UserJoinedGameComposer(GameClient session) {
		this.session = session;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5008);
		SerializeGame2Player.parse(this.response, this.session);
		this.response.appendBoolean(false); // notused
		return this.response;
	}


}
