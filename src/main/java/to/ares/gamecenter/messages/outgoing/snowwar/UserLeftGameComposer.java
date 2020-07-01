package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class UserLeftGameComposer extends MessageComposer {

	private final int playerId;

	public UserLeftGameComposer(int playerId) {
		this.playerId = playerId;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5011);
		this.response.appendInt(this.playerId);
		return this.response;
	}


}
