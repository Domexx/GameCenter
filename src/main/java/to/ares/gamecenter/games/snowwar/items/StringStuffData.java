package to.ares.gamecenter.games.snowwar.items;


import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class StringStuffData extends ExtraDataBase {
    public static final int TYPE_ID = 0;
    public String extraData;

    public StringStuffData(StuffDataReader data) {
        if (data == null) {
            extraData = "";
        } else {
            extraData = data.readString();
        }
    }

    @Override
    public byte[] data() {
        if (extraData.isEmpty()) {
            // not save empty stringdata
            return null;
        }

        final StuffDataWriter data = new StuffDataWriter(TYPE_ID);
        data.writeString(extraData);
        return data.getData();
    }

    @Override
    public void setExtraData(Object data) {
        if (data instanceof Integer) {
            extraData = Integer.toString((Integer) data);
        } else {
            extraData = (String) data;
        }
    }

    @Override
    public String getWallLegacyString() {
        return extraData;
    }

    @Override
    public void serializeComposer(ServerMessage writer) {
        writer.appendString(this.extraData);
    }

    @Override
    public int getType() {
        return TYPE_ID;
    }
}
