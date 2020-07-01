package to.ares.gamecenter.messages.outgoing.snowwar;

import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeGame2GameObjects;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeGameStatus;

public class FullGameStatusComposer extends MessageComposer
{
    private final SnowWarRoom arena;

    public FullGameStatusComposer(final SnowWarRoom arena)
    {
        this.arena = arena;
    }

    @Override
    public ServerMessage composeInternal()
    {
        this.response.init(5016);
        this.response.appendInt(0); // not used
        this.response.appendInt(0); // not used
        this.response.appendInt(0); // not used
        SerializeGame2GameObjects.parse(this.response, arena);
        this.response.appendInt(0); // not used
        this.response.appendInt(SnowWar.TEAMS.length);
        SerializeGameStatus.parse(this.response, arena, true);
        return this.response;
    }
}
