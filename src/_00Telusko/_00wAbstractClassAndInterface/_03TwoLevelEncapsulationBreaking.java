package _00Telusko._00wAbstractClassAndInterface;


class Outer {
    private int outer_x = 100;

    void test() {
        Inner inner = new Inner();  // Creating an Inner class object
        inner.display();            // Calling Inner's display method
    }
    class Inner {
        void display() {
            //The Inner class directly reads the outer_x variable from Outer, even though it is part of another class.
            System.out.println("outer_x: " + outer_x);
        }
        /*
        Why "2 level encapsulation breaking"?
        1.Outer hides its variables from the world (encapsulation).
        2.Inner bypasses that and accesses them directly (first break).
        3.Main method calls Inner’s method through Outer (second break).

        ✅ Key points to remember:
        Inner classes have full access to the outer class’s members.
        Outer classes do not automatically have access to inner class members.
        You can create an inner class object only through an outer class object (unless it’s static).
         */

    }
}

public class _03TwoLevelEncapsulationBreaking {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();   // This runs Inner's display() internally

    }
}
