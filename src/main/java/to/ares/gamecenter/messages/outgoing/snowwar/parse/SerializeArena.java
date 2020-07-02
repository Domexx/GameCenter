package to.ares.gamecenter.messages.outgoing.snowwar.parse;


import to.ares.gamecenter.games.snowwar.room.items.AdsBackgroundObjectItem;
import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeArena {
    public static void parse(final ServerMessage msg, final SnowWarRoom arena) {
        msg.appendInt(arena.arenaType.arenaWidth);
        msg.appendInt(arena.arenaType.arenaHeight);
        msg.appendString(arena.arenaType.heightMap);
        msg.appendInt(arena.arenaType.fuseObjects.size());
        for (final AdsBackgroundObjectItem fuseItem : arena.arenaType.fuseObjects) {
            SerializeFuseObject.parse(msg, fuseItem);
        }
    }
}
