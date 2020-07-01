package to.ares.gamecenter.messages.outgoing.snowwar.parse;


import to.ares.gamecenter.games.snowwar.GameFuseObject;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeArena {
    public static void parse(final ServerMessage msg, final SnowWarRoom arena) {
        msg.appendInt(arena.ArenaType.ArenaWidth);
        msg.appendInt(arena.ArenaType.ArenaHeight);
        msg.appendString(arena.ArenaType.HeightMap);
        msg.appendInt(arena.ArenaType.fuseObjects.size());
        for (final GameFuseObject fuseItem : arena.ArenaType.fuseObjects) {
            SerializeFuseObject.parse(msg, fuseItem);
        }
    }
}
