package to.ares.gamecenter.messages.outgoing.gamecenter;

import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import com.eu.habbo.messages.outgoing.Outgoing;

public class GameCenterAccountInfoComposer extends MessageComposer
{
    private final int gameId;
    private final int gamesLeft;
    private final int other;

    public GameCenterAccountInfoComposer(int gameId, int gamesLeft, int other)
    {
        this.gameId = gameId;
        this.gamesLeft = gamesLeft;
        this.other = other;
    }

    @Override
    public ServerMessage composeInternal()
    {
        this.response.init(Outgoing.GameCenterAccountInfoComposer);
        this.response.appendInt(this.gameId);
        this.response.appendInt(this.gamesLeft);
        this.response.appendInt(this.other);
        return this.response;
    }
}

