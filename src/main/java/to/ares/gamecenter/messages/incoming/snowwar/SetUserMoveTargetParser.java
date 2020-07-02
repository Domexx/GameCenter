package to.ares.gamecenter.messages.incoming.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.incoming.MessageHandler;
import to.ares.gamecenter.games.snowwar.SnowWar;

public class SetUserMoveTargetParser extends MessageHandler
{
	@Override
	public void handle() throws Exception
	{
		if (SnowWar.PLAYERS.get(this.client.getHabbo().getHabboInfo().getId()).getSnowRoom() == null) {
			return;
		}

		final int x = this.packet.readInt();
		final int y = this.packet.readInt();

		this.packet.readInt(); // Turn
		this.packet.readInt(); // SubTurn

		if(SnowWar.PLAYERS.get(this.client.getHabbo().getHabboInfo().getId()).getHumanObject().canWalkTo(x, y)) {
			SnowWar.PLAYERS.get(this.client.getHabbo().getHabboInfo().getId()).playerMove(x, y);
		}
	}
}