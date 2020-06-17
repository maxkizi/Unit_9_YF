package traning;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStreamBuf {
    public static void main(String[] args) {
        try (FileInputStream myFile = new FileInputStream("abc.dat");
             BufferedInputStream buf1 = new BufferedInputStream(myFile)){

            boolean eof = false;

            while (eof!= true){
                int byteValue = buf1.read();
                System.out.print(byteValue + " ");
                if (byteValue ==-1)
                    eof = true;
            }

        }catch (IOException e){
            System.out.println("Can't read file" + e);
        }
    }
}
