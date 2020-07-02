package to.ares.gamecenter.games.snowwar.room.pathfinding;

public class PlayerTile {
    private int x;
    private int y;
    private int z;

    public PlayerTile(int _arg1,int _arg2,int _arg3){
        x = _arg1;
        y = _arg2;
        z = _arg3;
    }

    public int x(){
        return (x);
    }

    public int y(){
        return (y);
    }

    public int z(){
        return (z);
    }

    public void setXYZ(int _arg1, int _arg2, int _arg3) {
        x = _arg1;
        y = _arg2;
        z = _arg3;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setXYZ(PlayerTile _arg1){
        x = _arg1.x;
        y = _arg1.y;
        z = _arg1.z;
    }

    public int distanceTo(PlayerTile _arg1){
        final int local1 = (_arg1.x - x);
        final int local2 = (_arg1.y - y);
        final int local3 = (_arg1.z - z);
        final int local4 = ((Math.abs(local1) + Math.abs(local2)) + Math.abs(local3));
        return (local4);
    }

    public Direction8 directionTo(PlayerTile _arg1){
        if ((((_arg1.x == x)) && ((_arg1.y == y)))){
            return (null);
        };
        final int local1 = (_arg1.x - x);
        final int local2 = (_arg1.y - y);
        final int local3 = Direction360.getRot(local1, local2);
        return (Direction360.direction360ValueToDirection8(local3));
    }

    public boolean isSamePosition(Object _arg1){
        if (this == _arg1){
            return (true);
        };
        if (!(_arg1 instanceof PlayerTile)){
            return (false);
        };
        final PlayerTile local1 = (PlayerTile)_arg1;
        if (x != local1.x){
            return (false);
        };
        if (y != local1.y){
            return (false);
        };
        if (z != local1.z){
            return (false);
        };
        return (true);
    }

    @Override
	public String toString(){
        return (((((("_x:" + x) + "yy:") + y) + "_zz:") + z));
    }

    public boolean _0Dk(PlayerTile _arg1, int _arg2){
        return (_4D8(x, y, _arg1.x, _arg1.y, _arg2));
    }

    public static boolean _4D8(int _arg1, int _arg2, int _arg3, int _arg4, int _arg5){
        int local5 = (_arg3 - _arg1);
        if (local5 < 0){
            local5 = -(local5);
        };
        int local6 = (_arg4 - _arg2);
        if (local6 < 0){
            local6 = -(local6);
        };
        if ((((local6 > _arg5)) || ((local5 > _arg5)))){
            return (false);
        };
        if (((local5 * local5) + (local6 * local6)) < (_arg5 * _arg5)){
            return (true);
        };
        return (false);
    }
}