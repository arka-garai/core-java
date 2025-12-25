package com.arka._00dAbstractClassAndInterface;
/*
Abstraction:
Hiding all the unnecessary details and showing only the important parts to the user.

Key Points:
Focuses on WHAT an object does, not HOW it does it.
Hides implementation complexity
Achieved through abstract classes and interfaces

An abstract class is a class that cannot be instantiated (we cannot create objects of it directly)
and is used as a blueprint for other classes.It can have both abstract methods (without body)
and concrete methods (with body).

1) Syntax of an abstract method
abstract returnType methodName(parameter_list);
An abstract method has no body.

2) If a class contains even one abstract method, the class must be declared as abstract.
A class cannot contain an abstract method unless the class itself is abstract.

3) A class can be declared abstract even without any abstract method.
This means an abstract class may contain:
zero abstract methods, or
one or more abstract methods.

4) Objects of an abstract class cannot be created.
However, a programmer can declare reference variables of an abstract class type.
Example:
AbstractClass ref;

5) Every abstract method of the superclass must be overridden
in the subclass (unless the subclass is also abstract).
A concrete subclass must provide implementation for all inherited abstract methods.

6) If a subclass is unable to implement all abstract methods of its superclass,
it must also be declared abstract.
This allows the subclass to “skip” the responsibility of defining those abstract methods.
 */


abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Music Playing...");
    }
}

abstract class WagonR extends Car{

    public void drive() {
        System.out.println("Driving..");
    }
}

class UpdatedWagonR extends WagonR{ //concrete class

    public void fly() {
        System.out.println("Flying...");
    }
}

public class _00AbstractKeyword {
    public static void main(String[] args) {
        Car c = new UpdatedWagonR();
        c.drive();
        c.playMusic();
        c.fly();
    }
}
