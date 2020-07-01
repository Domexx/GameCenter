package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class StartCounterComposer extends MessageComposer {
	private final int time;

	public StartCounterComposer(int time) {
		this.time = time;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5003);
		this.response.appendInt(time);
		return this.response;
	}
}
