package to.ares.gamecenter.games.snowwar;

import to.ares.gamecenter.games.snowwar.events.*;
import to.ares.gamecenter.games.snowwar.objects.GameItemObject;
import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import to.ares.gamecenter.games.snowwar.objects.SnowBallGameObject;
import to.ares.gamecenter.games.snowwar.pathfinding.Tile;
import com.eu.habbo.habbohotel.users.Habbo;

public class SnowWarPlayer {
    private Habbo player;

    private SnowWarRoom snowRoom;
    private HumanGameObject humanObject;

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

    public Habbo getPlayer() {
        return this.player;
    }

    public SnowWarRoom getSnowRoom() {
        return this.snowRoom;
    }

    public HumanGameObject getHumanObject() {
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

    public void setHumanObject(HumanGameObject humanGameObject) {
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

    public void userLeft() {
        if (humanObject != null && snowRoom != null) {
            SnowPlayerQueue.playerExit(snowRoom, humanObject);
        }
    }

    public void makeSnowBall() {
        synchronized (snowRoom.gameEvents) {
            snowRoom.gameEvents.add(new MakeSnowBall(humanObject));
        }
    }

    public void playerMove(int x, int y) {
        synchronized (snowRoom.gameEvents) {
            snowRoom.gameEvents.add(new UserMove(humanObject, x, y));
        }
    }

    //TODO: make SnowBallGameObject Array
    public void throwSnowballFlood(int destX, int destY) {
        final SnowBallGameObject ball = new SnowBallGameObject(snowRoom);
        ball.objectId = snowRoom.objectIdCounter++;

        final SnowBallGameObject ball1 = new SnowBallGameObject(snowRoom);
        ball1.objectId = snowRoom.objectIdCounter++;

        final SnowBallGameObject ball2 = new SnowBallGameObject(snowRoom);
        ball2.objectId = snowRoom.objectIdCounter++;

        final SnowBallGameObject ball3 = new SnowBallGameObject(snowRoom);
        ball3.objectId = snowRoom.objectIdCounter++;

        final SnowBallGameObject ball4 = new SnowBallGameObject(snowRoom);
        ball4.objectId = snowRoom.objectIdCounter++;

        final SnowBallGameObject ball5 = new SnowBallGameObject(snowRoom);
        ball5.objectId = snowRoom.objectIdCounter++;

        final SnowBallGameObject ball6 = new SnowBallGameObject(snowRoom);
        ball6.objectId = snowRoom.objectIdCounter++;

        synchronized (snowRoom.gameEvents) {
            snowRoom.gameEvents.add(new BallThrowToPosition(humanObject, destX * Tile.TILE_SIZE, destY * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBall(ball, humanObject, destX * Tile.TILE_SIZE, destY * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBall(ball4, humanObject, destX * Tile.TILE_SIZE, (destY + 1) * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBall(ball1, humanObject, (destX + 1) * Tile.TILE_SIZE, destY * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBall(ball6, humanObject, (destX - 1) * Tile.TILE_SIZE, (destY + 1) * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBall(ball2, humanObject, (destX - 1) * Tile.TILE_SIZE, (destY - 1) * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBall(ball3, humanObject, (destX + 1) * Tile.TILE_SIZE, (destY - 1) * Tile.TILE_SIZE, 3));
            snowRoom.gameEvents.add(new CreateSnowBall(ball5, humanObject, (destX + 1) * Tile.TILE_SIZE, (destY + 1) * Tile.TILE_SIZE, 3));
        }
    }

    public void throwSnowballAtHuman(int victim, int type) {
        if (!humanObject.canThrowSnowBall()) {
            return;
        }

        final GameItemObject vict = snowRoom.gameObjects.get(victim);

        if (vict == null) {
            return;
        }

        final SnowBallGameObject ball = new SnowBallGameObject(snowRoom);
        ball.objectId = snowRoom.objectIdCounter++;

        synchronized (snowRoom.gameEvents) {
            snowRoom.gameEvents.add(new CreateSnowBall(ball, humanObject, vict.location3D().x(), vict.location3D().y(), type));
            snowRoom.gameEvents.add(new BallThrowToHuman(humanObject, (HumanGameObject) vict, 0));
        }
    }

    public void throwSnowballAtPosition(int destX, int destY, int type) {
        if (!humanObject.canThrowSnowBall()) {
            return;
        }

        final SnowBallGameObject ball = new SnowBallGameObject(snowRoom);
        ball.objectId = snowRoom.objectIdCounter++;

        synchronized (snowRoom.gameEvents) {
            snowRoom.gameEvents.add(new CreateSnowBall(ball, humanObject, destX, destY, type));
            snowRoom.gameEvents.add(new BallThrowToPosition(humanObject, destX, destY, 0));
        }
    }
}
