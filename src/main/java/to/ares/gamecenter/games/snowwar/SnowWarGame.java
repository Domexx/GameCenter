package to.ares.gamecenter.games.snowwar;

import com.eu.habbo.Emulator;
import com.eu.habbo.habbohotel.users.Habbo;
import to.ares.gamecenter.Game;

public class SnowWarGame extends Game {
    public SnowWarGame(int gameId) {
        super(gameId);
    }

    @Override
    public String getCode() {
        return "snowwar";
    }

    @Override
    public String getBackgroundColor() {
        return "93d4f3";
    }

    @Override
    public String getTextColor() {
        return "";
    }

    @Override
    public String getAssetPath() {
        return Emulator.getConfig().getValue("gamecenter.snowwar.assets");
    }

    @Override
    public Boolean getStatus() {
        return Emulator.getConfig().getBoolean("gamecenter.snowwar.enabled");
    }

    // TODO: we could add games left to users?
    @Override
    public int getGamesLeftCount(Habbo habbo) {
        return 3;
    }

    @Override
    public void onPlay(int gameId, Habbo habbo) {
        SnowPlayerQueue.addPlayerInQueue(habbo.getClient());
    }
}
