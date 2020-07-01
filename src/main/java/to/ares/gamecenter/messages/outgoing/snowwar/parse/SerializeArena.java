package to.ares.gamecenter.messages.outgoing.snowwar.parse;


import to.ares.gamecenter.games.snowwar.arenas.items.GameFuseObject;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
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
        for (final GameFuseObject fuseItem : arena.arenaType.fuseObjects) {
            SerializeFuseObject.parse(msg, fuseItem);
        }
    }
}
