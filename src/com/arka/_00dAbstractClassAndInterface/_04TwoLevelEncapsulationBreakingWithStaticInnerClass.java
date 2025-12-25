package com.arka._00dAbstractClassAndInterface;

class Outer1 {
    private static int outer_x = 100;

    void test() {

    }
    static class Inner1 {
        static void display() {
            System.out.println("outer_x: " + outer_x);
        }

    }
}

public class _04TwoLevelEncapsulationBreakingWithStaticInnerClass {
    public static void main(String[] args) {
        Outer1.Inner1.display();
    }
}
