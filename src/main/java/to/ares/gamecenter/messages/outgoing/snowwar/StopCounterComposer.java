package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class StopCounterComposer extends MessageComposer {
	@Override
	public ServerMessage composeInternal()
	{
		return this.response;
	}
}
