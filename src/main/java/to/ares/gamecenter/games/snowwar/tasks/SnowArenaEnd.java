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
                blueScore += room.teamScore[TeamId - 1];
            } else {
                redScore += room.teamScore[TeamId - 1];
            }
        }

        if (blueScore > redScore) {
            room.winner = 1;
            room.result = 1;
        } else if (redScore > blueScore) {
            room.winner = 2;
            room.result = 1;
        } else {
            room.winner = 0;
            room.result = 2;
        }

        for (final HumanGameObject player : room.players.values()) {
            if (room.mostHits == null) {
                room.mostHits = player;
            }

            if (room.mostKills == null) {
                room.mostKills = player;
            }

            if (player.hits > room.mostHits.hits) {
                room.mostHits = player;
            }

            if (player.kills > room.mostKills.kills) {
                room.mostKills = player;
            }
        }
        room.broadcast(new GameEndingComposer(room));
    }
}
