package _00Telusko._00yInputOutput;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _04BufferedWriterAndFileWriterDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\arkag\\projects\\Core Java\\src\\_00zInputOutputFiles\\java.txt";
        FileWriter writer = null;
        BufferedWriter bw = null;
        try{
            //writing inside a File
            File file1 = new File(filePath);
            writer = new FileWriter(file1,true);
            bw = new BufferedWriter(writer);
            bw.write("\nWell😶‍🌫️ I love Java and you should too you know <3 !\n");
            bw.write(65);//writes its Unicode character
            bw.newLine();
            bw.write(97);//writes its Unicode character
            char[] charArr = {'\n','⭐','a','r','k','a','✨'};
            bw.write(charArr);

        } catch (Exception e) {
            System.out.println("Some problem");

        }finally {
            bw.flush();
            bw.close();
        }
    }
}
