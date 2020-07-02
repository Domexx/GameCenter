package to.ares.gamecenter.games.snowwar.player;

import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.events.*;
import to.ares.gamecenter.games.snowwar.objects.BaseObject;
import to.ares.gamecenter.games.snowwar.objects.HumanObject;
import to.ares.gamecenter.games.snowwar.objects.SnowBallObject;
import to.ares.gamecenter.games.snowwar.room.pathfinding.Tile;
import com.eu.habbo.habbohotel.users.Habbo;

public class SnowWarPlayer {
    private Habbo player;

    private SnowWarRoom snowRoom;
    private HumanObject humanObject;

    private int snowLevel;
    private int pointsNeed;

    private int rank;
    private int score;

    public SnowWarPlayer(Habbo habbo) {
        player = habbo;
        snowLevel = 1;
        rank = 1;
        score = 10;
        pointsNeed = 100;
    }

    public void userLeft() {
        if (humanObject != null && snowRoom != null) {
            SnowPlayerQueue.playerExit(snowRoom, humanObject);
        }
    }

    public void makeSnowBall() {
        synchronized (snowRoom.gameEvents) {
            snowRoom.gameEvents.add(new MakeSnowBallEvent(humanObject));
        }
    }

    public void playerMove(int x, int y) {
        synchronized (snowRoom.gameEvents) {
            snowRoom.gameEvents.add(new UserMoveEvent(humanObject, x, y));
        }
    }

    //TODO: make SnowBallGameObject Array
    public void throwSnowballFlood(int destX, int destY) {
        final SnowBallObject ball = new SnowBallObject(snowRoom);
        ball.objectId = snowRoom.objectIdCounter++;

        final SnowBallObject ball1 = new SnowBallObject(snowRoom);
        ball1.objectId = snowRoom.objectIdCounter++;

        final SnowBallObject ball2 = new SnowBallObject(snowRoom);
        ball2.objectId = snowRoom.objectIdCounter++;

        final SnowBallObject ball3 = new SnowBallObject(snowRoom);
        ball3.objectId = snowRoom.objectIdCounter++;

        final SnowBallObject ball4 = new SnowBallObject(snowRoom);
        ball4.objectId = snowRoom.objectIdCounter++;

        final SnowBallObject ball5 = new SnowBallObject(snowRoom);
        ball5.objectId = snowRoom.objectIdCounter++;

        final SnowBallObject ball6 = new SnowBallObject(snowRoom);
        ball6.objectId = snowRoom.objectIdCounter++;

        synchronized (snowRoom.gameEvents) {
            snowRoom.gameEvents.add(new BallThrowToPositionEvent(humanObject, destX * Tile.TILE_SIZE, destY * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBallEvent(ball, humanObject, destX * Tile.TILE_SIZE, destY * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBallEvent(ball4, humanObject, destX * Tile.TILE_SIZE, (destY + 1) * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBallEvent(ball1, humanObject, (destX + 1) * Tile.TILE_SIZE, destY * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBallEvent(ball6, humanObject, (destX - 1) * Tile.TILE_SIZE, (destY + 1) * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBallEvent(ball2, humanObject, (destX - 1) * Tile.TILE_SIZE, (destY - 1) * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBallEvent(ball3, humanObject, (destX + 1) * Tile.TILE_SIZE, (destY - 1) * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBallEvent(ball5, humanObject, (destX + 1) * Tile.TILE_SIZE, (destY + 1) * Tile.TILE_SIZE, 3));
        }
    }

    public void throwSnowballAtHuman(int victim, int type) {
        if (!humanObject.canThrowSnowBall()) {
            return;
        }

        final BaseObject vict = snowRoom.gameObjects.get(victim);

        if (vict == null) {
            return;
        }

        final SnowBallObject ball = new SnowBallObject(snowRoom);
        ball.objectId = snowRoom.objectIdCounter++;

        synchronized (snowRoom.gameEvents) {
            snowRoom.gameEvents.add(new CreateSnowBallEvent(ball, humanObject, vict.location3D().x(), vict.location3D().y(), type));
            snowRoom.gameEvents.add(new BallThrowToHumanEvent(humanObject, (HumanObject) vict, 0));
        }
    }

    public void throwSnowballAtPosition(int destX, int destY, int type) {
        if (!humanObject.canThrowSnowBall()) {
            return;
        }

        final SnowBallObject ball = new SnowBallObject(snowRoom);
        ball.objectId = snowRoom.objectIdCounter++;

        synchronized (snowRoom.gameEvents) {
            snowRoom.gameEvents.add(new CreateSnowBallEvent(ball, humanObject, destX, destY, type));
            snowRoom.gameEvents.add(new BallThrowToPositionEvent(humanObject, destX, destY, 0));
        }
    }

    public Habbo getPlayer() {
        return this.player;
    }

    public SnowWarRoom getSnowRoom() {
        return this.snowRoom;
    }

    public HumanObject getHumanObject() {
        return this.humanObject;
    }

    public int getLevel() {
        return this.snowLevel;
    }

    public int getPointsNeed() {
        return this.pointsNeed;
    }

    public int getRank() {
        return this.rank;
    }

    public int getScore() {
        return this.score;
    }

    public void setHumanObject(HumanObject humanGameObject) {
        if (humanGameObject == null) {
            humanObject.snowWarPlayer = null;
            humanObject.cn = null;
            humanObject.userId = 0;
            humanObject = null;
        } else {
            humanObject = humanGameObject;
            humanObject.snowWarPlayer = this;

            humanObject.cn = player.getClient();
            humanObject.userId = player.getHabboInfo().getId();
            humanObject.userName = player.getHabboInfo().getUsername();
            humanObject.look = player.getHabboInfo().getLook();
            humanObject.motto = player.getHabboInfo().getMotto();
            humanObject.sex = player.getHabboInfo().getGender().toString();
        }
    }

    public void setRoom(SnowWarRoom room) {
        snowRoom = room;
        humanObject.currentSnowWar = room;
    }
}
