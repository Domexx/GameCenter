package to.ares.gamecenter.games.snowwar.items;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class BaseItem {
    public static final BaseItem snst_tree1_d = new BaseItem("s",4061,"snst_tree1_d",1,1);
    public static final BaseItem snst_block1 = new BaseItem("s",4066,"snst_block1",1,1);
    public static final BaseItem snst_ballpile = new BaseItem("s",4059,"snst_ballpile",1,1);
    public static final BaseItem xm09_man_a = new BaseItem("s",3038,"xm09_man_a",1,1);
    public static final BaseItem xm09_man_c = new BaseItem("s",3032,"xm09_man_c",1,1);
    public static final BaseItem xm09_man_b = new BaseItem("s",3037,"xm09_man_b",1,1);
    public static final BaseItem snst_fence = new BaseItem("s",4062,"snst_fence",1,2);
    public static final BaseItem ads_background = new BaseItem("s",3704,"ads_background",1,1);
    public static final BaseItem snst_tree1 = new BaseItem("s",4063,"snst_tree1",1,1);
    public static final BaseItem s_snowball_machine = new BaseItem("s",4068,"s_snowball_machine",1,1);
    public static final BaseItem snst_iceblock = new BaseItem("s",4064,"snst_iceblock",1,1);
    public static final BaseItem ads_igorraygun = new BaseItem("s",2648,"ads_igorraygun",1,2);

    private int spriteId;
    public String name;
    private String type;
    public int xDim;
    public int yDim;
    public float height;
    public boolean allowWalk;

    public int itemExtraType = StringStuffData.TYPE_ID;

    private BaseItem(final String type, final int id, final String name, final int xdim, final int ydim) {
        this.type = type;
        this.spriteId = id;
        this.name = name;
        this.xDim = xdim;
        this.yDim = ydim;
        this.height = 1.0f;
    }
}
