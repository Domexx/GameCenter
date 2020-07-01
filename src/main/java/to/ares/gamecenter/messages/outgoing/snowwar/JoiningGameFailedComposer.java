package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class JoiningGameFailedComposer extends MessageComposer {

	private final int errorCode;

	public JoiningGameFailedComposer(int errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(0);
		this.response.appendInt(this.errorCode);
		return this.response;
	}


}
