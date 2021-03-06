package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.messages.outgoing.snowwar.Composer;
import to.ares.gamecenter.messages.outgoing.snowwar.MessageWriter;
import to.ares.gamecenter.games.snowwar.events.UserMoveEvent;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2EventMove {
    public static void parse(final ServerMessage msg, final UserMoveEvent evt) {
        msg.appendInt(evt.player.objectId);
        msg.appendInt(evt.x);
        msg.appendInt(evt.y);
    }

    public static void parse(final MessageWriter ClientMessage, final UserMoveEvent evt) {
        Composer.add(evt.player.objectId, ClientMessage);
        Composer.add(evt.x, ClientMessage);
        Composer.add(evt.y, ClientMessage);
    }
}
