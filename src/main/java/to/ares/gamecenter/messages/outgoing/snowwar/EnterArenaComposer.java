package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeArena;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeGame2PlayerData;
import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class EnterArenaComposer  extends MessageComposer {

	private final SnowWarRoom arena;

	public EnterArenaComposer(final SnowWarRoom room) {
		this.arena = room;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5021);
		this.response.appendInt(0);
		this.response.appendInt(arena.ArenaType.arenaType);
		this.response.appendInt(SnowWar.TEAMS.length);
		this.response.appendInt(arena.players.size());
		for (final HumanGameObject Player : arena.players.values()) {
			SerializeGame2PlayerData.parse(this.response, Player);
		}
		SerializeArena.parse(this.response, arena);
		return this.response;
	}


}
