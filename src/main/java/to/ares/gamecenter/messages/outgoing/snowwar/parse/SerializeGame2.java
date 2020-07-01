package to.ares.gamecenter.messages.outgoing.snowwar.parse;


import to.ares.gamecenter.games.snowwar.RoomQueue;
import to.ares.gamecenter.games.snowwar.SnowWar;
import com.eu.habbo.habbohotel.gameclients.GameClient;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2 {
    public static void parse(final ServerMessage msg, final RoomQueue queue) {
        msg.appendInt(queue.room.roomId);
        msg.appendString(queue.room.Name);
        msg.appendInt(0); // notused
        msg.appendInt(queue.room.ArenaType.arenaType);
        msg.appendInt(SnowWar.TEAMS.length);
        msg.appendInt(SnowWar.MAXPLAYERS);
        msg.appendString(queue.room.Owner);
        msg.appendInt(14); // notused
        msg.appendInt(queue.players.size());
        for (final GameClient cn : queue.players.values()) {
            SerializeGame2Player.parse(msg, cn);
        }
    }
}
