package com.arka._00aObjectOrientedProgramming_OOPs;

// Parent class (Super/Base/Parent)
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}


public class _10HierarchialInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // Dog's own method

        Cat c = new Cat();
        c.eat();   // inherited from Animal
        c.meow();  // Cat's own method
    }

}
