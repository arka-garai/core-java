package _00Telusko._00xEnumToStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student4{
    private int age;
    private String name;

    public Student4() {
    }

    public Student4(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student4[" +
                "age=" + age +
                ", name='" + name + '\'' +
                ']';
    }
}
public class _40ConstructorReferenceDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arka","Laxmi","Kajal","Ram");
        List<Student4> students = new ArrayList<>();

//        for (String name : names) {
//            students.add(new Student4(name));
//        }
        students = names.stream()
                        .map(Student4::new)
                        .toList();

        students.forEach(System.out::println);
    }
}
