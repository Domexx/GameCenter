package to.ares.gamecenter.games.snowwar.objects;

import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.SynchronizedGameStage;
import to.ares.gamecenter.util.MathUtil;
import to.ares.gamecenter.games.snowwar.pathfinding.*;

public class SnowBallGameObject extends GameItemObject {
    private static int _4s = 0;
    private static int _09I = 1;
    private static int _x2 = 2;

    private static int _2t9 = 3000;
    private static int _3uf = 60000;
    public static int _0Wg = 3;
    public static int _0Po = 15;

    public static int[] boundingData = new int[]{400};

	public SnowWarRoom currentSnowWar;

    private final PlayerTile currentLocation;
    private final Direction360 direction;
    private int launchType;
    private int speed;
    private int ttl;
    private HumanGameObject ballOwner;
    private int paraOffs;

    public SnowBallGameObject(final SnowWarRoom room){
    	super(11);
		currentSnowWar = room;
        currentLocation = new PlayerTile(0, 0, 0);
        direction = new Direction360(0);
    }

	private void setCurLocation(int x, int y, int z) {
		currentSnowWar.checksum += (x * 3) - (getVariable(2) * 3);
		currentSnowWar.checksum += (y * 4) - (getVariable(3) * 4);
		currentSnowWar.checksum += (z * 5) - (getVariable(4) * 5);
        currentLocation.setXYZ(x, y, z);
	}

    private void setTtl(int val) {
		currentSnowWar.checksum += (val * 8) - (getVariable(7) * 8);
        ttl = val;
	}

    private void setOwner(HumanGameObject val) {
		if(val == null) {
			currentSnowWar.checksum += (-1 * 9) - (getVariable(8) * 9);
		} else {
			currentSnowWar.checksum += (val.objectId * 9) - (getVariable(8) * 9);
		}
		ballOwner = val;
	}

    public void initialize(int x, int y, int type, int destX, int destY, HumanGameObject owner) {
        currentLocation.setXYZ(x, y, _2t9);

        int deltaX = (destX - x);
        int deltaY = (destY - y);
        deltaX = MathUtil._43Z((deltaX / 200));
        deltaY = MathUtil._43Z((deltaY / 200));
        direction._1ji(Direction360.getRot(deltaX, deltaY));

        int local7 = (SquareRoot.squareRoot((deltaX * deltaX) + (deltaY * deltaY)) * 200);
        launchType = type;
        getMoveType(type, local7);

        if (launchType == _4s){
            int _0v2 = 20000;
            int _2pR = 2000;
            ttl = (_0v2 / _2pR);
            speed = _2pR;
        } else {
            if (launchType == _09I){
                local7 = Math.min(local7, _3uf);
                double _tO = 0.000559;
                ttl = (int) (local7 * _tO);
                speed = ((ttl)==0) ? 0 : MathUtil._43Z((local7 / ttl));
            } else {
                if (launchType == _x2){
                    int _3Xd = 100000;
                    local7 = Math.min(local7, _3Xd);
                    double _1Zn = 0.000707213578500707;
                    ttl = (int) (local7 * _1Zn);
                    speed = ((ttl)==0) ? 0 : MathUtil._43Z((local7 / ttl));
                }
            }
        }
        paraOffs = MathUtil._43Z((ttl / 2));
        ballOwner = owner;
    }

    private void getMoveType(int _arg1,int _arg2){
        int TOPLAYER = 3;
        if (_arg1 == TOPLAYER){
            int _3uE = 42000;
            if (_arg2 <= _3uE){
                launchType = _4s;
            } else {
                if (_arg2 <= _3uf){
                    launchType = _09I;
                } else {
                    launchType = _x2;
                }
            }
        } else {
            launchType = _arg1;
        }
    }

    @Override
	public int getVariable(int val){
    	if(val == 0) {
            return SNOWBALL;
    	}
    	if(val == 1) {
            return objectId;
    	}
    	if(val == 2) {
            return currentLocation.x();
    	}
    	if(val == 3) {
            return currentLocation.y();
    	}
    	if(val == 4) {
            return currentLocation.z();
    	}
    	if(val == 5) {
            return direction._2Hq();
    	}
    	if(val == 6) {
            return launchType;
    	}
    	if(val == 7) {
            return ttl;
    	}
    	if(val == 8) {
            return ballOwner == null ? -1 : ballOwner.objectId;
    	}
    	if(val == 9) {
            return paraOffs;
    	}
    	//if(val == 10) {
            return speed;
    	//}
    }

    @Override
	public Direction360 direction360(){
        return (direction);
    }

    @Override
	public int[] boundingData(){
        return (boundingData);
    }

    @Override
	public PlayerTile location3D(){
        return (currentLocation);
    }

    @Override
    public void subturn(SynchronizedGameStage _arg1){
    	final SnowWarRoom local1 = ((SnowWarRoom)_arg1);

        if (!_active){
            return;
        }

        setTtl(ttl-1);

        if (launchType == _4s){
            int _2Sx = 10;
            _3rG(_2Sx, true);
        } else {
            if (launchType == _09I){
                int _0zg = 25;
                _3rG(_0zg, false);
            } else {
                int _3kL = 50;
                _3rG(_3kL, false);
            }
        }

        final int local2 = Tile._4mC(currentLocation.x());
        final int local3 = Tile._3FS(currentLocation.y());

        final Tile local4 = local1.map.getTile(local2, local3);

        boolean collision = checkCollision(local4);

        if (!collision){
            collision = local1.map.checkFloorCollision(this);
        } else {
            this.onRemove();
        }
    }

    private boolean checkCollision(Tile _arg2){
        Direction8 local3;
        boolean local2 = false;
        if (_arg2 != null){
            local2 = this.testSnowBallCollision(_arg2);
            if (!local2){
                local3 = direction.direction8Value();
                local2 = this.testSnowBallCollision(_arg2.getNextTileAtRot(local3));
                if (!local2){
                    local2 = this.testSnowBallCollision(_arg2.getNextTileAtRot(local3.rotateDirection45Degrees(false)));
                    if (!local2){
                        local2 = this.testSnowBallCollision(_arg2.getNextTileAtRot(local3.rotateDirection45Degrees(true)));
                    }
                }
            }
        }
        return local2;
    }
    private boolean testSnowBallCollision(Tile _arg2){
    	GameItemObject item;
        if (_arg2 != null){
            item = _arg2._4fe();
            if (item != null){
                if (item.testSnowBallCollision(this)){
                    item.onSnowBallHit(this);
                    return (true);
                }
            }
        }
        return (false);
    }

    private void _3rG(int _arg1,boolean _arg2){
        final int local2 = (currentLocation.x() + MathUtil._43Z(((direction._0uc() * speed) / 0xFF)));
        final int local3 = (currentLocation.y() + MathUtil._43Z(((direction._17x() * speed) / 0xFF)));
        final int local4 = (ttl - paraOffs);
        int local5 = ((((paraOffs * paraOffs) - (local4 * local4)) * _arg1) + _2t9);
        if (_arg2){
            local5 = Math.min(local5, _2t9);
        }
        setCurLocation(local2, local3, local5);
    }

    @Override
	public String toString(){
        return (((((((((((((" location=(" + currentLocation.x()) + ",") + currentLocation.y()) + ",") + currentLocation.z()) + ")") + " dir=") + direction) + " paraOffs=") + paraOffs) + " ttl=") + ttl));
    }

    public HumanGameObject getAttacker(){
        return (ballOwner);
    }


    @Override
    public void onRemove() {
    	// this is in disponse (client-side)
    	//setOwner(null);
        this.setOwner(null);
        this._active = false;
        this.GenerateCHECKSUM(this.currentSnowWar, -1);
        //this.currentSnowWar.subTurn();
    }
}

