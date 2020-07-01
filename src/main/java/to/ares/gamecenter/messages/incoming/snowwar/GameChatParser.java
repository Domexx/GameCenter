package to.ares.gamecenter.messages.incoming.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.SnowWarPlayer;
import com.eu.habbo.messages.incoming.MessageHandler;
import to.ares.gamecenter.messages.outgoing.snowwar.GameChatFromPlayerComposer;

public class GameChatParser extends MessageHandler
{
	@Override
	public void handle() throws Exception
	{
		final SnowWarPlayer snowPlayer = SnowWar.PLAYERS.get(this.client.getHabbo().getHabboInfo().getId());
		if (snowPlayer == null) {
			return;
		}

		final SnowWarRoom room = snowPlayer.getSnowRoom();
		if (room == null) {
			return;
		}

		final String say = this.packet.readString();

		room.broadcast(new GameChatFromPlayerComposer(snowPlayer.getPlayer().getHabboInfo().getId(), say));
	}
}