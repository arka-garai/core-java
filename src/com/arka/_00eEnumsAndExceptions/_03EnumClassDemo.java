package com.arka._00eEnumsAndExceptions;
/*enum keyword →
An enumeration (or "enum") in Java is a special data type that represents a fixed set of constants.
It's used when you have a variable that should only take one value from a predefined list of possible values.
What is an Enumeration?
Think of it as a way to define a collection of named constants that are related to each other. For example:

Days of the week (MONDAY, TUESDAY, etc.)
Directions (NORTH, SOUTH, EAST, WEST)
Status values (ACTIVE, INACTIVE, PENDING)

Under the hood, the compiler converts it into a final class that implicitly extends the built-in abstract class java.lang.Enum.

java.lang.Enum class <-- The superclass of all enums in Java.
It provides methods like .name(), .ordinal(), .compareTo(), .equals(), .values() etc.
You never extend it yourself — the compiler does it automatically.*/

//so,enums can have methods, fields, and constructors.
enum Laptop {
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class _03EnumClassDemo {
    public static void main(String[] args) {
//        Laptop lap = Laptop.Macbook;
//        System.out.println(lap +" : "+ lap.getPrice());
          Laptop[] laptops= Laptop.values();
        for (Laptop laptop : laptops) {
            System.out.println(laptop +" : "+laptop.getPrice());
        }

    }
}
