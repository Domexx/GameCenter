package to.ares.gamecenter.messages.incoming.gamecenter;

import com.eu.habbo.messages.incoming.MessageHandler;
import to.ares.gamecenter.games.Game;
import to.ares.gamecenter.games.GameManager;
import to.ares.gamecenter.messages.outgoing.gamecenter.GameCenterAccountInfoComposer;

public class GameCenterRequestAccountStatusEvent extends MessageHandler {
    @Override
    public void handle() throws Exception {
        int gameId = this.packet.readInt();
        Game game = GameManager.getGame(gameId);

        if(game != null) {
            this.client.sendResponse(new GameCenterAccountInfoComposer(gameId, game.getGamesLeft(this.client.getHabbo()), 0));
        }

    }
}
