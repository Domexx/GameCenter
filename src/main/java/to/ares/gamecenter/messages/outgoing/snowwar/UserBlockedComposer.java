package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class UserBlockedComposer extends MessageComposer {

	private final int snowWarBlockedGame;

	public UserBlockedComposer(int snowWarBlockedGame) {
		this.snowWarBlockedGame = snowWarBlockedGame;
	}

	@Override
	protected ServerMessage composeInternal() {
		this.response.init(5002);
		this.response.appendInt(this.snowWarBlockedGame);
		return this.response;
	}


}
