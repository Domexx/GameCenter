package to.ares.gamecenter.games.snowwar.arenas.items;

import to.ares.gamecenter.games.snowwar.unkown.ExtraDataBase;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public abstract class Item {
    public int itemId;

    public BaseItem baseItem;
    public ExtraDataBase extraData;

    @Override
    public int hashCode() {
        return itemId;
    }
}