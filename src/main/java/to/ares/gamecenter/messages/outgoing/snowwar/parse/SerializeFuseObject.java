package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.arenas.items.GameFuseObject;
import to.ares.gamecenter.games.snowwar.arenas.items.MapStuffData;
import to.ares.gamecenter.games.snowwar.pathfinding.Tile;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeFuseObject {
    public static void parse(final ServerMessage msg, final GameFuseObject fuseItem) {
        msg.appendString(fuseItem.baseItem.name);
        msg.appendInt(fuseItem.itemId);
        msg.appendInt(fuseItem.X);
        msg.appendInt(fuseItem.Y);
        msg.appendInt(fuseItem.baseItem.xDim);
        msg.appendInt(fuseItem.baseItem.yDim);
        msg.appendInt((int) (fuseItem.baseItem.height * Tile.TILE_SIZE));
        msg.appendInt(fuseItem.Rot);
        msg.appendInt(fuseItem.Z);
        msg.appendBoolean(fuseItem.baseItem.allowWalk);
        if (fuseItem.extraData instanceof MapStuffData) {
            msg.appendInt(1);
            fuseItem.extraData.serializeComposer(msg);
        } else {
            msg.appendInt(0);
            fuseItem.extraData.serializeComposer(msg);
        }
    }
}
