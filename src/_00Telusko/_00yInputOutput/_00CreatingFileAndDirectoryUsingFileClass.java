package _00Telusko._00yInputOutput;

import java.io.File;

public class _00CreatingFileAndDirectoryUsingFileClass{
    public static void main(String[] args) {
        try{
            //File creation
            File file1 = new File("C:\\Users\\arkag\\projects\\Core Java\\src\\_00zInputOutputFiles\\java.txt");
            System.out.println(file1.exists());
            System.out.println(file1.createNewFile());
            System.out.println(file1.exists());

            //Folder creation
            File dir1 = new File("C:\\Users\\arkag\\projects\\Core Java\\src\\_00zInputOutputFiles\\Dir");
            System.out.println(dir1.exists());
            System.out.println(dir1.mkdir());
            System.out.println(dir1.exists());

        } catch (Exception e) {
            System.out.println("Some problem");
        }
    }
}
