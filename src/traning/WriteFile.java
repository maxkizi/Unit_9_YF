package traning;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteFile {
    public static void main(String[] args) {
        String myAddress = new String("Кировская область, пгт Юрья");

        try (FileOutputStream file1 = new FileOutputStream("Адрес.txt");
             OutputStreamWriter writer1 = new OutputStreamWriter(file1);
             BufferedWriter bw1 = new BufferedWriter(writer1)){

            bw1.write(myAddress);

        }catch (IOException e){
            System.out.print(e.toString());
        }
    }
}
