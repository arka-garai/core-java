package _00Telusko._00vArrays;

class Student{
    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ']';
    }
}
public class _03ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student("arka",29);
        Student s2 = new Student("sonu",9);
        Student s3 = new Student("kajal",2);
        Student s4 = new Student("drake",34);
        Student[] students = new Student[4];// array of Student references

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

//        for (int i = 0; i < students.length; i++) {
//            System.out.print(students[i]+" ");
//        }

        for (Student student : students) {
            System.out.print(student+" || ");
        }
    }
}
