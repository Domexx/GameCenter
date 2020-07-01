package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class GameChatFromPlayerComposer extends MessageComposer {

	private final int userId;
	private final String text;

	public GameChatFromPlayerComposer(final int userId, final String text) {
		this.userId = userId;
		this.text = text;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5023);
		this.response.appendInt(this.userId);
		this.response.appendString(this.text);
		return this.response;
	}


}
