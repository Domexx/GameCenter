package to.ares.gamecenter.messages.incoming.gamecenter;

import com.eu.habbo.messages.incoming.MessageHandler;
import com.eu.habbo.messages.outgoing.gamecenter.GameCenterGameComposer;
import to.ares.gamecenter.games.Game;
import to.ares.gamecenter.games.GameManager;

public class GameCenterRequestGameStatusEvent extends MessageHandler
{
    @Override
    public void handle() throws Exception {
        int gameId = this.packet.readInt();
        Game game = GameManager.getGame(gameId);

        if(game != null) {
            this.client.sendResponse(new GameCenterGameComposer(gameId, game.getStatus() ? GameCenterGameComposer.OK : GameCenterGameComposer.ERROR));
        }
    }
}

