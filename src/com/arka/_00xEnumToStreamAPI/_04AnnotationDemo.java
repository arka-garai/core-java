package com.arka._00xEnumToStreamAPI;

/* An annotation in Java is metadata that provides supplementary information to
the compiler and the JVM, without being part of the program logic. */

@Deprecated
class A {

    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A show");
    }

}
class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClass(){
// @Override tells compiler this method must override a parent method
        System.out.println("in B show");
    }

}
public class _04AnnotationDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
