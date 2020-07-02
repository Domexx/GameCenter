package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2SnowWarGameStats {
    public static void parse(final ServerMessage msg, final SnowWarRoom arena) {
       msg.appendInt(arena.mostKills.userId);
       msg.appendInt(arena.mostHits.userId);
    }
}
