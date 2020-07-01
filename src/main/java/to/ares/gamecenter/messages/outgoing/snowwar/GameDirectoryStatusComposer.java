package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class GameDirectoryStatusComposer extends MessageComposer {
    public static final int ENABLED = 0;
    public static final int UNKNOW1 = 1;
    public static final int UNKNOW2 = 2;
    public static final int UNKNOW3 = 3;
    
    private final int state;

	public GameDirectoryStatusComposer(int state) {
		this.state = state;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5012);
		this.response.appendInt(state);
		this.response.appendInt(0); // can't play in x time of seconds..
		this.response.appendInt(1); // snowwar.promotion
		this.response.appendInt(-1);
		return this.response;
	}


}
