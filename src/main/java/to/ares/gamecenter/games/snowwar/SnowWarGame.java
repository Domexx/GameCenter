package to.ares.gamecenter.games.snowwar;

import com.eu.habbo.Emulator;
import com.eu.habbo.habbohotel.users.Habbo;
import to.ares.gamecenter.games.Game;

public class SnowWarGame extends Game {
    public SnowWarGame(int gameId) {
        super(gameId);
    }

    @Override
    public void onPlay(int gameId, Habbo habbo) {
        SnowPlayerQueue.addPlayerInQueue(habbo.getClient());
    }

    @Override
    public String getCode() {
        return "snowwar";
    }

    @Override
    public String getBackgroundColor() {
        return Emulator.getConfig().getValue("gamecenter.snowwar.game.background.color", "93d4f3");
    }

    @Override
    public String getTextColor() {
        return Emulator.getConfig().getValue("gamecenter.snowwar.game.text.color", "000000");
    }

    @Override
    public String getAssets() {
        return Emulator.getConfig().getValue("gamecenter.snowwar.assets");
    }

    @Override
    public boolean getStatus() {
        return Emulator.getConfig().getBoolean("gamecenter.snowwar.enabled", false);
    }

    @Override
    public int getGamesLeft(Habbo habbo) {
        return 3;
    }
}
