package com.arka._00bpackagesDemo.other;
class Launch { //top level classes can't be made private, protected
    public void abc(){
        A obj = new A();
        System.out.println(obj.marks);//same package non-subclass
    }
}

public class A {
    protected int marks = 56;
    public void abc(){
        System.out.println(marks);//same class
    }
}
