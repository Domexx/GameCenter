package to.ares.gamecenter.games.snowwar.items;

/**
 * Created by SpreedBlood on 2017-12-22.
 */
public class StuffDataReader {
    public int type;

    public byte[] bytes;
    public int reader;

    public StuffDataReader(byte[] arr) {
        if(arr == null) {
			/* Empty StringStuffData */
            bytes = new byte[2];
            return;
        }
        bytes = arr;
        type = readInt8();
    }

    public int readInt32() {
        return ((bytes[reader++] & 0xff) << 24) + ((bytes[reader++] & 0xff) << 16) + ((bytes[reader++] & 0xff) << 8) + (bytes[reader++] & 0xff);
    }

    public int readInt16() {
        return ((bytes[reader++] & 0xff) << 8) + (bytes[reader++] & 0xff);
    }

    public int readInt8() {
        return (bytes[reader++] & 0xff);
    }

    public String readString() {
        final int len = readInt16();
        final byte[] text = new byte[len];
        System.arraycopy(bytes, reader, text, 0, len);
        reader += len;
        return new String(text);
    }

    public boolean canRead(int len) {
        return (bytes.length - reader) >= len;
    }
}