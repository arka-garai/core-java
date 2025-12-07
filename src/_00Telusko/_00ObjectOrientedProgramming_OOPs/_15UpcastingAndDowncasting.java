package _00Telusko._00ObjectOrientedProgramming_OOPs;

class Animal1 {
    void eat() {
        System.out.println("Animal eating");
    }
}

class Dog1 extends Animal1 {
    void eat() {
        System.out.println("Dog eating");
    }

    void bark() {
        System.out.println("Dog barking");
    }
}

public class _15UpcastingAndDowncasting {
    public static void main(String[] args) {

        // UPCASTING - Automatic (Child to Parent)
        Animal1 a = new Dog1();
        a.eat();        // Works - Dog eating
        // a.bark();    // Error - Cannot access bark()
        System.out.println(a instanceof Dog1);
        System.out.println(a instanceof Animal1);
        // DOWNCASTING - Manual (Parent to Child)
        Dog1 d = (Dog1) a;
        d.bark();       // Works - Dog barking
        d.eat();        // Works - Dog eating
        System.out.println(d instanceof Dog1);
        System.out.println(d instanceof Animal1);
        //  DOWNCASTING - Manual (Parent to Child)
        ((Dog1)a).bark();
    }
}