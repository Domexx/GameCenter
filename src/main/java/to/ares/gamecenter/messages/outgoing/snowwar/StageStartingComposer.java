package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeGame2GameObjects;

public class StageStartingComposer extends MessageComposer {

	private final SnowWarRoom arena;

	public StageStartingComposer(SnowWarRoom arena) {
		this.arena = arena;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5017);
		this.response.appendInt(0);
		this.response.appendString("snowwar_arena_0");
		this.response.appendInt(5);
		SerializeGame2GameObjects.parse(this.response, arena);
		return this.response;
	}


}
