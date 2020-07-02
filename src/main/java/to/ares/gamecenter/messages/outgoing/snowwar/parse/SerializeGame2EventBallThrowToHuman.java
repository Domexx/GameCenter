package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.Composer;
import to.ares.gamecenter.games.snowwar.MessageWriter;
import to.ares.gamecenter.games.snowwar.events.BallThrowToHumanEvent;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2EventBallThrowToHuman {
    public static void parse(final ServerMessage msg, final BallThrowToHumanEvent evt) {
        msg.appendInt(evt.attacker.objectId);
        msg.appendInt(evt.victim.objectId);
        msg.appendInt(evt.type);
    }

    public static void parse(final MessageWriter ClientMessage, final BallThrowToHumanEvent evt) {
        Composer.add(evt.attacker.objectId, ClientMessage);
        Composer.add(evt.victim.objectId, ClientMessage);
        Composer.add(evt.type, ClientMessage);
    }
}
