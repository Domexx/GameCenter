package to.ares.gamecenter;

import com.eu.habbo.Emulator;
import gnu.trove.map.hash.THashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Beny.
 */

public class GameManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(Emulator.class);

    private static THashMap<Integer, Game> games;
    private static int gameIdCounter = 1;

    public static void makeSet() {
        games = new THashMap<>();
    }

    public static Game getGameById(int gameId) {
        return games.get(gameId);
    }

    public Game getGameByCode(String code) {
        for(Game game : games.values()) {
            if(game.getCode().equals(code)) {
                return game;
            }
        }

        return null;
    }

    public static int getIdFromGame(Game game) {
        for(Integer gameId : games.keySet()) {
            if(games.get(gameId) == game) {
                return gameId;
            }
        }

        return -1;
    }

    public static void registerGame(Class<? extends Game> gameClass) {
        try {
            int gameId = gameIdCounter;
            Game game = gameClass.getDeclaredConstructor(int.class).newInstance(gameIdCounter);

            games.put(gameId, game);
            gameIdCounter++;

            LOGGER.info("[GameCenter] Game '" + gameClass.getSimpleName() + "' registered");
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            LOGGER.error("GameCenter", ex);
        }
    }

    public static List<Game> getGames() {
        return new ArrayList<>(games.values());
    }

}
