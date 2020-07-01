package to.ares.gamecenter.games.snowwar;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.ArrayList;
import java.util.List;

public class MessageWriter {
    public List<Integer> savedPositions = new ArrayList<Integer>();
    public boolean isReady;
    private boolean bytesReady;
    public int writer;

    private byte[] bytes;

    public int debugId;

    public MessageWriter(final int Size) {
        bytes = new byte[Size];
    }

    public MessageWriter() {
        this(1000); // default size
    }

    public byte[] getMessage() throws Exception {
        if (!isReady) {
            throw new Exception("Not ended MessageWriter!");
        }

        if (bytesReady) {
            return bytes;
        }

        final byte[] rtn = new byte[writer];
        for (int i = 0; i < writer; i++) {
            rtn[i] = bytes[i];
        }

        bytes = rtn;
        bytesReady = true;

        return rtn;
    }

    public ByteBuf getMessage(int asdf) throws Exception {
        if (!isReady) {
            throw new Exception("Not ended MessageWriter!");
        }

        if (bytesReady) {
            ByteBuf buf = Unpooled.buffer(bytes.length);
            buf.writeBytes(bytes);
            return buf;
        }

        final byte[] rtn = new byte[writer];
        for (int i = 0; i < writer; i++) {
            rtn[i] = bytes[i];
        }

        bytes = rtn;
        bytesReady = true;
        ByteBuf buf = Unpooled.buffer(rtn.length);
        buf.writeBytes(rtn);
        return buf;
    }

    public void writeInt32(int in) {
        bytes[writer++] = (byte) ((in >>> 24) & 0xFF);
        bytes[writer++] = (byte) ((in >>> 16) & 0xFF);
        bytes[writer++] = (byte) ((in >>> 8) & 0xFF);
        bytes[writer++] = (byte) ((in >>> 0) & 0xFF);
    }

    public void writeInt16(int in) {
        bytes[writer++] = (byte) ((in >>> 8) & 0xFF);
        bytes[writer++] = (byte) ((in >>> 0) & 0xFF);
    }

    public void writeBoolean(boolean in) {
        bytes[writer++] = in ? (byte) 1 : (byte) 0;
    }

    public void writeChar(char in) {
        bytes[writer++] = (byte) (in & 0xFF);
    }

    public void writeByte(byte in) {
        bytes[writer++] = in;
    }

    public void writeString(String in) {
        final int len = in.length();
        writeInt16(len);
        for (int i = 0; i < len; i++) {
            bytes[writer++] = (byte) (in.charAt(i) & 0xff);
        }
    }

    public void writeBytes(byte[] in) {
        final int len = in.length;
        writeInt16(len);
        for (int i = 0; i < len; i++) {
            bytes[writer++] = in[i];
        }
    }

    /* Saving positions and writing later... */
    public Object setSaved(final Object add) {
        savedPositions.add(writer);
        return add;
    }

    public void writeSaved(final Object add) {
        if (add instanceof Integer) {
            final int tmp = writer;
            writer = savedPositions.remove(savedPositions.size() - 1);
            writeInt32((Integer) add);
            writer = tmp;
        } else if (add instanceof Boolean) {
            final int tmp = writer;
            writer = savedPositions.remove(savedPositions.size() - 1);
            writeBoolean((Boolean) add);
            writer = tmp;
        } else {
            throw new UnsupportedOperationException("Bad Param in SetWriter " + add.getClass());
        }
    }
}