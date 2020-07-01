package to.ares.gamecenter.messages.incoming.gamecenter;

import com.eu.habbo.messages.ClientMessage;
import to.ares.gamecenter.Game;
import to.ares.gamecenter.GameManager;
import com.eu.habbo.messages.incoming.MessageHandler;

public class GameCenterJoinGameEvent extends MessageHandler {
    @Override
    public void handle() throws Exception {
        ClientMessage originalPacket = this.packet.clone();

        int gameId = this.packet.readInt();

        Game game = GameManager.getGameById(gameId);

        if(game != null) {
            game.onPlay(gameId, this.client.getHabbo());
        }

    }
}