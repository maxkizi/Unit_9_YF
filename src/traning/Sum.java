package traning;

import java.io.*;

public class Sum {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/input.txt")));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")))) {
            recordFile(bw, br);

        } catch (IOException ex) {
            System.out.println("Some problem with IO");
            ex.printStackTrace();
        }
    }

    public static void recordFile(BufferedWriter bw, BufferedReader br) throws IOException {
        String num[] = getNumbers(br);
        int sum = 0;
        for (int i = 0; i < num.length; i++){
            sum += Integer.parseInt(num[i]);
        }
        String result = String.valueOf(sum);
        bw.write(result);
    }

    private static String[] getNumbers(BufferedReader br) throws IOException {
        String result[] = br.readLine().split("\\s+");
        return result;
    }


}
