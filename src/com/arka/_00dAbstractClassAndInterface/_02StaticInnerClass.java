package com.arka._00dAbstractClassAndInterface;

class A1{
    int age;

    public void show(){
        System.out.println("in show");
    }
    static class B1{ //static (inner class/ nested class)
        public void config(){
            System.out.println("in config");
            A1 obj = new A1();
            int age1 = obj.age;
            obj.show();
        }
//        Non-static inner class → automatically tied to an outer class object → can access all members
//        (static + instance, including private) without creating an outer object.

//        Static nested class → tied only to the outer class, not its object → can only directly access
//        static members.

    }
}
public class _02StaticInnerClass {
    public static void main(String[] args) {
        A1.B1 obj1 = new A1.B1();
        obj1.config();
    }
}
