package to.ares.gamecenter.messages.outgoing.gamecenter;

import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import com.eu.habbo.messages.outgoing.Outgoing;

public class GameCenterGameFrameURLComposer extends MessageComposer {
    private final String url;
    private final int gameId;

    public GameCenterGameFrameURLComposer(String url, int gameId) {
        this.url = url;
        this.gameId = gameId;
    }

    @Override
    public ServerMessage composeInternal()
    {
        this.response.init(Outgoing.BaseJumpLoadGameURLComposer);
        this.response.appendInt(this.gameId);
        this.response.appendString("1351418858673");
        this.response.appendString(this.url);
        return this.response;
    }

}
