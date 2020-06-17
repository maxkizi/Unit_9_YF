package traning;

import java.io.*;

public class TestFileInput {
    public static void main(String[] args) {
        try (FileInputStream f1 = new FileInputStream("abc.doc")) {
            boolean eof = false;

            while (eof != true) {
                int byteValue = f1.read();
                System.out.print(byteValue + " ");

                if (byteValue == -1)
                    eof = true;
            }

        }catch(IOException e){
                System.out.println(" не могу прочитать файл " + e);
            }
    }
}

