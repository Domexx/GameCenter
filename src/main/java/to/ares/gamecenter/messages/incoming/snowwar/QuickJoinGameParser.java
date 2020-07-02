package to.ares.gamecenter.messages.incoming.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.player.SnowPlayerQueue;
import com.eu.habbo.messages.incoming.MessageHandler;

public class QuickJoinGameParser extends MessageHandler
{
	@Override
	public void handle() throws Exception
	{
		SnowPlayerQueue.addPlayerInQueue(this.client);
	}
}