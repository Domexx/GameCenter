package to.ares.gamecenter.messages.outgoing.snowwar;

import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

import java.util.Collection;
/*
 * ****************
 * @author capos *
 * ****************
 */
public class StageStillLoadingComposer extends MessageComposer {

	private final Collection<HumanGameObject> playersLoaded;

	public StageStillLoadingComposer(Collection<HumanGameObject> playersLoaded) {
		this.playersLoaded = playersLoaded;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5026);
		this.response.appendInt(0); // notused
		this.response.appendInt(playersLoaded.size());
		for (final HumanGameObject player : playersLoaded) {
			this.response.appendInt(player.userId);
		}
		return this.response;
	}


}
