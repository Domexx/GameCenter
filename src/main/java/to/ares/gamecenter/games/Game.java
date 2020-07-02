package to.ares.gamecenter.games;

import com.eu.habbo.Emulator;
import com.eu.habbo.habbohotel.users.Habbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Game {
    public final Logger LOGGER = LoggerFactory.getLogger(Emulator.class);
    private int gameId;

    public Game(int gameId) {
        this.gameId = gameId;
    }

    public int getGameId() {
        return this.gameId;
    }

    public abstract void onPlay(int gameId, Habbo habbo);
    public abstract String getCode();
    public abstract String getBackgroundColor();
    public abstract String getTextColor();
    public abstract String getAssets();
    public abstract boolean getStatus();
    public abstract int getGamesLeft(Habbo habbo);
}
