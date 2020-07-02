package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.objects.HumanObject;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2PlayerStatsData {
    public static void parse(final ServerMessage msg, final HumanObject Player) {
        msg.appendInt(Player.score);
        msg.appendInt(Player.kills);
        msg.appendInt(0); // not used
        msg.appendInt(Player.hits);
        msg.appendInt(0); // not used
        msg.appendInt(0); // not used
        msg.appendInt(0); // not used
        msg.appendInt(0); // not used
        msg.appendInt(0); // not used
        msg.appendInt(0); // not used
    }
}
