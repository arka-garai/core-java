package _00Telusko._00yInputOutput;

import java.io.*;

class Student5 implements Serializable {
    private int id;
    //selective serialization
    transient private String name;//not a part of serialized object
    private int age;

    // Constructor
    public Student5(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

public class _07SerializationAndDeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // ---------- SERIALIZATION (COMMENTED) ----------
//
//        Student5 stu1 = new Student5(1, "Rohan", 16);
//        System.out.println(stu1);
//        try {
//            FileOutputStream fos = new FileOutputStream("C:\\Users\\arkag\\projects\\Core Java\\src\\_00zInputOutputFiles\\serial.txt");
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//            ObjectOutputStream oos = new ObjectOutputStream(bos);
//
//            // serialize object
//            oos.writeObject(stu1);
//            System.out.println("Please check the file to see serialized object");
//
//            oos.close();
//            fos.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        // ---------- DESERIALIZATION ----------
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\arkag\\projects\\Core Java\\src\\_00zInputOutputFiles\\serial.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            // deserialize object
            Student5 stu2 = (Student5) ois.readObject();
            System.out.println("Deserialized object: " + stu2);

            ois.close();
            fis.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
