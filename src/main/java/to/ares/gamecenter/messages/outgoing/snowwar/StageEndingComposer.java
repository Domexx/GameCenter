package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class StageEndingComposer extends MessageComposer {
    @Override
    public ServerMessage composeInternal()
    {
        this.response.init(5025);
		this.response.appendInt(0);
		return this.response;
    }


}
