package _00Telusko._00ObjectOrientedProgramming_OOPs;

class A{
    public A(){
        System.out.println("Object created");
    }
    public void show(){
        System.out.println("in A show");

    }
}
public class _08AnonymousObject {
    public static void main(String[] args) {
        //anonymous object
        new A().show();
    }
}
