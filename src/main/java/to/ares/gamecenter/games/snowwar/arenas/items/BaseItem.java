package to.ares.gamecenter.games.snowwar.arenas.items;

import to.ares.gamecenter.games.snowwar.unkown.StringStuffData;

public class BaseItem {
    public String name;
    private String type;

    private int spriteId;
    public int xDim;
    public int yDim;

    public float height;
    public boolean allowWalk;

    public int itemExtraType = StringStuffData.TYPE_ID;

    public BaseItem(final String type, final int id, final String name, final int xdim, final int ydim) {
        this.type = type;
        this.spriteId = id;
        this.name = name;
        this.xDim = xdim;
        this.yDim = ydim;
        this.height = 1.0f;
    }
}
