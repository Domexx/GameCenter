package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import com.eu.habbo.Emulator;
import to.ares.gamecenter.messages.outgoing.snowwar.Composer;
import to.ares.gamecenter.messages.outgoing.snowwar.MessageWriter;
import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import com.eu.habbo.messages.ServerMessage;
import to.ares.gamecenter.games.snowwar.events.*;

public class SerializeGameStatus {
    public static void parse(final ServerMessage msg, final SnowWarRoom arena, boolean isFull) {
        msg.appendInt(arena.turn);
        msg.appendInt(seed(arena.turn) + arena.checksum);

        msg.appendInt(1);
        {
            msg.appendInt(arena.gameEvents.size());
            for (BaseEvent evt : arena.gameEvents) {
                msg.appendInt(evt.eventType); // Event Type

                Emulator.getLogging().logDebugLine(evt.eventType);

                switch (evt.eventType) {
                    case BaseEvent.PLAYERLEFT:
                        SerializeGame2EventPlayerLeft.parse(msg, (PlayerLeftEvent) evt);
                        break;
                    case BaseEvent.MOVE:
                        SerializeGame2EventMove.parse(msg, (UserMoveEvent) evt);
                        break;
                    case BaseEvent.MAKESNOWBALL:
                        SerializeGame2EventPickSnowBall.parse(msg, (MakeSnowBallEvent) evt);
                        break;
                    case BaseEvent.CREATESNOWBALL:
                        SerializeGame2EventCreateSnowBall.parse(msg, (CreateSnowBallEvent) evt);
                        break;
                    case BaseEvent.BALLTHROWPOSITION:
                        SerializeGame2EventBallThrowToPosition.parse(msg, (BallThrowToPositionEvent) evt);
                        break;
                    case BaseEvent.BALLTHROWHUMAN:
                        SerializeGame2EventBallThrowToHuman.parse(msg, (BallThrowToHumanEvent) evt);
                        break;
                    case BaseEvent.PICKBALLFROMGAMEITEM:
                        SerializeGame2EventPickBallFromGameItem.parse(msg, (PickBallEvent) evt);
                        break;
                    case BaseEvent.ADDBALLTOMACHINE:
                        SerializeGame2EventAddBallToMachine.parse(msg, (AddBallEvent) evt);
                        break;
                    default:  throw new UnsupportedOperationException("Not yet implemented");
                }

                if (!isFull) {
                    evt.onApply();
                }
            }
        }
    }

    public static void parseNew(final MessageWriter ClientMessage, final SnowWarRoom arena, boolean isFull) {
        int i = 0;

        Composer.add(arena.turn, ClientMessage);
        Composer.add(seed(arena.turn) + arena.checksum, ClientMessage);

        Composer.add(1, ClientMessage);
        {
            Composer.add(ClientMessage.setSaved(0), ClientMessage);
            for(final BaseEvent evt : arena.gameEvents) {
                Composer.add(evt.eventType, ClientMessage); // Event Type

                switch (evt.eventType) {
                    case BaseEvent.PLAYERLEFT:
                        SerializeGame2EventPlayerLeft.parse(ClientMessage, (PlayerLeftEvent) evt);
                        break;
                    case BaseEvent.MOVE:
                        SerializeGame2EventMove.parse(ClientMessage, (UserMoveEvent) evt);
                        break;
                    case BaseEvent.MAKESNOWBALL:
                        SerializeGame2EventPickSnowBall.parse(ClientMessage, (MakeSnowBallEvent) evt);
                        break;
                    case BaseEvent.CREATESNOWBALL:
                        SerializeGame2EventCreateSnowBall.parse(ClientMessage, (CreateSnowBallEvent) evt);
                        break;
                    case BaseEvent.BALLTHROWPOSITION:
                        SerializeGame2EventBallThrowToPosition.parse(ClientMessage, (BallThrowToPositionEvent) evt);
                        break;
                    case BaseEvent.BALLTHROWHUMAN:
                        SerializeGame2EventBallThrowToHuman.parse(ClientMessage, (BallThrowToHumanEvent) evt);
                        break;
                    case BaseEvent.PICKBALLFROMGAMEITEM:
                        SerializeGame2EventPickBallFromGameItem.parse(ClientMessage, (PickBallEvent) evt);
                        break;
                    case BaseEvent.ADDBALLTOMACHINE:
                        SerializeGame2EventAddBallToMachine.parse(ClientMessage, (AddBallEvent) evt);
                        break;
                    default:  throw new UnsupportedOperationException("Not yet implemented");
                }

                if(!isFull) {
                    evt.onApply();
                }

                i++;
            }

            ClientMessage.writeSaved(i);
        }
    }

    public static int seed(int turn) {
        int k;
        if (turn == 0) {
            turn = -1;
        }
        k = turn << 13;
        turn = turn ^ k;
        k = turn >> 17;
        turn = turn ^ k;
        k = turn << 5;
        turn = turn ^ k;
        return turn;
    }
}
