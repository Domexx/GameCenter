package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2PlayerData {
    public static void parse(final ServerMessage msg, final HumanGameObject Player) {
        msg.appendInt(Player.userId);
        msg.appendString(Player.userName);
        msg.appendString(Player.look);
        msg.appendString(Player.sex);
        msg.appendInt(Player.team);
    }
}
