package com.arka._00dAbstractClassAndInterface;

class A{
    private int age = 8;

    public void show(){
        System.out.println("in show");
    }
    class B{//inner class/ nested class
        public void config(){
            System.out.println("in config");
            System.out.println(age);
            show();
        }
    }
}

public class _01InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        //member inner class
        A.B obj1 = obj.new B();
        obj1.config();
    }
}
