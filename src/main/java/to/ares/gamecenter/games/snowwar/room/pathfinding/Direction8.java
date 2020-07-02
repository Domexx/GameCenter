package to.ares.gamecenter.games.snowwar.room.pathfinding;

public class Direction8 {
    public static Direction8[] DIRECTIONS = new Direction8[8];
    public static Direction8 N = new Direction8(0, "N", 0, -1);
    public static Direction8 NE = new Direction8(1, "NE",1, -1);
    public static Direction8 E = new Direction8(2, "E", 1, 0);
    public static Direction8 SE = new Direction8(3, "SE", 1, 1);
    public static Direction8 S = new Direction8(4, "S", 0, 1);
    public static Direction8 SW = new Direction8(5, "SW", -1, 1);
    public static Direction8 W = new Direction8(6, "W", -1, 0);
    public static Direction8 NW = new Direction8(7, "NW", -1, -1);

    private final int rot;
    private final int xDiff;
    private final int yDiff;
    private final String rotName;

    public Direction8(int r, String rName, int diffx, int diffy){
        rot = r;
        rotName = rName;
        xDiff = diffx;
        yDiff = diffy;
        DIRECTIONS[r] = this;
    }

    public static Direction8 getDirection(final int dir){
        if (dir < 0 || dir > 7){
        	return N;
        }

        return DIRECTIONS[dir];
    }

    public static int validateDirection8Value(int dir){
        return dir & 0b111;
    }

    public static Direction8 getRot(int curX, int curY, int targetX, int targetY){
        final int deltaX = (targetX - curX);
        final int deltaY = (targetY - curY);

        if(deltaX == 0) {
            if(deltaY < 0){
                return N;
            }

            if(deltaY > 0){
                return S;
            }
        }

        if (deltaX > 0) {
            if(deltaY < 0) {
                return NE;
            }

            if(deltaY == 0) {
                return E;
            }

            if(deltaY > 0) {
                return SE;
            }
        }

        if (deltaX < 0) {
            if (deltaY < 0) {
                return NW;
            }

            if (deltaY == 0) {
                return W;
            }

            if (deltaY > 0) {
                return SW;
            }
        }
        System.out.println("ERROR: Direction8.getRot == NULL");

        return null;
    }

    public int getRot(){
        return rot;
    }

    public Direction8 rotateDirection180Degrees(){
        return getDirectionAtRot(4);
    }

    public Direction8 rotateDirection45Degrees(boolean _arg1) {
        return getDirectionAtRot(_arg1 ? 1 : -1);
    }

    public Direction8 rotateDirection90Degrees(boolean _arg1){
        return getDirectionAtRot(_arg1 ? 2 : -2);
    }

    public boolean _AC()
    {
        return (rot % 2 == 0);
    }

    public int _3f4()
    {
        return rot;
    }

    public Direction8 getDirectionAtRot(int diff){
        return DIRECTIONS[validateDirection8Value(rot + diff)];
    }

    @Override
	public String toString(){
        return (rotName + "(" + Integer.toString(rot) + ")");
    }

    public String getRotName(){
        return rotName;
    }

    public int getDiffX(){
        return xDiff;
    }

    public int getDiffY(){
        return yDiff;
    }

	public static boolean haveDirection(Direction8 find, Direction8... directions) {
		for(final Direction8 val : directions) {
			if(find == val) {
				return true;
			}
		}

		return false;
	}
}
