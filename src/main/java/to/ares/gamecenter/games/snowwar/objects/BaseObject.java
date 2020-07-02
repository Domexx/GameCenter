package to.ares.gamecenter.games.snowwar.objects;

import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.stages.SynchronizedStage;
import to.ares.gamecenter.games.snowwar.config.ItemConfig;
import to.ares.gamecenter.games.snowwar.room.pathfinding.CollisionDetection;
import to.ares.gamecenter.games.snowwar.room.pathfinding.Direction360;
import to.ares.gamecenter.games.snowwar.room.pathfinding.PlayerTile;

public abstract class BaseObject {
	public static final int SNOWBALL = 1;
	public static final int TREE = 2;
	public static final int PILE = 3;
	public static final int MACHINE = 4;
	public static final int HUMAN = 5;

	public ItemConfig BaseItem;
	public Object data;
	public int objectId;

    public boolean _active = false;
	public final int variablesCount;

	// Abstract functions
	public abstract PlayerTile location3D();
    public abstract Direction360 direction360();
    public abstract int getVariable(int var);
    public abstract int[] boundingData();

    // Override in sub-class
	public void onRemove() {}
	public void subturn(SynchronizedStage _arg1) {}
    public void onSnowBallHit(SnowBallObject _arg2){}

	protected BaseObject(int varCount) {
		variablesCount = varCount;
	}

	public void GenerateCHECKSUM(SnowWarRoom arena, int multiplier) {
		for(int i=0;i<variablesCount;) {
			arena.checksum += (getVariable(i) * ++i) * multiplier;
		}
	}

    public int _3au()
    {
        return (-((objectId + 1)));
    }

    public int collisionHeight() {
        return (boundingData()[0]);
    }

    public boolean testSnowBallCollision(SnowBallObject _arg1){
        return (_arg1.location3D().z() < collisionHeight() && CollisionDetection._pU(this, _arg1));
    }
}
