package traning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://myflex.org/yf/nyc.jpg ");
            URLConnection urlConn = url.openConnection();
            InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream(),"UTF8");
            BufferedReader br1 = new BufferedReader(inStream);

            String wholePage = null;
            String currentLine;

            while ((currentLine = br1.readLine())!= null ){
                wholePage = wholePage + currentLine + "\n";
            }
            System.out.println(wholePage);

        }catch (MalformedURLException e1){
                 System.out.println("Can't read from internet");

        }catch (IOException e){
                 System.out.println("Check the URL");
        }

    }
}

