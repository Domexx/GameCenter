package to.ares.gamecenter.games.snowwar.tasks;

import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import to.ares.gamecenter.messages.outgoing.snowwar.GameEndingComposer;

public class SnowArenaEnd {
    public static void exec(SnowWarRoom room) {

        int blueScore = 0;
        int redScore = 0;

        for (final int TeamId : SnowWar.TEAMS) {
            if (TeamId == SnowWar.TEAM_BLUE) {
                blueScore += room.TeamScore[TeamId - 1];
            } else {
                redScore += room.TeamScore[TeamId - 1];
            }
        }

        if (blueScore > redScore) {
            room.Winner = 1;
            room.Result = 1;
        } else if (redScore > blueScore) {
            room.Winner = 2;
            room.Result = 1;
        } else {
            room.Winner = 0;
            room.Result = 2;
        }

        for (final HumanGameObject player : room.players.values()) {
            if (room.MostHits == null) {
                room.MostHits = player;
            }

            if (room.MostKills == null) {
                room.MostKills = player;
            }

            if (player.hits > room.MostHits.hits) {
                room.MostHits = player;
            }

            if (player.kills > room.MostKills.kills) {
                room.MostKills = player;
            }
        }
        room.broadcast(new GameEndingComposer(room));
    }
}
