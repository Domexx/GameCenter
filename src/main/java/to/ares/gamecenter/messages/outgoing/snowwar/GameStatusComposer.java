package to.ares.gamecenter.messages.outgoing.snowwar;

import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;
import to.ares.gamecenter.messages.outgoing.snowwar.parse.SerializeGameStatus;

public class GameStatusComposer extends MessageComposer {

    public final static MessageWriter compose(SnowWarRoom arena) {
        final MessageWriter ClientMessage = new MessageWriter(100 + (arena.gameEvents.size() * 50));

        Composer.initPacket(5015, ClientMessage);
        SerializeGameStatus.parseNew(ClientMessage, arena, false);
        Composer.endPacket(ClientMessage);

        return ClientMessage;
    }

    private final SnowWarRoom arena;

    public GameStatusComposer(final SnowWarRoom arena) {
        this.arena = arena;
    }

    @Override
    public ServerMessage composeInternal()
    {
        this.response.init(5015);
        SerializeGameStatus.parse(this.response, arena, false);
        return this.response;
    }


}
