package to.ares.gamecenter.games.snowwar.objects;


import to.ares.gamecenter.games.snowwar.SnowWarGameStage;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.SynchronizedGameStage;
import to.ares.gamecenter.games.snowwar.events.AddBallToMachine;
import to.ares.gamecenter.games.snowwar.pathfinding.Direction8;
import to.ares.gamecenter.games.snowwar.pathfinding.Tile;

public class MachineGameObject extends PickBallsGameItemObject {
    private static final int SNOWBALLGENERATOR_TIME = 100;

    public static int[] boundingData = new int[]{1200};

    private final int snowBallsCapacity;
    private final Direction8 direction;

    private int snowBallGeneratorTimer = SNOWBALLGENERATOR_TIME;

	public SnowWarRoom currentSnowWar;

    public MachineGameObject(int x, int y, int rot, int a, int b, int c, SnowWarGameStage _arg2, final SnowWarRoom room){
        super(8, _arg2.getTile(x, y)/*_arg2.getTile(Tile._4mC(x * Tile._uo), Tile._3FS(y * Tile._uo))*/, b, c);
        snowBallsCapacity = a;
        direction = Direction8.getDirection(rot);
        _arg2._2Av(this);
        currentSnowWar = room;

        final Tile frontTile = location.getNextTileAtRot(Direction8.getDirection((rot+4)%8));
        if(frontTile != null) {
            frontTile.pickBallsItem = this;
        }
    }

	public void setSnowBalls(int val) {
		currentSnowWar.checksum += (val * 7) - (getVariable(6) * 7);
		snowBalls = val;
	}

    @Override
	public int getVariable(int val){
    	if(val == 0) {
            return (MACHINE);
    	}
    	if(val == 1) {
            return (objectId);
    	}
    	if(val == 2) {
            return (location.location().x());
    	}
    	if(val == 3) {
            return (location.location().y());
    	}
    	if(val == 4) {
            return (direction.getRot());
    	}
    	if(val == 5) {
            return (snowBallsCapacity);
    	}
    	if(val == 6) {
            return (snowBalls);
    	}
    	//if(val == 7) {
            return (parentFuseId);
    	//}
    }

    @Override
    public void subturn(SynchronizedGameStage unused){
        if (snowBallGeneratorTimer > 0){
            snowBallGeneratorTimer--;
        } else {
        	snowBallGeneratorTimer = SNOWBALLGENERATOR_TIME;
			synchronized(currentSnowWar.gameEvents) {
	        	currentSnowWar.gameEvents.add(new AddBallToMachine(this));
			}
        }
    }

    @Override
	public int[] boundingData(){
        return (boundingData);
    }

    public void addSnowBall() {
        if (snowBalls < snowBallsCapacity){
    		setSnowBalls(snowBalls + 1);
        }
    }

	@Override
	public void onSnowballPickup(int ammount) {
		setSnowBalls(snowBalls - ammount);
	}
}

