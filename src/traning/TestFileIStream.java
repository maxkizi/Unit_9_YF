package traning;

import java.io.*;

import java.io.FileInputStream;

public class TestFileIStream {
    public static void main(String[] args) {
        try (FileInputStream myFile = new FileInputStream("abc.dat");
             BufferedInputStream buff = new BufferedInputStream(myFile)){

            boolean eof = false;

            while (eof != true){
                int byteValue = buff.read();
                System.out.print(byteValue + " ");

                if (byteValue == -1)
                    eof = true;
            }

        }catch (IOException e){
            System.out.println("Can't read file: " + e.toString());
        }
    }
}
