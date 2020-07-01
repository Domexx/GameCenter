package to.ares.gamecenter.games.snowwar.pathfinding;

import to.ares.gamecenter.games.snowwar.objects.GameItemObject;

public class CollisionDetection {
    public static boolean _pU(GameItemObject _arg1, GameItemObject _arg2){
        if (_arg2 == _arg1){
            return (false);
        }
        return _s(_arg1, _arg2);
    }

    private static boolean _s(GameItemObject _arg1, GameItemObject _arg2){
        return _arg1.location3D()._0Dk(_arg2.location3D(), _arg1.boundingData()[0] + _arg2.boundingData()[0]);
    }
}