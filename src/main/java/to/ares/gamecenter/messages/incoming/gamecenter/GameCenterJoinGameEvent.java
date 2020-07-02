package to.ares.gamecenter.messages.incoming.gamecenter;

import com.eu.habbo.messages.incoming.MessageHandler;
import to.ares.gamecenter.games.Game;
import to.ares.gamecenter.games.GameManager;

public class GameCenterJoinGameEvent extends MessageHandler {
    @Override
    public void handle() throws Exception {
        int gameId = this.packet.readInt();

        Game game = GameManager.getGame(gameId);

        if(game != null) {
            game.onPlay(gameId, this.client.getHabbo());
        }

    }
}