package to.ares.gamecenter.games.snowwar.room.pathfinding;

import to.ares.gamecenter.games.snowwar.objects.BaseObject;

public class CollisionDetection {
    public static boolean _pU(BaseObject _arg1, BaseObject _arg2){
        if (_arg2 == _arg1){
            return (false);
        }
        return _s(_arg1, _arg2);
    }

    private static boolean _s(BaseObject _arg1, BaseObject _arg2){
        return _arg1.location3D()._0Dk(_arg2.location3D(), _arg1.boundingData()[0] + _arg2.boundingData()[0]);
    }
}