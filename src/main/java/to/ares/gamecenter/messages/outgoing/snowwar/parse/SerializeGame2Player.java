package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import com.eu.habbo.habbohotel.gameclients.GameClient;
import com.eu.habbo.messages.ServerMessage;
import to.ares.gamecenter.games.snowwar.SnowWar;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2Player {
    public static void parse(final ServerMessage msg, final GameClient cn) {
        msg.appendInt(cn.getHabbo().getHabboInfo().getId());
        msg.appendString(cn.getHabbo().getHabboInfo().getUsername());
        msg.appendString(cn.getHabbo().getHabboInfo().getLook());
        msg.appendString(cn.getHabbo().getHabboInfo().getGender().name());
        msg.appendInt(SnowWar.PLAYERS.get(cn.getHabbo().getHabboInfo().getId()).getHumanObject().team);
        msg.appendInt(4);
        msg.appendInt(SnowWar.PLAYERS.get(cn.getHabbo().getHabboInfo().getId()).getScore());
        msg.appendInt(SnowWar.PLAYERS.get(cn.getHabbo().getHabboInfo().getId()).getPointsNeed());
    }
}