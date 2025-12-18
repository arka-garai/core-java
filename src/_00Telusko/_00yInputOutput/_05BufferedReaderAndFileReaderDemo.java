package _00Telusko._00yInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _05BufferedReaderAndFileReaderDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\arkag\\projects\\Core-Java\\src\\_00Telusko\\_00zInputOutputFiles\\java.txt";
        FileReader reader = null;
        BufferedReader br = null;

        try{
            //Reading form a File
            File file1 = new File(filePath);
            reader = new FileReader(file1);
            br = new  BufferedReader(reader);

            String str =  br.readLine();
            while(str != null){
                System.out.println(str);
                str = br.readLine();
            }


        } catch (Exception e) {
            System.out.println("Some problem");

        }finally {
            br.close();
        }
    }

}
