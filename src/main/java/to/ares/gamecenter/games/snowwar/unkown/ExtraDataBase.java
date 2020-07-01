package to.ares.gamecenter.games.snowwar.unkown;

import com.eu.habbo.messages.ServerMessage;


public abstract class ExtraDataBase {

    public void setExtraData(Object extraData) { }

    public String getWallLegacyString() {
        return "";
    }

    public abstract byte[] data();

    public abstract int getType();

    public abstract void serializeComposer(ServerMessage writer);

}
