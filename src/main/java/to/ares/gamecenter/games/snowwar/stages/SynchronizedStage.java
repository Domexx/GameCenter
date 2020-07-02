package to.ares.gamecenter.games.snowwar.stages;

import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.objects.BaseObject;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SynchronizedStage {
    public Map<Integer, BaseObject> gameObjects;
    private final List<BaseObject> _2xj;
	//public final List<GameItemObject> gameObjects = new ArrayList<GameItemObject>();

	public int objectIdCounter;

    public SynchronizedStage(){
        gameObjects = new LinkedHashMap<Integer, BaseObject>();
        _2xj = new ArrayList<BaseObject>();
    }

    public void addGameObject(BaseObject obj) {
    	if(obj.objectId == 0) {
    		obj.objectId = objectIdCounter++;
    	}
    	gameObjects.put(obj.objectId, obj);
        obj._active = true;
    }

    public void removeGameObject(int _arg1){
    	final BaseObject local1 = gameObjects.remove(_arg1);
        if (local1 != null) {
            local1.onRemove();
        }
    }

    public void queueDeleteObject(BaseObject _arg1){
        if (_arg1 == null){
            return;
        }

        _2xj.add(_arg1);
        _arg1._active = false;
        _arg1.GenerateCHECKSUM((SnowWarRoom) this, -1);
    }

    public BaseObject _3Pl(int _arg1){
        return gameObjects.get(_arg1);
    }

    public void subTurn(){
        for(final BaseObject local0 : gameObjects.values()) {
            local0.subturn(this);
        };

        if (!_2xj.isEmpty()){
            for(final BaseObject local1 : _2xj) {
                removeGameObject(local1.objectId);
            }

            _2xj.clear();
        }
    }
}

