package to.ares.gamecenter.games.snowwar.data;

public class ReadData {
    public int type;
    private byte[] bytes;
    private int reader;

    public ReadData(byte[] arr) {
        if (arr == null) {
            bytes = new byte[2];
            return;
        }
        bytes = arr;
        type = readInt8();
    }

    public int readInt32() {
        return ((bytes[reader++] & 0xff) << 24) + ((bytes[reader++] & 0xff) << 16) + ((bytes[reader++] & 0xff) << 8) + (bytes[reader++] & 0xff);
    }

    private int readInt16() {
        return ((bytes[reader++] & 0xff) << 8) + (bytes[reader++] & 0xff);
    }

    private int readInt8() {
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