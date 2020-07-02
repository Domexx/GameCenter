package to.ares.gamecenter.messages.outgoing.snowwar;

public class Composer {
    public static void add(final Object add, final MessageWriter Message) {
        if (add == null) {
            throw new UnsupportedOperationException("NULL Param in Append!");
        }

        if (add instanceof Integer) {
            Message.writeInt32((Integer) add);
            return;
        }

        if (add instanceof Short) {
            Message.writeInt32((Short) add);
            return;
        }

        if (add instanceof String) {
            Message.writeString((String) add);
            return;
        }

        if (add instanceof Boolean) {
            Message.writeBoolean((Boolean) add);
            return;
        }

        if (add instanceof byte[]) {
            Message.writeBytes((byte[]) add);
            return;
        }

        if (add instanceof Long) {
            Message.writeInt32(((Long) add).intValue());
            return;
        }

        throw new UnsupportedOperationException("Bad Param in Append " + add.getClass());
    }

    public static void endPacket(final MessageWriter Message) {
        final int tmp = Message.writer;
        final int len = tmp - 4;
        if (len < 2 || len > 131072) {
            throw new UnsupportedOperationException("Bad Message! Len=" + len);
        }

        Message.writer = 0;
        Message.writeInt32(len);
        Message.writer = tmp;
        Message.isReady = true;
    }

    public static void initPacket(final int headerId, final MessageWriter Message) {
        if (headerId == 0) {
            throw new UnsupportedOperationException("Header = 0!!");
        }

        Message.debugId = headerId;
        Message.writer = 4; // the first 4 bytes are the lenght of packet
        Message.writeInt16((short) headerId);
    }
}