package to.ares.gamecenter.games;

import com.eu.habbo.habbohotel.users.Habbo;

public abstract class Game {
    private int gameId;

    public Game(int gameId) {
        this.gameId = gameId;
    }

    public abstract void onPlay(int gameId, Habbo habbo);

    public abstract String getCode();
    public abstract String getBackgroundColor();
    public abstract String getTextColor();
    public abstract String getAssets();
    public abstract boolean getStatus();
    public abstract int getGamesLeft();
}
