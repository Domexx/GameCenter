package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.Composer;
import to.ares.gamecenter.games.snowwar.MessageWriter;
import to.ares.gamecenter.games.snowwar.events.AddBallEvent;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2EventAddBallToMachine {
    public static void parse(final ServerMessage msg, final AddBallEvent evt) {
        msg.appendInt(evt.gameItem.objectId);
    }

    public static void parse(final MessageWriter ClientMessage, final AddBallEvent evt) {
        Composer.add(evt.gameItem.objectId, ClientMessage);
    }
}
