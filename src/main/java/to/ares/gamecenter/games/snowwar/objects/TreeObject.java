package to.ares.gamecenter.games.snowwar.objects;

import to.ares.gamecenter.games.snowwar.stages.SnowWarStage;
import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.room.pathfinding.Direction360;
import to.ares.gamecenter.games.snowwar.room.pathfinding.Direction8;
import to.ares.gamecenter.games.snowwar.room.pathfinding.PlayerTile;
import to.ares.gamecenter.games.snowwar.room.pathfinding.Tile;

public class TreeObject extends BaseObject {

    private static int[] _jU = new int[]{0};
    private static int[] _2Kl = new int[]{((Tile.TILE_SIZE - SnowBallObject.boundingData[0]) - 1)};

    private final int parentFuseId;
    private final Tile _0QF;
    private final Direction8 _direction8;
    private final Direction360 _direction360;
    private final int _height;
    private final int _ws;
    private int currentDamage;

	public SnowWarRoom currentSnowWar;

    public TreeObject(int x, int y, int rot, int height, int a, int b, int c, SnowWarStage _arg2, final SnowWarRoom room){
        super(9);

		currentSnowWar = room;

        _0QF = _arg2.getTile(x, y);//_arg2.getTile(Tile._4mC(x * Tile._uo), Tile._3FS(y * Tile._uo));
        _direction8 = Direction8.getDirection(rot);
        _direction360 = new Direction360(Direction360.direction8ToDirection360Value(_direction8));
        parentFuseId = a;
        _height = height * Tile.TILE_SIZE;
        currentDamage = c;
        _ws = b;
        //if (this._4iN < this._ws){
            _arg2._2Av(this);
        //};
        _0QF._4AO(-(_height));
        _0QF.setBlocked(true);
    }

    public void setDamage(int val) {
		currentSnowWar.checksum += (val * 9) - (getVariable(8) * 9);
		currentDamage = val;
	}

    @Override
	public int getVariable(int val){
    	if(val == 0) {
            return (TREE);
    	}
    	if(val == 1) {
            return (objectId);
    	}
    	if(val == 2) {
            return (_0QF.location().x());
    	}
    	if(val == 3) {
            return (_0QF.location().y());
    	}
    	if(val == 4) {
            return (_direction8.getRot());
    	}
    	if(val == 5) {
            return (_height);
    	}
    	if(val == 6) {
            return (parentFuseId);
    	}
    	if(val == 7) {
            return (_ws);
    	}
    	//if(val == 8) {
            return (currentDamage);
    	//}
    }

    @Override
	public int[] boundingData(){
        if (currentDamage < _ws){
            return (_2Kl);
        };
        return (_jU);
    }

    @Override
	public PlayerTile location3D(){
        return (_0QF.location());
    }

    @Override
	public Direction360 direction360(){
        return (_direction360);
    }

    @Override
	public void onSnowBallHit(SnowBallObject _arg2){
        if (currentDamage < _ws){
        	setDamage(currentDamage + 1);
        } else {
            _0QF.removeGameObject();
        }
    }

    public int _4ZU(){
        return (_ws);
    }

    public int _2Ti(){
        return (currentDamage);
    }

    public int _4rk(){
        return (parentFuseId);
    }

    @Override
	public int collisionHeight(){
        return (_height);
    }
}

