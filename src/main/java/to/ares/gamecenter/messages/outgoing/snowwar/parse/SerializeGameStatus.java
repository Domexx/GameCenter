package to.ares.gamecenter.messages.outgoing.snowwar.parse;

import com.eu.habbo.Emulator;
import to.ares.gamecenter.games.snowwar.Composer;
import to.ares.gamecenter.games.snowwar.MessageWriter;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import com.eu.habbo.messages.ServerMessage;
import to.ares.gamecenter.games.snowwar.events.*;

public class SerializeGameStatus {
    public static void parse(final ServerMessage msg, final SnowWarRoom arena, boolean isFull) {
        msg.appendInt(arena.turn);
        msg.appendInt(seed(arena.turn) + arena.checksum);

        msg.appendInt(1);
        {
            msg.appendInt(arena.gameEvents.size());
            for (Event evt : arena.gameEvents) {
                msg.appendInt(evt.eventType); // Event Type

                Emulator.getLogging().logDebugLine(evt.eventType);

                switch (evt.eventType) {
                    case Event.PLAYERLEFT:
                        SerializeGame2EventPlayerLeft.parse(msg, (PlayerLeft) evt);
                        break;
                    case Event.MOVE:
                        SerializeGame2EventMove.parse(msg, (UserMove) evt);
                        break;
                    case Event.MAKESNOWBALL:
                        SerializeGame2EventPickSnowBall.parse(msg, (MakeSnowBall) evt);
                        break;
                    case Event.CREATESNOWBALL:
                        SerializeGame2EventCreateSnowBall.parse(msg, (CreateSnowBall) evt);
                        break;
                    case Event.BALLTHROWPOSITION:
                        SerializeGame2EventBallThrowToPosition.parse(msg, (BallThrowToPosition) evt);
                        break;
                    case Event.BALLTHROWHUMAN:
                        SerializeGame2EventBallThrowToHuman.parse(msg, (BallThrowToHuman) evt);
                        break;
                    case Event.PICKBALLFROMGAMEITEM:
                        SerializeGame2EventPickBallFromGameItem.parse(msg, (PickBallFromGameItem) evt);
                        break;
                    case Event.ADDBALLTOMACHINE:
                        SerializeGame2EventAddBallToMachine.parse(msg, (AddBallToMachine) evt);
                        break;
                    default:  throw new UnsupportedOperationException("Not yet implemented");
                }

                if (!isFull) {
                    evt.apply();
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
            for(final Event evt : arena.gameEvents) {
                Composer.add(evt.eventType, ClientMessage); // Event Type

                switch (evt.eventType) {
                    case Event.PLAYERLEFT:
                        SerializeGame2EventPlayerLeft.parse(ClientMessage, (PlayerLeft) evt);
                        break;
                    case Event.MOVE:
                        SerializeGame2EventMove.parse(ClientMessage, (UserMove) evt);
                        break;
                    case Event.MAKESNOWBALL:
                        SerializeGame2EventPickSnowBall.parse(ClientMessage, (MakeSnowBall) evt);
                        break;
                    case Event.CREATESNOWBALL:
                        SerializeGame2EventCreateSnowBall.parse(ClientMessage, (CreateSnowBall) evt);
                        break;
                    case Event.BALLTHROWPOSITION:
                        SerializeGame2EventBallThrowToPosition.parse(ClientMessage, (BallThrowToPosition) evt);
                        break;
                    case Event.BALLTHROWHUMAN:
                        SerializeGame2EventBallThrowToHuman.parse(ClientMessage, (BallThrowToHuman) evt);
                        break;
                    case Event.PICKBALLFROMGAMEITEM:
                        SerializeGame2EventPickBallFromGameItem.parse(ClientMessage, (PickBallFromGameItem) evt);
                        break;
                    case Event.ADDBALLTOMACHINE:
                        SerializeGame2EventAddBallToMachine.parse(ClientMessage, (AddBallToMachine) evt);
                        break;
                    default:  throw new UnsupportedOperationException("Not yet implemented");
                }

                if(!isFull) {
                    evt.apply();
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
