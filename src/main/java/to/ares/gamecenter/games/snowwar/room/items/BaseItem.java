package to.ares.gamecenter.games.snowwar.room.items;

import to.ares.gamecenter.games.snowwar.config.ItemConfig;
import to.ares.gamecenter.games.snowwar.data.BaseData;

public abstract class BaseItem {
    public int itemId;

    public ItemConfig baseItem;
    public BaseData extraData;

    @Override
    public int hashCode() {
        return itemId;
    }
}