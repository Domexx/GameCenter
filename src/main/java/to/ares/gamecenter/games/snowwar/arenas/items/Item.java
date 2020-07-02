package to.ares.gamecenter.games.snowwar.arenas.items;

import to.ares.gamecenter.games.snowwar.data.BaseData;

public abstract class Item {
    public int itemId;

    public BaseItem baseItem;
    public BaseData extraData;

    @Override
    public int hashCode() {
        return itemId;
    }
}