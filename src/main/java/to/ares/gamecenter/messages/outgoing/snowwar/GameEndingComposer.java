package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeGame2GameResult;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeGame2SnowWarGameStats;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeGame2TeamScoreData;

public class GameEndingComposer extends MessageComposer {

	private final SnowWarRoom arena;

	public GameEndingComposer(SnowWarRoom arena) {
		this.arena = arena;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(5022);
		this.response.appendInt(0);
		SerializeGame2GameResult.parse(this.response, arena);
		this.response.appendInt(SnowWar.TEAMS.length);
		for (final int teamId : SnowWar.TEAMS) {
			SerializeGame2TeamScoreData.parse(this.response, teamId, arena.teamScore[teamId-1], arena.TeamPlayers.get(teamId).values());
		}
		SerializeGame2SnowWarGameStats.parse(this.response, arena);

		return this.response;
	}


}
