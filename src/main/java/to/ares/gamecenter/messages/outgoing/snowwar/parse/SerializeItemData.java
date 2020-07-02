package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.config.ItemConfig;
import to.ares.gamecenter.games.snowwar.room.items.BaseItem;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeItemData {
    public static void parse(final ServerMessage msg, final ItemConfig baseItem, final BaseItem item) {
        msg.appendInt(item.extraData.getType());
        item.extraData.serializeComposer(msg);

		/*if (flags & 0x0100 > 0) {
			Composer.add(10, writer); // unique serial id
			Composer.add(10, writer); // unique size
		}*/
    }
}
