package to.ares.gamecenter.games.snowwar.player;

import com.eu.habbo.Emulator;
import to.ares.gamecenter.games.snowwar.room.RoomQueue;
import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.events.PlayerLeftEvent;
import to.ares.gamecenter.messages.outgoing.snowwar.*;
import to.ares.gamecenter.games.snowwar.objects.HumanObject;
import to.ares.gamecenter.games.snowwar.thread.SnowWar;
import com.eu.habbo.habbohotel.gameclients.GameClient;
import com.eu.habbo.habbohotel.users.HabboInfo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SnowPlayerQueue {
    private static int roomCounter;
    private static final Map<Integer, RoomQueue> roomQueue = new ConcurrentHashMap<Integer, RoomQueue>(100);

    public static void addPlayerInQueue(final GameClient cn) {
        final HabboInfo playerData = cn.getHabbo().getHabboInfo();

        RoomQueue pickRoom = null;

        if (roomQueue.isEmpty()) {
            pickRoom = new RoomQueue(new SnowWarRoom(++roomCounter));

            roomQueue.put(pickRoom.room.roomId, pickRoom);
        } else {
            for (final RoomQueue room : roomQueue.values()) {
                if (room.players.size() < to.ares.gamecenter.games.snowwar.SnowWar.MAXPLAYERS) {
                    pickRoom = room;
                    break;
                }
            }

            if (pickRoom == null) {
                pickRoom = new RoomQueue(new SnowWarRoom(++roomCounter));
                roomQueue.put(pickRoom.room.roomId, pickRoom);
            }
        }

        if (pickRoom.players.isEmpty()) {
            pickRoom.room.owner = playerData.getUsername();
        }

        to.ares.gamecenter.games.snowwar.SnowWar.PLAYERS.get(cn.getHabbo().getHabboInfo().getId()).setHumanObject(new HumanObject(pickRoom.room, 0));
        to.ares.gamecenter.games.snowwar.SnowWar.PLAYERS.get(cn.getHabbo().getHabboInfo().getId()).getHumanObject().status = to.ares.gamecenter.games.snowwar.SnowWar.INLOBBY;
        to.ares.gamecenter.games.snowwar.SnowWar.PLAYERS.get(cn.getHabbo().getHabboInfo().getId()).setRoom(pickRoom.room);

        pickRoom.broadcast(new UserJoinedGameComposer(cn));

        pickRoom.players.put(playerData.getId(), cn);

        if (pickRoom.room.owner.equals(playerData.getUsername())) {
            cn.sendResponse(new GameCreatedComposer(pickRoom));
        } else {
            cn.sendResponse(new GameLongDataComposer(pickRoom));
        }

        if (pickRoom.room.timeToStart < 20 && pickRoom.room.status == to.ares.gamecenter.games.snowwar.SnowWar.TIMER_TOLOBBY) {
            cn.sendResponse(new StartCounterComposer(pickRoom.room.timeToStart));
        }

        if (pickRoom.players.size() >= Emulator.getConfig().getInt("gamecenter.snowwar.players.min")) {
            startLoading(pickRoom);
        }
    }

    public static void playerExit(SnowWarRoom room, HumanObject playerObject) {
        final RoomQueue queue = roomQueue.get(room.roomId);
        if (queue == null) {
            if (playerObject == null) {
                return;
            }
            room.players.remove(playerObject.userId);
            room.TeamPlayers.get(playerObject.team).remove(playerObject.userId);

            if (room.status == to.ares.gamecenter.games.snowwar.SnowWar.ARENA) {
                synchronized (room.gameEvents) {
                    room.gameEvents.add(new PlayerLeftEvent(playerObject));
                }

                return;
            }

            room.broadcast(new UserLeftGameComposer(playerObject.userId));
        } else {
            queue.broadcast(new UserLeftGameComposer(playerObject.userId));
            queue.players.remove(playerObject.userId);
        }

        if (playerObject.snowWarPlayer.getPlayer() != null &&
                Emulator.getConfig().getInt("gamecenter.snowwar.room.id") != 0&&
                Emulator.getGameEnvironment().getRoomManager().getRoom(Emulator.getConfig().getInt("gamecenter.snowwar.room.id")) != null) {
            playerObject.snowWarPlayer.getPlayer().goToRoom(Emulator.getConfig().getInt("gamecenter.snowwar.room.id"));
        }

        playerObject.cleanData();
    }

    public static void roomLoaded(SnowWarRoom room) {
        final RoomQueue queue = roomQueue.remove(room.roomId);

        if (queue == null) {
            return;
        }

        int pickTeam = 0;

        for (final GameClient cn : queue.players.values()) {
            room.players.put(cn.getHabbo().getHabboInfo().getId(), to.ares.gamecenter.games.snowwar.SnowWar.PLAYERS.get(cn.getHabbo().getHabboInfo().getId()).getHumanObject());
            int team = 1 + (++pickTeam % to.ares.gamecenter.games.snowwar.SnowWar.TEAMS.length);
            to.ares.gamecenter.games.snowwar.SnowWar.PLAYERS.get(cn.getHabbo().getHabboInfo().getId()).getHumanObject().team = team;
            room.TeamPlayers.get(team).put(cn.getHabbo().getHabboInfo().getId(), to.ares.gamecenter.games.snowwar.SnowWar.PLAYERS.get(cn.getHabbo().getHabboInfo().getId()).getHumanObject());
        }

        queue.broadcast(new GameStartedComposer(queue));
        queue.broadcast(new InArenaQueueComposer(1));

        room.broadcast(new EnterArenaComposer(room));

        for (final HumanObject player : room.players.values()) {
            player.status = to.ares.gamecenter.games.snowwar.SnowWar.INARENA;
            if (player.cn.getHabbo().getHabboInfo().getCurrentRoom() != null) {
                Emulator.getGameEnvironment().getRoomManager().leaveRoom(player.cn.getHabbo(), player.cn.getHabbo().getHabboInfo().getCurrentRoom());
            }

            room.broadcast(new ArenaEnteredComposer(player));
        }


        room.broadcast(new StageLoadComposer());
    }

    private static void startLoading(RoomQueue queue) {
        final SnowWarRoom room = queue.room;

        if (room.status == to.ares.gamecenter.games.snowwar.SnowWar.TIMER_TOLOBBY) {
            return;
        }

        room.timeToStart = Emulator.getConfig().getInt("gamecenter.snowwar.game.start.time");
        room.status = to.ares.gamecenter.games.snowwar.SnowWar.TIMER_TOLOBBY;

        queue.broadcast(new StartCounterComposer(room.timeToStart));

        SnowWar.addTask(new SnowWar(room, queue), 0, 1000);
    }
}