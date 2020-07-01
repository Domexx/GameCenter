package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2TeamPlayerData {
    public static void parse(final ServerMessage msg, final HumanGameObject Player) {
        msg.appendString(Player.userName);
        msg.appendInt(Player.userId); // User Id
        msg.appendString(Player.look);
        msg.appendString(Player.sex);
        msg.appendInt(Player.score);
        SerializeGame2PlayerStatsData.parse(msg, Player);
    }
}
