package to.ares.gamecenter.games.snowwar.tasks;

import to.ares.gamecenter.games.snowwar.MessageWriter;
import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.events.BaseEvent;
import to.ares.gamecenter.games.snowwar.objects.GameItemObject;
import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import to.ares.gamecenter.messages.outgoing.snowwar.FullGameStatusComposer;
import to.ares.gamecenter.messages.outgoing.snowwar.GameStatusComposer;
import to.ares.gamecenter.messages.outgoing.snowwar.StageEndingComposer;
import io.netty.channel.Channel;

import java.util.ArrayList;
import java.util.List;

public class SnowArenaRun {
    public static void exec(SnowWarRoom room) {
        if (room.players.isEmpty()) {
            room.status = SnowWar.CLOSE;
            return;
        }

        List<Channel> filter;
        List<BaseEvent> events;
        MessageWriter writer;

        synchronized (room.gameEvents) {
            synchronized (room.fullGameStatusQueue) {
                filter = room.fullGameStatusQueue;
                room.fullGameStatusQueue = new ArrayList<>();
            }

            // temporally fix for checksum bug..
            //if (filter.isEmpty()) {
            room.checksum = 0;
            for (final GameItemObject Object : room.gameObjects.values()) {
                Object.GenerateCHECKSUM(room, 1);
            }
            //}

            for (final Channel socket : filter) {
                socket.writeAndFlush(new FullGameStatusComposer(room));//5016
            }

            writer = GameStatusComposer.compose(room);

            room.gameEvents.clear();
        }

        for (final HumanGameObject player : room.players.values()) {
            if (player.currentSnowWar != null) {
                if (!filter.isEmpty()) {
                    if (filter.contains(player.cn.getChannel())) {
                        continue;
                    }
                }
                try {
                    player.cn.getChannel().writeAndFlush(writer.getMessage(0));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        room.subTurn();
        room.subTurn();
        room.subTurn();

        if (++room.turn >= SnowWar.GAMETURNS) {
            room.status = SnowWar.ARENA_END;
            room.broadcast(new StageEndingComposer());
        }

		/*int checksum = SerializeGameStatus.seed(room.Turn);
        Log.printLog(room.Turn+" seed:"+checksum);
		for(GameItemObject item : room.gameObjects.values()) {
			int asd = 0;
			String local5 = "";
            while (asd < item.variablesCount) {
                local5 += item.getVariable(asd)+ ",";
            	checksum += (item.getVariable(asd) * ++asd);
            };
            Log.printLog("GameItem:"+item.objectId+" temp-checksum:"+checksum+" Params:"+local5);
		}
        Log.printLog("Turn:"+room.Turn+" real-checksum:"+room.checksum+" pro-checksum:"+(room.checksum+SerializeGameStatus.seed(room.Turn)));
        */
    }
}
