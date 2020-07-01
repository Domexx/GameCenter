package to.ares.gamecenter.messages.incoming.gamecenter;

import com.eu.habbo.messages.incoming.MessageHandler;
import to.ares.gamecenter.Game;
import to.ares.gamecenter.GameManager;
import to.ares.gamecenter.messages.outgoing.gamecenter.GameCenterAccountInfoComposer;

public class GameCenterRequestAccountStatusEvent extends MessageHandler {
    @Override
    public void handle() throws Exception {
        int gameId = this.packet.readInt();
        Game game = GameManager.getGameById(gameId);

        if(game != null) {
            this.client.sendResponse(new GameCenterAccountInfoComposer(gameId, game.getGamesLeftCount(this.client.getHabbo()), 0));
        }

    }
}
