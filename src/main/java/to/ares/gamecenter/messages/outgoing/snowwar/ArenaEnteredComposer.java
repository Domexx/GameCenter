package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.objects.HumanObject;
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeGame2PlayerData;

public class ArenaEnteredComposer extends MessageComposer {

	private final HumanObject player;

	public ArenaEnteredComposer(final HumanObject player) {
		this.player = player;
	}


	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5020);
		SerializeGame2PlayerData.parse(this.response, this.player);
		return this.response;
	}


}
