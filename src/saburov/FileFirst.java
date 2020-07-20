package saburov;

import java.io.*;

public class FileFirst {
    public static void main(String[] args) throws Exception {
       demoReadText();
    }
        //1.
        public static void demoReadWriteFile(){
        try (FileInputStream inputStream = new FileInputStream("c:\\Users\\Max\\Desktop\\ujEFZ5ks8MQ.jpg");
             BufferedInputStream inbound = new BufferedInputStream(inputStream);

             FileOutputStream outputStream = new FileOutputStream("test.jpg");
             BufferedOutputStream outbound = new BufferedOutputStream(outputStream)) {

            boolean eof = false;

            while (!eof){
                int byteValue = inbound.read();
                outbound.write(byteValue);

                if (byteValue == -1 )
                    eof = true;


            }

            }catch (IOException ex){
            System.out.println("Проблемы с потоками");
            ex.printStackTrace();
        }
        }

        //2.
        public static void demoReadText(){

        try (FileInputStream fileInputStream = new FileInputStream("states.txt");
            InputStreamReader reader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader inbound = new BufferedReader(reader)){


            String str;
            while ((str = inbound.readLine()) != null){
                System.out.println(str);
            }

        }catch (IOException ex){
            System.out.println("не могу читать файл");
            ex.printStackTrace();
        }
        }


}
