package to.ares.gamecenter.messages.incoming.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.incoming.MessageHandler;
import to.ares.gamecenter.games.snowwar.SnowWar;

public class ThrowSnowballAtPositionParser extends MessageHandler
{
	@Override
	public void handle() throws Exception
	{
		int destinationX = this.packet.readInt();
		int destinationY = this.packet.readInt();
		int type = this.packet.readInt();
		SnowWar.PLAYERS.get(this.client.getHabbo().getHabboInfo().getId()).throwSnowballAtPosition(destinationX, destinationY, type);
	}
}