package traning;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        try(FileInputStream stream1 = new FileInputStream("states.txt");
        InputStreamReader reader1 = new InputStreamReader(stream1, "UTF8");
        BufferedReader br1 = new BufferedReader(reader1))
        {
            int ch;
            while ((ch = br1.read()) > 0)
                string.append((char) ch);
            String result = string.toString();
            System.out.print(result);
        }catch (IOException e){
            System.out.print("Не могу прочитать файл " + e);
        }
    }
}
