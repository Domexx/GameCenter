package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.Composer;
import to.ares.gamecenter.games.snowwar.MessageWriter;
import to.ares.gamecenter.games.snowwar.events.PlayerLeft;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2EventPlayerLeft {
    public static void parse(final ServerMessage msg, final PlayerLeft evt) {
        msg.appendInt(evt.player.objectId);
    }

    public static void parse(final MessageWriter ClientMessage, final PlayerLeft evt) {
        Composer.add(evt.player.objectId, ClientMessage);
    }
}
