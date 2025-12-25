package com.arka._00dAbstractClassAndInterface;

class A3{
    public void show(){
        System.out.println("in A3 show");
    }
}
public class _05AnonymousInnerClass {
    public static void main(String[] args) {

    //You are creating an object of the anonymous inner class that extends A3.
    //It is used when you need to override methods of a class or implement an (interface/abstract class)only once.
            A3 obj = new A3()
            {
                public void show(){
                    System.out.println("in anonymous show");
                }
            };
            obj.show();

    }
}
