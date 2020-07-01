package to.ares.gamecenter.games.snowwar.objects;

import to.ares.gamecenter.games.snowwar.SnowWarGameStage;
import to.ares.gamecenter.games.snowwar.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.pathfinding.Direction8;
import to.ares.gamecenter.games.snowwar.pathfinding.Tile;

public class PileGameObject extends PickBallsGameItemObject {
    private static int BALLS_SIZE = 100;

	public SnowWarRoom currentSnowWar;

    private int[] boudngingData;
    private final int snowBallsCapacity;

    public PileGameObject(int x, int y, int a, int snowBalls, int parentFuseId, SnowWarGameStage _arg2, final SnowWarRoom room){
        super(7, _arg2.getTile(x, y)/*_arg2.getTile(Tile._4mC(x * Tile._uo), Tile._3FS(y * Tile._uo))*/, snowBalls, parentFuseId);
        snowBallsCapacity = a;
        if (snowBalls > 0){
            _arg2._2Av(this);
        }
        boudngingData = new int[]{(snowBalls * BALLS_SIZE)};
        currentSnowWar = room;

        Tile pickUpZones;

        pickUpZones = location.getNextTileAtRot(Direction8.N);
        if(pickUpZones != null) {
        	pickUpZones.pickBallsItem = this;
        }
        pickUpZones = location.getNextTileAtRot(Direction8.S);
        if(pickUpZones != null) {
        	pickUpZones.pickBallsItem = this;
        }
        pickUpZones = location.getNextTileAtRot(Direction8.E);
        if(pickUpZones != null) {
        	pickUpZones.pickBallsItem = this;
        }
        pickUpZones = location.getNextTileAtRot(Direction8.W);
        if(pickUpZones != null) {
        	pickUpZones.pickBallsItem = this;
        }
    }


	public void setSnowBalls(int val) {
		currentSnowWar.checksum += (val * 6) - (getVariable(5) * 6);
		snowBalls = val;
	}

    @Override
	public int getVariable(int val){
    	if(val == 0) {
            return (PILE);
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
            return (snowBallsCapacity);
    	}
    	if(val == 5) {
            return (snowBalls);
    	}
    	//if(val == 6) {
            return (parentFuseId);
    	//}
    }

    @Override
	public int[] boundingData(){
        return (boudngingData);
    }

    public int _4b8(){
        return (snowBallsCapacity);
    }

	@Override
	public void onSnowballPickup(int ammount) {
		setSnowBalls(snowBalls - ammount);

        boudngingData = new int[]{(snowBalls * BALLS_SIZE)};
        if (snowBalls <= 0){
            location.removeGameObject();
        }
	}
}

