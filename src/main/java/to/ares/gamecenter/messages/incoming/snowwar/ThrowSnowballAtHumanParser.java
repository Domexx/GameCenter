package to.ares.gamecenter.messages.incoming.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.incoming.MessageHandler;
import to.ares.gamecenter.games.snowwar.SnowWar;

public class ThrowSnowballAtHumanParser extends MessageHandler
{
	@Override
	public void handle() throws Exception
	{
		int playerId = this.packet.readInt();
		int type = this.packet.readInt();
		SnowWar.PLAYERS.get(this.client.getHabbo().getHabboInfo().getId()).throwSnowballAtHuman(playerId, type);
	}
}