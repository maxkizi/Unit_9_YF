package traning;
import java.net.*;
import java.io.*;

public class Downloading {
    public static void main(String[] args) {
        URLConnection connection = null;
        try {
            URL url = new URL("https://sun9-3.userapi.com/c848416/v848416721/123dc4/ujEFZ5ks8MQ.jpg");
            connection = url.openConnection();

        }catch(Exception e) {
            System.out.println("Не могу установить соединение");
            System.out.println(e);
        }
        try(FileOutputStream file = new FileOutputStream("picture.jpg");
            //BufferedOutputStream bOut = new BufferedOutputStream(file);

            InputStream in = connection.getInputStream();
           // BufferedInputStream bIn = new BufferedInputStream(in);
            ) {

            System.out.println("Downloading is starting");
            int byteValue;
            while ((byteValue = in.read()) != -1){
               file.write(byteValue);
            }
            System.out.println("Downloading finished");
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
