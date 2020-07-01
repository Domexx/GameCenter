package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.Composer;
import to.ares.gamecenter.games.snowwar.MessageWriter;
import to.ares.gamecenter.games.snowwar.events.PickBallFromGameItem;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2EventPickBallFromGameItem {
    public static void parse(final ServerMessage msg, final PickBallFromGameItem evt) {
        msg.appendInt(evt.player.objectId);
        msg.appendInt(evt.gameItem.objectId);
    }

    public static void parse(final MessageWriter ClientMessage, final PickBallFromGameItem evt) {
        Composer.add(evt.player.objectId, ClientMessage);
        Composer.add(evt.gameItem.objectId, ClientMessage);
    }
}
