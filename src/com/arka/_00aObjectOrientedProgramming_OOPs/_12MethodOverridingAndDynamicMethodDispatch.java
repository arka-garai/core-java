package com.arka._00aObjectOrientedProgramming_OOPs;
/*
Polymorphism is an OOP principle where a single entity — like a method, operator(+), or object —
can take multiple forms and behave differently depending on the context.

Polymorphism is a core concept in object-oriented programming (OOP) that allows methods to do
different things based on the object it is acting upon, even though the method name and its signature
might be the same.

Types of Polymorphism in Java:

1. Compile-Time Polymorphism (Static Polymorphism/ early binding)
occurs when the call to an overloaded method is resolved at compile time by the compiler.
a) Method Overloading
Same method name, different parameters (number, type, or order) in the same class.
b) Constructor Overloading
Multiple constructors with different parameters in the same class.

2. Runtime Polymorphism (Dynamic Polymorphism/ late binding/Dynamic method dispatch)
occurs when the call to an overridden method is resolved at runtime by JVM
based on the actual object type, not the reference variable's type.
a) Method Overriding
When a derived class provides its own implementation of a method that is already
defined in its base class, it's called method overriding.

Dynamic Method Dispatch in Java
Dynamic Method Dispatch is the mechanism by which a call to an overridden method is
resolved at runtime rather than compile-time. It is the foundation of runtime polymorphism in Java.

*/
class A2 {
    int a = 4;
    void show() {
        System.out.println("Show method in A2 (Parent class)");
    }
}


class B2 extends A2 {
    int a = 2;
    @Override
    void show() {
        super.show();
        System.out.println("a" + super.a);
        System.out.println("Show method in B2 (Child class)");
    }
}

public class _12MethodOverridingAndDynamicMethodDispatch {
    public static void dispatch(A2 o) {
        o.show();
    }
    public static void main(String[] args) {
        A2 obj1 = new A2();   // Parent reference + Parent object
        obj1.show();          // Calls A2's show()

        B2 obj2 = new B2();   // Child reference + Child object
        obj2.show();          // Calls B2's show()

       // superclass variable can reference a subclass object
        obj1 = new B2();   // Parent reference + Child object
        obj1.show();       // Calls B2's show() → Runtime polymorphism
        dispatch(obj1);
    }
}
/* Method Overriding */
//class A{
//    int i,j;
//
//    A(int a, int b)
//    {
//        i = a;
//        j = b;
//    }
//
//    void show(){
//        System.out.println("i and j: " + i + " " + j);
//    }
//}
//
//class B extends A{
//    int k;
//
//    B(int a, int b, int c){
//        super(a, b);
//        k = c;
//    }
//
//    void show(){
//        System.out.println("k: " + k);
//    }
//
//}
//
//class Override{
//    public static void main(String args[]){
//        B subob = new B(1,2,3);
//        subob.show();
//    }
//}

/* Dynamic Method Dispatch / Runtime Polymorphism */
//
//class A{
//    void callme(){
//        System.out.println("Inside A's callme method.");
//    }
//}
//
//class B extends A{
//    void callme(){
//        System.out.println("Inside B's callme method.");
//    }
//}
//
//class C extends A{
//    void callme(){
//        System.out.println("Inside C's callme method.");
//    }
//}
//
//class Dispatch{
//    public static void main(String args[])
//    {
//        A a = new A();
//        B b = new B();
//        C c = new C();
//
//        A r; //superclass reference
//
//        r = a;
//        r.callme();
//
//        r = b;
//        r.callme();
//
//        r = c;
//        r.callme();
//    }
//}