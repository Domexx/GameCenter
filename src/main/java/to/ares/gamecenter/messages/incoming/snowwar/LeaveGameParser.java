package to.ares.gamecenter.messages.incoming.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */

import com.eu.habbo.messages.incoming.MessageHandler;
import to.ares.gamecenter.games.snowwar.SnowWar;

public class LeaveGameParser extends MessageHandler {
    @Override
    public void handle() throws Exception {
        SnowWar.PLAYERS.get(this.client.getHabbo().getHabboInfo().getId()).userLeft();
    }
}