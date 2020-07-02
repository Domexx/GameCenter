package to.ares.gamecenter.messages.outgoing.gamecenter;

import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import com.eu.habbo.messages.outgoing.Outgoing;
import to.ares.gamecenter.games.Game;
import to.ares.gamecenter.games.GameManager;

import java.util.List;

public class GameCenterGameListComposer extends MessageComposer {
    @Override
    public ServerMessage composeInternal() {
        List<Game> games = GameManager.getGames();

        this.response.init(Outgoing.GameCenterGameListComposer);
        this.response.appendInt(games.size());

        for(Game game : games) {
            this.response.appendInt(GameManager.getIdFromGame(game));
            this.response.appendString(game.getCode());
            this.response.appendString(game.getBackgroundColor());
            this.response.appendString(game.getTextColor());
            this.response.appendString(game.getAssets());
            this.response.appendString("");
        }

        return this.response;
    }
}