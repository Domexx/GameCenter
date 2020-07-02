package to.ares.gamecenter.games.snowwar.config;

import to.ares.gamecenter.games.snowwar.data.StringData;

public class ItemConfig {
    public String name;
    private String type;

    private int spriteId;
    public int xDim;
    public int yDim;

    public float height;
    public boolean allowWalk;

    public int itemExtraType = StringData.TYPE_ID;

    public ItemConfig(final String type, final int id, final String name, final int xdim, final int ydim) {
        this.type = type;
        this.spriteId = id;
        this.name = name;
        this.xDim = xdim;
        this.yDim = ydim;
        this.height = 1.0f;
    }
}
