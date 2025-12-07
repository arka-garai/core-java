package _00Telusko._00packagesDemo;

import _00Telusko._00packagesDemo.other.A;
import _00Telusko._00packagesDemo.other.B;

class C extends A {
    public void abc(){
        System.out.println(marks);//different package subclass
    }

}

public class Demo {
    public static void main(String[] args) {

        A obj = new A();
        //System.out.println(obj.marks);//can't be accessed in different package non-subclass
        B obj1 = new B();
        //System.out.println(obj1.marks);//can't be accessed in different package
    }
}
