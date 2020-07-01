package to.ares.gamecenter.messages.incoming.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.incoming.MessageHandler;
import to.ares.gamecenter.messages.outgoing.snowwar.GameDirectoryStatusComposer;

public class CheckGameDirectoryStatusParser extends MessageHandler
{
	@Override
	public void handle() throws Exception
	{
		this.client.sendResponse(new GameDirectoryStatusComposer(GameDirectoryStatusComposer.ENABLED));
	}
}
