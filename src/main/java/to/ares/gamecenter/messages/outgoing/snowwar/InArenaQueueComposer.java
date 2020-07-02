package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class InArenaQueueComposer extends MessageComposer {

    private final int position;

    public InArenaQueueComposer(int position) {
        this.position = position;
    }

    @Override
    public ServerMessage composeInternal()
    {
        this.response.init(5001);
        this.response.appendInt(this.position);
        return this.response;
    }


}
