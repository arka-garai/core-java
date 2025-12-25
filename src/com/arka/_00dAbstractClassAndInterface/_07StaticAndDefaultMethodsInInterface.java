package com.arka._00dAbstractClassAndInterface;

// Interface demonstrating default method using `this`
interface MyInterface {

    void show();

    // Default method using `this`
    default void display() {
        System.out.println("Inside default method of interface");

        // `this` refers to the implementing class object
        this.show();
    }

    static void info() {
        System.out.println("Static method inside interface");
    }
}

// Implementing class
class MyClass implements MyInterface {

    @Override
    public void show() {
        System.out.println("Show method implemented in MyClass");
    }
}

public class _07StaticAndDefaultMethodsInInterface {
    public static void main(String[] args) {

        MyInterface obj = new MyClass();

        // Calling default method
        obj.display();

        // Calling static method
        MyInterface.info();
    }
}
