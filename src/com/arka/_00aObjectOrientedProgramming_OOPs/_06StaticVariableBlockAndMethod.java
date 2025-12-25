package com.arka._00aObjectOrientedProgramming_OOPs;
/*
✅ Static Keyword
The static keyword in Java is used to create class-level members.
A static variable or method belongs to the class, not to individual objects,
and therefore all objects share the same single copy.

⭐ Detailed Points
i) Static variables behave like global variables within the same class.
They exist at the class level and do not belong to any specific object.

ii) Only one shared copy of a static variable exists.
All instances access the same memory location for static data, ensuring consistency.

iii) Static methods can directly access other static members.
Within the same class, they can be used directly.
From other classes, static members are accessed using the class name:
ClassName.staticVar;
ClassName.staticMethod();

iv) Static members cannot be accessed using this or super.
These keywords refer to objects, but static members belong to the class, not objects.

*/
class Mobile{
    String brand;
    int price;
    static String name;

    static {
        name = "SmartPhone";
        System.out.println("in static block");
    }
     public Mobile() {

         brand="";
         price = 200;
        System.out.println("in constructor block");
     }
    public void show(){ //we can use static and non-static variables inside non-static methods directly
        System.out.println(brand+" : "+price+" : "+name);
    }

    public static void show1(Mobile m){
        System.out.println(m.brand+" : "+m.price+" : "+name);
    }
}

public class _06StaticVariableBlockAndMethod {
    public static void main(String[] args) {
        //After Class Loading (by ClassLoader)-> Static Block Executes (This happens only once per class)
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 28_000;
        m1.show();
        Mobile m2 = new Mobile();
        m2.brand = "Motorola";
        m2.price = 20_000;
        m2.show();
        Mobile.show1(m1);
    }
}
