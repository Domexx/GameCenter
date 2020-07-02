package to.ares.gamecenter;

import com.eu.habbo.Emulator;
import com.eu.habbo.habbohotel.users.Habbo;
import com.eu.habbo.messages.PacketManager;
import com.eu.habbo.messages.incoming.Incoming;
import com.eu.habbo.messages.incoming.MessageHandler;
import com.eu.habbo.messages.incoming.gamecenter.GameCenterJoinGameEvent;
import com.eu.habbo.messages.incoming.gamecenter.GameCenterRequestAccountStatusEvent;
import com.eu.habbo.messages.incoming.gamecenter.GameCenterRequestGameStatusEvent;
import com.eu.habbo.plugin.EventHandler;
import com.eu.habbo.plugin.EventListener;
import com.eu.habbo.plugin.HabboPlugin;
import com.eu.habbo.plugin.events.emulator.EmulatorLoadedEvent;
import com.eu.habbo.plugin.events.users.UserDisconnectEvent;
import com.eu.habbo.plugin.events.users.UserLoginEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import to.ares.gamecenter.games.GameManager;
import to.ares.gamecenter.games.fastfood.FastFoodGame;
import to.ares.gamecenter.games.snowwar.SnowWarGame;
import to.ares.gamecenter.messages.incoming.snowwar.*;
import to.ares.gamecenter.messages.outgoing.gamecenter.GameCenterGameListComposer;
import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.player.SnowWarPlayer;
import to.ares.gamecenter.games.snowwar.thread.SnowWarWorkerTasks;
import gnu.trove.map.hash.THashMap;

import java.lang.reflect.Field;
import java.util.HashMap;

public class Plugin extends HabboPlugin implements EventListener {
    private final Logger LOGGER = LoggerFactory.getLogger(Emulator.class);

    public void onEnable() throws Exception {
        Emulator.getPluginManager().registerEvents(this, this);

        GameManager gameManager = new GameManager();

        // @TODO: maybe we could do that better here....
        SnowWar.PLAYERS = new HashMap<>();
        SnowWarWorkerTasks.initWorkers();

        if(Emulator.isReady && !Emulator.isShuttingDown) {
            this.onEmulatorLoadedEvent(null);
        }
    }

    public void onDisable() throws Exception {
        if (!SnowWarWorkerTasks.SnowWarTasks.isShutdown()) {
            SnowWarWorkerTasks.SnowWarTasks.shutdown();
            LOGGER.info("[GameCenter] Stopped SnowWar Tasks");
        }

        PacketManager packetManager = Emulator.getGameServer().getPacketManager();

        Field f = PacketManager.class.getDeclaredField("incoming");
        f.setAccessible(true);

        THashMap<Integer, Class<? extends MessageHandler>> incoming = (THashMap<Integer, Class<? extends MessageHandler>>)f.get(packetManager);

        incoming.remove(Incoming.GameCenterJoinGameEvent);
        incoming.remove(Incoming.GameCenterRequestGameStatusEvent);
        incoming.remove(Incoming.GameCenterRequestAccountStatusEvent);

        Emulator.getGameServer().getPacketManager().registerHandler(Incoming.GameCenterJoinGameEvent, GameCenterJoinGameEvent.class);
        Emulator.getGameServer().getPacketManager().registerHandler(Incoming.GameCenterRequestGameStatusEvent, GameCenterRequestGameStatusEvent.class);
        Emulator.getGameServer().getPacketManager().registerHandler(Incoming.GameCenterRequestAccountStatusEvent, GameCenterRequestAccountStatusEvent.class);

        LOGGER.info("[GameCenter] CYA!");

    }

    @EventHandler
    public void onEmulatorLoadedEvent(EmulatorLoadedEvent event) throws Exception {
        // SnowStorm
        Emulator.getConfig().register("gamecenter.snowwar.enabled", "true");

        Emulator.getConfig().register("gamecenter.snowwar.game.background.color", "93d4f3");
        Emulator.getConfig().register("gamecenter.snowwar.game.text.color", "000000");

        Emulator.getConfig().register("gamecenter.snowwar.game.start.time", "15");
        Emulator.getConfig().register("gamecenter.snowwar.players.min", "4");

        Emulator.getConfig().register("gamecenter.snowwar.assets", "https://ares.to/c_images/gamecenter_snowwar/");
        Emulator.getConfig().register("gamecenter.snowwar.artic.bg", "https://ares.to/c_images/gamecenter_snowwar/snst_bg_1_a_big.png");
        Emulator.getConfig().register("gamecenter.snowwar.dragoncave.bg", "https://ares.to/c_images/gamecenter_snowwar/snst_bg_2_big.png");
        Emulator.getConfig().register("gamecenter.snowwar.fightnight.bg", "https://ares.to/c_images/gamecenter_snowwar/snst_bg_3_noscale.png");

        // FastFood
        Emulator.getConfig().register("gamecenter.fastfood.enabled", "true");

        Emulator.getConfig().register("gamecenter.fastfood.background.color", "68bbd2");
        Emulator.getConfig().register("gamecenter.fastfood.text.color", "ffffff");

        Emulator.getConfig().register("gamecenter.fastfood.assets", "https://ares.to/c_images/gamecenter_basejump/");
        Emulator.getConfig().register("gamecenter.fastfood.apiKey", "");

        Emulator.getConfig().register("gamecenter.fastfood.theme", "default");

        // PacketManager
        Field f = PacketManager.class.getDeclaredField("incoming");
        f.setAccessible(true);

        THashMap<Integer, Class<? extends MessageHandler>> incoming = (THashMap<Integer, Class<? extends MessageHandler>>)f.get(Emulator.getGameServer().getPacketManager());

        incoming.remove(Incoming.GameCenterJoinGameEvent);
        incoming.remove(Incoming.GameCenterRequestGameStatusEvent);
        incoming.remove(Incoming.GameCenterRequestAccountStatusEvent);

        // GameCenter Packets
        Emulator.getGameServer().getPacketManager().registerHandler(Incoming.GameCenterJoinGameEvent, to.ares.gamecenter.messages.incoming.gamecenter.GameCenterJoinGameEvent.class);
        Emulator.getGameServer().getPacketManager().registerHandler(Incoming.GameCenterRequestGameStatusEvent, to.ares.gamecenter.messages.incoming.gamecenter.GameCenterRequestGameStatusEvent.class);
        Emulator.getGameServer().getPacketManager().registerHandler(Incoming.GameCenterRequestAccountStatusEvent, to.ares.gamecenter.messages.incoming.gamecenter.GameCenterRequestAccountStatusEvent.class);

        // SnowWar Packets
        Emulator.getGameServer().getPacketManager().registerHandler(to.ares.gamecenter.messages.incoming.Incoming.UNKNOWN_SNOWSTORM_6009, CheckGameDirectoryStatusParser.class);
        Emulator.getGameServer().getPacketManager().registerHandler(to.ares.gamecenter.messages.incoming.Incoming.UNKNOWN_SNOWSTORM_6016, LoadStageReadyParser.class);
        Emulator.getGameServer().getPacketManager().registerHandler(to.ares.gamecenter.messages.incoming.Incoming.UNKNOWN_SNOWSTORM_6022, SetUserMoveTargetParser.class);
        Emulator.getGameServer().getPacketManager().registerHandler(to.ares.gamecenter.messages.incoming.Incoming.UNKNOWN_SNOWSTORM_6025, RequestFullStatusUpdateParser.class);
        Emulator.getGameServer().getPacketManager().registerHandler(to.ares.gamecenter.messages.incoming.Incoming.UNKNOWN_SNOWSTORM_6015, ExitGameParser.class);
        Emulator.getGameServer().getPacketManager().registerHandler(to.ares.gamecenter.messages.incoming.Incoming.SnowStormJoinQueueEvent, LeaveGameParser.class);
        Emulator.getGameServer().getPacketManager().registerHandler(to.ares.gamecenter.messages.incoming.Incoming.UNKNOWN_SNOWSTORM_6023, ThrowSnowballAtHumanParser.class);
        Emulator.getGameServer().getPacketManager().registerHandler(to.ares.gamecenter.messages.incoming.Incoming.UNKNOWN_SNOWSTORM_6024, ThrowSnowballAtPositionParser.class);
        Emulator.getGameServer().getPacketManager().registerHandler(to.ares.gamecenter.messages.incoming.Incoming.UNKNOWN_SNOWSTORM_2502, GameChatParser.class);
        Emulator.getGameServer().getPacketManager().registerHandler(to.ares.gamecenter.messages.incoming.Incoming.SnowStormUserPickSnowballEvent, MakeSnowballParser.class);

        // Register Games
        GameManager.registerGame(FastFoodGame.class);
        GameManager.registerGame(SnowWarGame.class);

        LOGGER.info("[GameCenter] LOADED!");
    }

    @EventHandler
    public void onUserLoginEvent(UserLoginEvent e) {
        e.habbo.getClient().sendResponse(new GameCenterGameListComposer());
        SnowWar.PLAYERS.put(e.habbo.getHabboInfo().getId(), new SnowWarPlayer(e.habbo));
    }

    public void onUserDisconnectEvent(UserDisconnectEvent e) {
        if (!SnowWar.PLAYERS.containsKey(e.habbo.getHabboInfo().getId())) {
            return;
        }
        SnowWar.PLAYERS.remove(e.habbo.getHabboInfo().getId());
    }

    public boolean hasPermission(Habbo habbo, String s) {
        return false;
    }
}
