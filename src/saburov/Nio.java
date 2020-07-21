package saburov;

import java.io.*;

import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;


public class Nio {
    public static void main(String[] args) throws Exception{
        demoChanel();

    }
    static void demoChanel(){
        try(
                FileInputStream fileIn = new FileInputStream ("D:\\java\\антон сабуров\\лекции\\Потоки ввода-вывода - IO и NIO.mp4");
                FileOutputStream fileOut = new FileOutputStream("testNio.mp4");

                FileChannel inChannel = fileIn.getChannel();
                FileChannel outChannel = fileOut.getChannel();


        ){
            ByteBuffer inbound = ByteBuffer.allocate(4096);
            ByteBuffer outbound = ByteBuffer.allocate(4096);

             int toBuffer;
             //1. Заполняем входной буффер(читаем в буффер)
             while ((inChannel.read(inbound))!= -1){
                 //2. "Переворачиваем" входной буффер для чтения из него
                 inbound.flip();
                 while (inbound.hasRemaining()){ //пока там что то есть
                     //3. Вытаскием из входного буффера
                     byte fromBuffer = inbound.get();
                     //4. Закидываем в выходной буффер
                     outbound.put(fromBuffer);
                 }
                 //5. "Переворачиваем" выходной буфер
                 outbound.flip();
                 //6. пишем в выходной канал
                 outChannel.write(outbound);
                 inbound.clear();// не забываем чистить буфер
                 outbound.clear();

             }


        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    static void demoTransfer () {
        try (
                FileInputStream fileIn = new FileInputStream("D:\\java\\антон сабуров\\лекции\\Потоки ввода-вывода - IO и NIO.mp4");
                FileOutputStream fileOut = new FileOutputStream("testTransfer.mp4");

                FileChannel inChannel = fileIn.getChannel();
                FileChannel outChannel = fileOut.getChannel();
        ) {



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

