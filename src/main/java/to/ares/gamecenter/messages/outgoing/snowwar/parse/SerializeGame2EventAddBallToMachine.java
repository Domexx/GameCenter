package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.Composer;
import to.ares.gamecenter.games.snowwar.MessageWriter;
import to.ares.gamecenter.games.snowwar.events.AddBallToMachine;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2EventAddBallToMachine {
    public static void parse(final ServerMessage msg, final AddBallToMachine evt) {
        msg.appendInt(evt.gameItem.objectId);
    }

    public static void parse(final MessageWriter ClientMessage, final AddBallToMachine evt) {
        Composer.add(evt.gameItem.objectId, ClientMessage);
    }
}
