package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.Composer;
import to.ares.gamecenter.games.snowwar.MessageWriter;
import to.ares.gamecenter.games.snowwar.events.BallThrowToPosition;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2EventBallThrowToPosition {
    public static void parse(final ServerMessage msg, final BallThrowToPosition evt) {
        msg.appendInt(evt.attacker.objectId);
        msg.appendInt(evt.x);
        msg.appendInt(evt.y);
        msg.appendInt(evt.type);
    }

    public static void parse(final MessageWriter ClientMessage, final BallThrowToPosition evt) {
        Composer.add(evt.attacker.objectId, ClientMessage);
        Composer.add(evt.x, ClientMessage);
        Composer.add(evt.y, ClientMessage);
        Composer.add(evt.type, ClientMessage);
    }
}
