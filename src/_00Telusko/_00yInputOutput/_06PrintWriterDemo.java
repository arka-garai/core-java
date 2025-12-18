package _00Telusko._00yInputOutput;

import java.io.*;

public class _06PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\arkag\\projects\\Core-Java\\src\\_00Telusko\\_00zInputOutputFiles\\java.txt";
        FileWriter writer = null;
        PrintWriter pw = null;
        try {
            //writing inside a File
            File file1 = new File(filePath);
            writer = new FileWriter(file1, true);
            pw = new PrintWriter(writer);

            pw.println("\nWell😶‍🌫️ I love Java and you should too you know <3 !");
            pw.println(65);//prints number as it is
            pw.println(97.45);
            char[] charArr = {'⭐', 'a', 'r', 'k', 'a', '✨'};
            pw.println(charArr);

        } catch (Exception e) {
            System.out.println("Some problem");

        } finally {
            pw.close();
        }
    }
}
