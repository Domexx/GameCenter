package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class PlayerExitedGameArenaComposer extends MessageComposer {

	private final HumanGameObject player;

	public PlayerExitedGameArenaComposer(HumanGameObject player) {
		this.player = player;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(0);
		this.response.appendInt(player.userId);
		this.response.appendInt(player.objectId);
		return this.response;
	}


}
