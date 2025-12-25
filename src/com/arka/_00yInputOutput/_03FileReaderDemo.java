package com.arka._00yInputOutput;

import java.io.*;

public class _03FileReaderDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\arkag\\projects\\Core-Java\\src\\_00Telusko\\_00zInputOutputFiles\\java.txt";
        FileReader reader = null;
        try{
            //Reading from a File
            File file1 = new File(filePath);
            reader = new FileReader(file1);

            //m-1
            char[] charArr = new char[(int) file1.length()];
            reader.read(charArr);

            for (char c : charArr) {
                System.out.println(c);
            }

            //m-2
//            int i = reader.read();
//            while (i!=-1){ //i = -1 signifies end of file
//                System.out.println(i+ "->" + (char)i);//reads one character at a time and returns its Unicode value
//                i = reader.read();
//            }


        } catch (Exception e) {
            System.out.println("Some problem");

        }finally {
            reader.close();
        }
    }
}
