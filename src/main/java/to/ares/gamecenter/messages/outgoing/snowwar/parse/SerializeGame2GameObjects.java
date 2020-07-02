package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.objects.BaseObject;
import to.ares.gamecenter.games.snowwar.objects.HumanObject;
import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class SerializeGame2GameObjects {
    public static void parse(final ServerMessage msg, final SnowWarRoom arena) {
        synchronized (arena.gameObjects) {
            msg.appendInt(arena.gameObjects.size());
            for (final BaseObject Object : arena.gameObjects.values()) {
                for (int i = 0; i < Object.variablesCount; i++) {
                    msg.appendInt(Object.getVariable(i));
                }

                if (Object.getVariable(0) == BaseObject.HUMAN) {
                    final HumanObject player = (HumanObject) Object;
                    msg.appendString(player.userName);
                    msg.appendString(player.motto);
                    msg.appendString(player.look);
                    msg.appendString(player.sex);
                }
            }
        }
    }
}