package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class StageRunningComposer extends MessageComposer {

    private final int seconds;

    public StageRunningComposer(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public ServerMessage composeInternal()
    {
        this.response.init(5024);
        this.response.appendInt(seconds);
        return this.response;
    }


}
