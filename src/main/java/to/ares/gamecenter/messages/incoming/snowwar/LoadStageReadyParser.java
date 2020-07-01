package to.ares.gamecenter.messages.incoming.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.SnowWarPlayer;
import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import com.eu.habbo.messages.incoming.MessageHandler;

public class LoadStageReadyParser extends MessageHandler
{
	@Override
	public void handle() throws Exception
	{
		final SnowWarPlayer snowPlayer = SnowWar.PLAYERS.get(this.client.getHabbo().getHabboInfo().getId());
		if(snowPlayer.getSnowRoom() == null) {
			return;
		}

		final HumanGameObject humanObject = snowPlayer.getHumanObject();
		if(humanObject == null) {
			return;
		}

		//Main.in.ReadInt(); // always is 100
		snowPlayer.getSnowRoom().stageLoaded(humanObject);
	}
}
