package to.ares.gamecenter.games.snowwar.arenas.items;

import com.eu.habbo.messages.ServerMessage;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public abstract class ExtraDataBase {

    public void setExtraData(Object extraData) { }

    public String getWallLegacyString() {
        return "";
    }

    public abstract byte[] data();

    public abstract int getType();

    public abstract void serializeComposer(ServerMessage writer);

}
