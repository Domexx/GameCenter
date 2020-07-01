package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import com.eu.habbo.messages.ServerMessage;

import java.util.Collection;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2TeamScoreData {
    public static void parse(final ServerMessage msg, final int TeamId, final int TeamScore, final Collection<HumanGameObject> Players) {
        msg.appendInt(TeamId);
        msg.appendInt(TeamScore);
        msg.appendInt(Players.size());
        for (final HumanGameObject Player : Players) {
            SerializeGame2TeamPlayerData.parse(msg, Player);
        }
    }
}
