package to.ares.gamecenter.games.snowwar.objects;

import to.ares.gamecenter.games.snowwar.*;
import to.ares.gamecenter.games.snowwar.events.PickBallFromGameItem;
import com.eu.habbo.habbohotel.gameclients.GameClient;
import to.ares.gamecenter.util.MathUtil;
import to.ares.gamecenter.util.RandomInteger;
import to.ares.gamecenter.games.snowwar.pathfinding.*;

import java.util.List;

public class HumanGameObject extends GameItemObject {
    public static final int _302 = 534;
    public static final int MAX_HEALTH = 5;
    public static final int MAX_SNOWBALLS = 5;
    public static final int PICKUPBALL_TIME = 20;
    public static final int RESPAWNING_TIME = 100;
    public static final int NODAMAGE_TIME = 60;
    public static final int STATUS_NORMAL = 0;
    public static final int STATUS_PICKUPBALL = 1;
    public static final int STATUS_RESPAWNING = 2;
    public static final int STATUS_NODAMAGE = 3;
    public static final int BALLTHROW_FIRERATE = 5;
    public static final int[] boundingData = new int[]{1600};
    public static final int collisionHeight = 5000;
    private static final int SCORE_KILL = 5;
    private static final int SCORE_HIT = 1;


    public SnowWarRoom currentSnowWar;
    public SnowWarPlayer snowWarPlayer;
    public GameClient cn;

    // playerData
    public int userId;
    public String userName;
    public String look;
    public String motto;
    public String sex;

    public int hits;
    public int kills;
    public int score;
    public int status;

    public int team;


    private final PlayerTile currentLocation;
    private final PlayerTile moveTarget;
    public Direction8 humanDir;

    public Tile currentTile;
    private Tile nextTile;
    private int health = MAX_HEALTH;
    private int snowBalls = MAX_SNOWBALLS;

    protected int unused;
    private int taskTime;
    private int currentStatus;

    private int fireRateLimiter;
    private int pickUpLimiter;


    public boolean stageLoaded;

    public HumanGameObject(SnowWarRoom room, int teamId) {
        super(19);

        currentSnowWar = room;

        currentLocation = new PlayerTile(0, 0, 0);
        moveTarget = new PlayerTile(0, 0, 0);
        humanDir = Direction8.SE;

        team = teamId;

        SpawnPoint spawn;
        if (teamId == 1) {
            final int i = RandomInteger.getRandomNumber(0, currentSnowWar.arenaType.spawnsBlue.size() - 1);
            spawn = currentSnowWar.arenaType.spawnsBlue.get(i);
        } else {
            final int i = RandomInteger.getRandomNumber(0, currentSnowWar.arenaType.spawnsRed.size() - 1);
            spawn = currentSnowWar.arenaType.spawnsRed.get(i);
        }

        currentTile = currentSnowWar.map.getTile(spawn.x, spawn.y);

        currentTile._1tH(this);
        currentLocation.setXYZ(currentTile.location());
        moveTarget.setXYZ(currentTile.location());
    }

    public void cleanData() {
        snowWarPlayer.setRoom(null);
        snowWarPlayer.setHumanObject(null);
    }

    public void setCurLocation(int x, int y) {
        currentSnowWar.checksum += (x * 3) - (getVariable(2) * 3);
        currentSnowWar.checksum += (y * 4) - (getVariable(3) * 4);
        currentLocation.setXY(x, y);
    }

    public void setCurLocation(PlayerTile val) {
        currentSnowWar.checksum += (val.x() * 3) - (getVariable(2) * 3);
        currentSnowWar.checksum += (val.y() * 4) - (getVariable(3) * 4);
        currentLocation.setXYZ(val);
    }

    public void setCurrentTile(Tile val) {
        currentSnowWar.checksum += (val._4gH[0] * 5) - (getVariable(4) * 5);
        currentSnowWar.checksum += (val._4gH[1] * 6) - (getVariable(5) * 6);
        if (nextTile == null) {
            currentSnowWar.checksum += (val._4gH[0] * 13) - (getVariable(12) * 13);
            currentSnowWar.checksum += (val._4gH[1] * 14) - (getVariable(13) * 14);
        }
        currentTile = val;
    }

    public void setTaskTime(int val) {
        currentSnowWar.checksum += (val * 11) - (getVariable(10) * 11);
        taskTime = val;
    }

    public void setNextTile(Tile val) {
        if (nextTile != null) {
            if (val == null) {
                currentSnowWar.checksum -= (currentTile._4gH[0] * 13) - (getVariable(12) * 13);
                currentSnowWar.checksum -= (currentTile._4gH[1] * 14) - (getVariable(13) * 14);
            } else {
                currentSnowWar.checksum += (val._4gH[0] * 13) - (getVariable(12) * 13);
                currentSnowWar.checksum += (val._4gH[1] * 14) - (getVariable(13) * 14);
            }
        } else if (val != null) {
            currentSnowWar.checksum += (val._4gH[0] * 13) - (getVariable(12) * 13);
            currentSnowWar.checksum += (val._4gH[1] * 14) - (getVariable(13) * 14);
        }

        nextTile = val;
    }

    public void setRot(Direction8 val) {
        currentSnowWar.checksum += (val.getRot() * 7) - (getVariable(6) * 7);
        humanDir = val;
    }

    public void setHealth(int val) {
        currentSnowWar.checksum += (val * 8) - (getVariable(7) * 8);
        health = val;
    }

    public void setSnowBalls(int val) {
        currentSnowWar.checksum += (val * 9) - (getVariable(8) * 9);
        snowBalls = val;
    }

    public void setCurrentStatus(int val) {
        currentSnowWar.checksum += (val * 12) - (getVariable(11) * 12);
        currentStatus = val;
    }

    public void setMoveTarget(int x, int y) {
        currentSnowWar.checksum += (x * 15) - (getVariable(14) * 15);
        currentSnowWar.checksum += (y * 16) - (getVariable(15) * 16);
        moveTarget.setXY(x, y);
    }

    public void setMoveTarget(PlayerTile val) {
        currentSnowWar.checksum += (val.x() * 15) - (getVariable(14) * 15);
        currentSnowWar.checksum += (val.y() * 16) - (getVariable(15) * 16);
        moveTarget.setXYZ(val);
    }

    public void setScore(final int val) {
        currentSnowWar.checksum += (val * 17) - (getVariable(16) * 17);
        score = val;
    }

    public void setTeam(final int val) {
        currentSnowWar.checksum += (val * 18) - (getVariable(17) * 18);
        team = val;
    }

    @Override
    public int getVariable(int var) {
        if (var == 0) {
            return HUMAN;
        }
        if (var == 1) {
            return (objectId);
        }
        if (var == 2) {
            return (currentLocation.x());
        }
        if (var == 3) {
            return (currentLocation.y());
        }
        if (var == 4) {
            return (currentTile._4gH[0]);
        }
        if (var == 5) {
            return (currentTile._4gH[1]);
        }
        if (var == 6) {
            return (humanDir.getRot());
        }
        if (var == 7) {
            return (health);
        }
        if (var == 8) {
            return (snowBalls);
        }
        if (var == 9) {
            return (unused);
        }
        if (var == 10) {
            return (taskTime);
        }
        if (var == 11) {
            return (currentStatus);
        }
        if (var == 12) {
            return (nextTile != null ? nextTile._4gH[0] : currentTile._4gH[0]);
        }
        if (var == 13) {
            return (nextTile != null ? nextTile._4gH[1] : currentTile._4gH[1]);
        }
        if (var == 14) {
            return (moveTarget.x());
        }
        if (var == 15) {
            return (moveTarget.y());
        }
        if (var == 16) {
            return (score);
        }
        if (var == 17) {
            return (team);
        }

        //TODO: Falls nicht klappt, ändern weil es wurde nur userId returned
        if (var == 18) {
            return userId;
        }

        return 0;
    }

    @Override
    public int[] boundingData() {
        return (boundingData);
    }

    @Override
    public PlayerTile location3D() {
        return (currentLocation);
    }

    @Override
    public Direction360 direction360() {
        return (null);
    }

    public void doCurrentTask() {
        if (currentStatus == STATUS_RESPAWNING) {
            setHealth(MAX_HEALTH);
            setCurrentStatus(STATUS_NODAMAGE);
            setTaskTime(NODAMAGE_TIME);
            return;
        }
        if (currentStatus == STATUS_PICKUPBALL) {
            setSnowBalls(snowBalls + 1);
        }
        setCurrentStatus(STATUS_NORMAL);
    }

    @Override
    public void subturn(SynchronizedGameStage unused) {
        if (taskTime > 0) {
            if (taskTime == 1) {
                doCurrentTask();
            }
            setTaskTime(taskTime - 1);
        }

        if (fireRateLimiter > 0) {
            fireRateLimiter--;
        }
        if (pickUpLimiter > 0) {
            pickUpLimiter--;
        }

        //Log.Print(data.id + " currentTile:" + currentTile + " nextTile:" + nextTile);

        if (canWalk() && currentTile != null) {
            if (nextTile != null) {
                //Log.Print(data.id + " Moving towards next tile:" + nextTile + " _currentLocation:" + currentLocation);
                doWalkSteep();
            } else {
                if (pickUpLimiter < 1) {
                    if (currentTile.pickBallsItem != null && currentTile.pickBallsItem.canPickUpFromHere()) {
                        currentTile.pickBallsItem.concurrentUses++;
                        pickUpLimiter = PICKUPBALL_TIME;
                        synchronized (currentSnowWar.gameEvents) {
                            currentSnowWar.gameEvents.add(new PickBallFromGameItem(this, currentTile.pickBallsItem));
                        }
                    }
                }

                if (!currentTile.isTooAway(moveTarget)) {
                    final int rot = Direction360.getRot(moveTarget.x() - currentTile.location().x(), moveTarget.y() - currentTile.location().y());
                    Direction8 direction = Direction360.direction360ValueToDirection8(rot);
                    setNextTile(currentTile.getNextTileAtRot(direction));
                    if (nextTile == null || !nextTile.isOpen(this)) {
                        if (nextTile != null && !nextTile.isOpen(this)) {
                            if (moveTarget.isSamePosition(nextTile.location())) {
                                setNextTile(null);
                                stopWalk();
                                return;
                            }
                        }
                        direction = direction.getDirectionAtRot(-1);
                        setNextTile(currentTile.getNextTileAtRot(direction));
                        if (nextTile == null || !nextTile.isOpen(this)) {
                            direction = direction.getDirectionAtRot(2);
                            setNextTile(currentTile.getNextTileAtRot(direction));
                            if (nextTile == null || !nextTile.isOpen(this)) {
                                setNextTile(null);
                                stopWalk();
                                return;
                            }
                        }
                    }
                    if (nextTile != null) {
                        currentTile._40T();
                        nextTile._1tH(this);
                        setRot(direction);
                        doWalkSteep();
                    }

                    //Log.Print(data.id + " Starting to move to next tile in direction360:" + local2 + ", nextTile is now " + nextTile + "_currentLocationn:" + currentLocation + ", moveTarget:" + moveTarget);
                }
            }
        }
    }

    public boolean canWalkTo(int walkX, int walkY) {
        if (!canWalk() || currentTile == null) {
            return false;
        }

        Tile localCurrent = currentTile;
        final PlayerTile localTarget = new PlayerTile(walkX, walkY, 0);

        Tile localNext;
        for (int i = 0; i < 50; i++) {
            final int rot = Direction360.getRot(localTarget.x() - localCurrent.location().x(), localTarget.y() - localCurrent.location().y());
            Direction8 direction = Direction360.direction360ValueToDirection8(rot);
            localNext = localCurrent.getNextTileAtRot(direction);
            if (localNext == null || !localNext.isOpen(this)) {
                if (localNext != null && !localNext.isOpen(this)) {
                    // goal reach
                    if (localTarget.isSamePosition(localNext.location())) {
                        return true;
                    }
                }
                direction = direction.getDirectionAtRot(-1);
                localNext = localCurrent.getNextTileAtRot(direction);
                if (localNext == null || !localNext.isOpen(this)) {
                    direction = direction.getDirectionAtRot(2);
                    localNext = localCurrent.getNextTileAtRot(direction);
                    if (localNext == null || !localNext.isOpen(this)) {
                        return false;
                    }
                }
            }

            localCurrent = localNext;
            localNext = null;

            // goal reach
            if (localCurrent.isTooAway(localTarget)) {
                return true;
            }
        }

        return false;
    }

    private void doFire() {
        int pow = 15;
		/*if(say.endsWith("hard")) {
			pow = 20;
		} else {
			pow = 15;
		}*/
        Tile tile = currentTile.getNextTileAtRot(humanDir);
        if (humanDir == Direction8.N || humanDir == Direction8.W) {
            tile = tile.getNextTileAtRot(humanDir);
        }

        if (tile == null) {
            return;
        }

        final List<GameFuseObject> items = tile.fuseObjects();
        if (items.size() == 1) {
            final GameFuseObject item = items.get(0);
            final Direction8 dir = Direction8.getDirection(item.Rot);
            if (dir == humanDir && item.baseItem.name.equals("ads_igorraygun")) {
                snowWarPlayer.throwSnowballFlood(item.X + (dir.getDiffX() * pow), item.Y + (dir.getDiffY() * pow));
            }
        }
    }

    public void cleanTiles() {
        if (currentTile != null && currentTile._05Z() == this) {
            currentTile._40T();
        }
        if (nextTile != null && nextTile._05Z() == this) {
            nextTile._40T();
        }
    }

    @Override
    public void onRemove() {
        cleanTiles();

        if (snowWarPlayer != null) {
            cleanData();
        }
    }

    private void doWalkSteep() {
        //Log.Print(((((_2v3 + " [MoveTowardsNextTile], currentX: ") + this._3Xu.x) + " currentY: ") + this._3Xu.y));
        final int local0 = nextTile.location().x();
        int local1 = currentLocation.x();
        final int local2 = (local1 - local0);
        if (local2 != 0) {
            if (local2 < 0) {
                if (local2 > -(_302)) {
                    local1 = local0;
                } else {
                    local1 = (local1 + _302);
                }
                ;
            } else {
                if (local2 < _302) {
                    local1 = local0;
                } else {
                    local1 = (local1 - _302);
                }
                ;
            }
            ;
        }
        ;
        final int local3 = nextTile.location().y();
        int local4 = currentLocation.y();
        final int local5 = (local4 - local3);
        if (local5 != 0) {
            if (local5 < 0) {
                if (local5 > -(_302)) {
                    local4 = local3;
                } else {
                    local4 = (local4 + _302);
                }
                ;
            } else {
                if (local5 < _302) {
                    local4 = local3;
                } else {
                    local4 = (local4 - _302);
                }
                ;
            }
            ;
        }
        ;
        //Log.Print(((((_2v3 + " [MoveTowardsNextTile], nextX: ") + local1) + " nextY: ") + local4));
        setCurLocation(local1, local4);

        if (currentLocation.distanceTo(nextTile.location()) < MathUtil._43Z((_302 / 2))) {
            if (moveTarget.isSamePosition(nextTile.location())) {
                doFire();
            }

            setCurrentTile(nextTile);
            setNextTile(null);
        }
    }

    public void setMove(int x, int y) {
        if (currentStatus == STATUS_PICKUPBALL) {
            setCurrentStatus(STATUS_NORMAL);
            setTaskTime(0);
        }
        if (currentStatus == STATUS_NORMAL || currentStatus == STATUS_NODAMAGE) {
            setMoveTarget(x, y);
        }
    }

    public void decrementHealth(HumanGameObject attacker, int rot) {
        if (team == attacker.team) {
            return;
        }

        if (health > 0) {
            if (health == 1) {
                doKill(rot);
                attacker.giveScorePerKill(this);
            }
            setHealth(health - 1);
        }
    }

    public void giveScorePerHit(HumanGameObject _arg2) {
        if (team != _arg2.team || SnowWar.TEAMS.length == 1) {
            hits++;
            giveScore(SCORE_HIT);
        }
        ;
    }

    public void giveScorePerKill(HumanGameObject _arg2) {
        if (team != _arg2.team || SnowWar.TEAMS.length == 1) {
            kills++;
            giveScore(SCORE_KILL);
        }
        ;
    }

    public void giveScore(int _arg2) {
        setScore(score + _arg2);
        currentSnowWar.teamScore[team - 1] += _arg2;
    }

    public void doKill(int _arg1) {
        setCurrentStatus(STATUS_RESPAWNING);
        setTaskTime(RESPAWNING_TIME);
        setRot(Direction360.direction360ValueToDirection8(_arg1).rotateDirection180Degrees());
        stopWalk();
    }

    public void stopWalk() {
        if (nextTile == null) {
            setMoveTarget(currentTile.location());
            setCurLocation(currentTile.location());
        } else {
            setCurrentTile(nextTile);
            setCurLocation(nextTile.location());
            setMoveTarget(nextTile.location());
            setNextTile(null);
        }
        ;
        //Log.Print(((((((((("Stopped. dir:" + this._1IO) + "_currentTilee:") + this._3TS) + "_nextTilee:") + this._3kY) + "_currentLocationn:") + this._3Xu) + "_moveTargett:") + this._1l0));
    }

    public boolean canThrowSnowBall() {
        return (snowBalls > 0 && fireRateLimiter < 1 && (currentStatus == STATUS_NORMAL || currentStatus == STATUS_NODAMAGE));
    }

    public void _w1() {
        fireRateLimiter = BALLTHROW_FIRERATE;
    }

    public boolean _vs(int victimX, int victimY) {
        if (snowBalls < 1) {
            return (false);
        }
        stopWalk();
        final int local2 = Direction360.getRot((victimX - currentLocation.x()), (victimY - currentLocation.y()));
        final int local3 = Direction360.direction360ValueToDirection8(local2).getRot();
        setRot(Direction8.getDirection(local3));
        //Log.Print(((((((((((("Turning to:" + local3) + " 360 value:") + local2) + " target:") + _arg1) + ",") + _arg2) + " location:") + this._3Xu.x) + ",") + this._3Xu.y));
        setSnowBalls(snowBalls - 1);
        return (true);
    }

    public boolean canWalk() {
        return (currentStatus == STATUS_NORMAL || currentStatus == STATUS_NODAMAGE);
    }

    public boolean canPickSnowBalls() {
        return ((currentStatus == STATUS_NORMAL || currentStatus == STATUS_NODAMAGE) && snowBalls < MAX_SNOWBALLS);
    }

    public void makeSnowBall() {
        if (canPickSnowBalls()) {
            setCurrentStatus(STATUS_PICKUPBALL);
            setTaskTime(PICKUPBALL_TIME);
            stopWalk();
        }
    }

    public int availableSnowBallSlots() {
        return MAX_SNOWBALLS - snowBalls;
    }

    public void addSnowBalls(int val) {
        setSnowBalls(snowBalls + val);
    }

    @Override
    public boolean testSnowBallCollision(SnowBallGameObject snowBall) {
        if (currentStatus == STATUS_RESPAWNING || currentStatus == STATUS_NODAMAGE || snowBall.getAttacker() == this) {
            return false;
        }
        return super.testSnowBallCollision(snowBall);
    }

    @Override
    public void onSnowBallHit(SnowBallGameObject snowBall) {
        final HumanGameObject attacker = snowBall.getAttacker();

        if(attacker != null) {
            decrementHealth(attacker, snowBall.direction360()._2Hq());
            attacker.giveScorePerHit(this);
        }
    }

    @Override
    public int collisionHeight() {
        return (collisionHeight);
    }
}