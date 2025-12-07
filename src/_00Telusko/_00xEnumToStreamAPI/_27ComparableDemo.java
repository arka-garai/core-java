package _00Telusko._00xEnumToStreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[" +
                "age=" + age +
                ", name='" + name + '\'' +
                ']';
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }

}

public class _27ComparableDemo {
    public static void main(String[] args) {
        //can use our own logic for sorting
        //Comparator is functional interface. so we can use lambda expression as well.
        Comparator<Student> comp = new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.age < o2.age) ? 1 : -1;
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21,"Arka"));
        studs.add(new Student(18,"Kiran"));
        studs.add(new Student(20,"John"));
        studs.add(new Student(16,"Soubhik"));
        //we can override the logic of Comparable by Comparator
        Collections.sort(studs,comp);

        for (Student stud : studs) {
            System.out.println(stud);
        }
    }
}
