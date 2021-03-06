package to.ares.gamecenter.games.snowwar.room.pathfinding;

import to.ares.gamecenter.games.snowwar.room.items.GameItem;
import to.ares.gamecenter.games.snowwar.objects.BaseObject;
import to.ares.gamecenter.games.snowwar.objects.HumanObject;
import to.ares.gamecenter.games.snowwar.objects.PickBallsItemObject;
import to.ares.gamecenter.util.MathUtil;

import java.util.ArrayList;
import java.util.List;

public class Tile {
    public static int TILE_SIZE = 3200;
    public static int _37G = MathUtil._43Z((TILE_SIZE / 2));
    public static int _03y = (TILE_SIZE + _37G);
    public static int _1L = ((int)Math.sqrt(((Tile.TILE_SIZE * Tile.TILE_SIZE) + (Tile.TILE_SIZE * Tile.TILE_SIZE))));

    private final PlayerTile location;
    private final Tile[] _3ob;
    private BaseObject _0Zr;
    public int[] _4gH;
    private boolean blocked;
    private int height;

    public PickBallsItemObject pickBallsItem;

    private final List<GameItem> _0E8;

    public Tile(int _arg1, int _arg2){
        _3ob = new Tile[8];
        _4gH = new int[]{_arg1, _arg2, 0};
        location = new PlayerTile((_arg1 * TILE_SIZE), (_arg2 * TILE_SIZE), 0);
        _0E8 = new ArrayList<GameItem>();
    }

    public static int _4mC(int _arg1){
        return (MathUtil._43Z(((_arg1 + Tile._37G) / Tile.TILE_SIZE)));
    }

    public static int _3FS(int _arg1){
        return (MathUtil._43Z(((_arg1 + Tile._37G) / Tile.TILE_SIZE)));
    }

    public static int _3b(int _arg1){
        return ((_arg1 * Tile.TILE_SIZE));
    }

    public static int _3Qo(int _arg1){
        return ((_arg1 * Tile.TILE_SIZE));
    }

    public List<GameItem> fuseObjects()
    {
        return (_0E8);
    }

    public void _lR(GameItem fuseItem)
    {
        _0E8.add(fuseItem);
        _4AO((int) (fuseItem.baseItem.height * Tile.TILE_SIZE));
    }

    public void _4AO(int _arg1){
        height += _arg1;
        if (height < 0){
            height = 0;
        };
    }

    public int[] _4iL()
    {
        return (_4gH);
    }

    public PlayerTile location(){
        return (location);
    }

    public boolean isTooAway(PlayerTile _arg1){
        int local1 = (location.x() - _arg1.x());
        if (local1 < 0){
            local1 = -(local1);
        }
        int local2 = (location.y() - _arg1.y());
        if (local2 < 0){
            local2 = -(local2);
        }
        return ((((local1 < _37G)) && ((local2 < _37G))));
    }

    public void _3iT(Tile _arg1,Direction8 _arg2){
        _2UR(_arg1, _arg2);
        _arg1._2UR(this, _arg2.rotateDirection180Degrees());
    }

    private void _2UR(Tile _arg1,Direction8 _arg2){
        _3ob[_arg2.getRot()] = _arg1;
    }

    public Tile getNextTileAtRot(Direction8 _arg1){
        return (_3ob[_arg1.getRot()]);
    }

    public boolean isOpen(BaseObject _arg1)
    {
        boolean isBlocked = false;
        if (_0E8.size() == 1){
            isBlocked = !_0E8.get(0).baseItem.allowWalk;
        } else {
            if (!_0E8.isEmpty()){
                isBlocked = true;
            }
        }

        return (!isBlocked && _0Zr == null && !blocked);
    }

    public boolean _1tH(BaseObject _arg1)
    {
        boolean _arg2 = false;
        if (_0Zr == null){
        	_0Zr = _arg1;
            _arg2 = true;
        };
        return (_arg2);
    }


    public BaseObject removeGameObject(){
    	BaseObject local0 = null;
        if (_0Zr != null){
            local0 = _0Zr;
            _0Zr = null;
        };
        return local0;
    }

    public BaseObject _4fe(){
        return (_0Zr);
    }

    public HumanObject _05Z(){
        if (_0Zr != null && _0Zr instanceof HumanObject){
            return (HumanObject) _0Zr;
        };
        return (null);
    }

    public HumanObject _40T(){
    	final HumanObject local0 = _05Z();
        if (local0 != null){
            _0Zr = null;
        };
        return (local0);
    }

    public int distanceTo(Tile _arg1)
    {
        return location.distanceTo(_arg1.location());
    }

    public Direction8 directionTo(Tile _arg1)
    {
        return location.directionTo(_arg1.location());
    }

    public Tile getNodeAt(Direction8 _arg1)
    {
        return _3ob[_arg1.getRot()];
    }

    public boolean directionIsBlocked(Direction8 _arg1, BaseObject _arg2)
    {
        return isOpen(_arg2);
    }

    public int getPathCost(Direction8 _arg1, BaseObject _arg2)
    {
        if (_arg1._AC()){
            return TILE_SIZE;
        }

        return _1L;
    }

    public int height(){
        return height;
    }

    @Override
	public String toString(){
        return ((((((" X:" + location.x()) + " Y:") + location.y()) + " Z:") + location.z()));
    }

    public void setBlocked(boolean block){
        blocked = block;
    }
}

