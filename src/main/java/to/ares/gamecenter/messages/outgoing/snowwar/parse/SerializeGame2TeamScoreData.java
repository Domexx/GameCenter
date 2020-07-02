package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.objects.HumanObject;
import com.eu.habbo.messages.ServerMessage;

import java.util.Collection;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2TeamScoreData {
    public static void parse(final ServerMessage msg, final int TeamId, final int TeamScore, final Collection<HumanObject> Players) {
        msg.appendInt(TeamId);
        msg.appendInt(TeamScore);
        msg.appendInt(Players.size());
        for (final HumanObject Player : Players) {
            SerializeGame2TeamPlayerData.parse(msg, Player);
        }
    }
}
