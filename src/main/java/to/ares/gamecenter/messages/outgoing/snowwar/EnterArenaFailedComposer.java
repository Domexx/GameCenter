package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class EnterArenaFailedComposer extends MessageComposer {

	private final int errorCode;

	public EnterArenaFailedComposer(final int errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5007);
		this.response.appendInt(this.errorCode);
		return this.response;
	}


}
