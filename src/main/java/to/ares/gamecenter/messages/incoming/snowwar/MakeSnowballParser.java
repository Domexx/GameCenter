package to.ares.gamecenter.messages.incoming.snowwar;

import com.eu.habbo.messages.incoming.MessageHandler;
import to.ares.gamecenter.games.snowwar.SnowWar;

public class MakeSnowballParser extends MessageHandler
{
	@Override
	public void handle() throws Exception
	{
		this.packet.readInt(); // Turn
		this.packet.readInt(); // SubTurn
		SnowWar.PLAYERS.get(this.client.getHabbo().getHabboInfo().getId()).makeSnowBall();
	}
}