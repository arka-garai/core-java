package _00Telusko._00yInputOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _02FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\arkag\\projects\\Core Java\\src\\_00zInputOutputFiles\\java.txt";
        FileWriter writer = null;
        try{
            //writing inside a File
            File file1 = new File(filePath);
            writer = new FileWriter(file1,true);
            writer.write("\nWell😶‍🌫️ I am enjoying Java and you should too you know <3 !\n");
            writer.write(65);//writes its Unicode character
            writer.write(97);//writes its Unicode character
            char[] charArr = {'\n','⭐','a','r','k','a','✨'};
            writer.write(charArr);

        } catch (Exception e) {
            System.out.println("Some problem");

        }finally {
            writer.close();
        }

    }
}
