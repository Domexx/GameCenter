package to.ares.gamecenter.games.snowwar.arenas.items;

import to.ares.gamecenter.games.snowwar.unkown.ExtraDataBase;

public abstract class Item {
    public int itemId;

    public BaseItem baseItem;
    public ExtraDataBase extraData;

    @Override
    public int hashCode() {
        return itemId;
    }
}