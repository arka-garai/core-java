package com.arka._00yInputOutput;

import java.io.File;

public class _01MoreOnFileClass {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\arkag\\projects\\Core-Java\\src\\_00Telusko\\_00zInputOutputFiles\\java.txt";
        String dirPath = "C:\\Users\\arkag\\projects\\Core-Java\\src\\_00Telusko\\_00zInputOutputFiles\\Dir";
        try{
            //File
            File file1 = new File(filePath);
            System.out.println(file1.exists());
            System.out.println(file1.getPath());
            System.out.println(file1.isDirectory());

            //Folder
            File dir1 = new File(dirPath);
            System.out.println(dir1.exists());
            System.out.println(dir1.isFile());

            //name of files and folders present in a folder
            File file2 = new File("C:\\Users\\arkag\\projects\\Core-Java\\src\\_00Telusko\\_00zInputOutputFiles");
            String[] names = file2.list();
            System.out.println("--List--");
            for (String name : names) {
                System.out.println(name);
            }

        } catch (Exception e) {
            System.out.println("Some problem");
        }
    }
}
