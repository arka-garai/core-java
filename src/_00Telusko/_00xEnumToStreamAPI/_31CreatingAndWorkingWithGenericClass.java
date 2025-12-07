package _00Telusko._00xEnumToStreamAPI;

class Student1<T>{
    T obj;

    public Student1(T obj) {
        this.obj = obj;
    }
    public void display(){
        System.out.println("Type of data passed here T : "+obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }
}

public class _31CreatingAndWorkingWithGenericClass {
    public static void main(String[] args) {
        Student1<Integer> st = new Student1<>(10);
        st.display();
        System.out.println(st.getObj());
        Student1<String> st1 = new Student1<>("Java");
        st1.display();
        System.out.println(st1.getObj());

    }
}
