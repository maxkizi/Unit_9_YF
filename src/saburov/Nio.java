package saburov;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Nio {
    public static void main(String[] args) throws Exception{
        FileInputStream fileIn = new FileInputStream("c:\\Users\\Max\\Desktop\\ujEFZ5ks8MQ.jpg");
        FileOutputStream fileOut = new FileOutputStream("testNIO");

        FileChannel inChannel = fileIn.getChannel();
        FileChannel outChanel = fileOut.getChannel();

        ByteBuffer inBuff = ByteBuffer.allocate(4096);
        ByteBuffer outBuff = ByteBuffer.allocate(4096);


        int read = inChannel.read (inBuff);

        while (read != -1){
            inBuff.flip();
            while (inBuff.hasRemaining()){
                byte get = inBuff.get();
                outBuff.put(get);
            }
            outBuff.flip();
            outChanel.write(outBuff);
            inBuff.clear();
            outBuff.clear();
            read = inChannel.read(inBuff);
        }
        fileIn.close();
        fileOut.close();
    }
}
