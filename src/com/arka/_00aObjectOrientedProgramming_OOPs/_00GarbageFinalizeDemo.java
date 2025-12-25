package com.arka._00aObjectOrientedProgramming_OOPs;
/*
----------------------------------------------------------
                Garbage Collection (Definition)
----------------------------------------------------------
Garbage Collection (GC) in Java is an automatic process that
removes objects from memory when they are no longer reachable.
The programmer cannot explicitly destroy objects; instead,
Java's garbage collector frees memory automatically.

We can request garbage collection using:
    System.gc();

----------------------------------------------------------
                finalize() Method (Definition)
----------------------------------------------------------
The finalize() method is called by the Garbage Collector
before removing an object from memory. It is used to perform
cleanup operations (like closing files, releasing resources).

Syntax:
    protected void finalize()

Note: finalize() is deprecated in recent Java versions, but
still asked in exams and works in older Java versions.
----------------------------------------------------------
*/

class Box1 {
    private int id;

    Box1(int id) {
        this.id = id;
        System.out.println("Box1 object created with id: " + id);
    }
    // finalize() method implementation
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called for Box1 id: " + id);
    }
}
public class _00GarbageFinalizeDemo {
    public static void main(String[] args) {

        // ---- Garbage Collection Example ----
        System.out.println("\nGarbage Collection Example:");

        Box1 b1 = new Box1(1);       // creating object
        Box1 b2 = b1;               // assigning reference

        // Making both references null
        b1 = null;
        b2 = null;

        // Requesting garbage collector
        System.out.println("Requesting garbage collection...");
        System.gc();  // Request to garbage collector

        //Delay to ensure GC executes
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
