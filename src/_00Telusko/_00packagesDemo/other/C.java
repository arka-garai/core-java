package _00Telusko._00packagesDemo.other;

public class C {
    public void abc(){
        A obj = new A();
        System.out.println(obj.marks);//same package non-subclass
        Launch l = new Launch();

    }


}

class PreLaunch extends A {
    public void abcd(){
        System.out.println(marks);//same package subclass
        Launch l = new Launch();

    }
}