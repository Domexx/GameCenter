package to.ares.gamecenter.messages.incoming.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import com.eu.habbo.messages.incoming.MessageHandler;

public class RequestFullStatusUpdateParser extends MessageHandler
{
    @Override
    public void handle() throws Exception
    {
        final SnowWarRoom room = SnowWar.PLAYERS.get(this.client.getHabbo().getHabboInfo().getId()).getSnowRoom();

        if (room == null) {
            return;
        }

        room.fullGameStatusQueue.add(this.client.getChannel());
    }
}