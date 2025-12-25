package com.arka._00aObjectOrientedProgramming_OOPs;
/*
Encapsulation is defined as the wrapping up of class members i.e. data members (instance variables)
& methods under a single unit.It also implements data hiding.

Data Hiding: The internal state of an object is hidden from the outside world. Access to this data is controlled
through public methods (getters and setters).

Access Modifiers: Access modifiers (private,protected,public) are the mechanism that enables encapsulation
by controlling the accessibility of class members (data and methods).

*/
class Human{
    private int age;
    private String name;

    public Human() {//default constructor
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //this keyword refers to the current object/instance which is calling the setAge method.
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class _07Encapsulation {
    public static void main(String[] args) {
        Human h = new Human(); //referenced object
        h.setAge(22);
        h.setName("Arka");
        System.out.println(h.getAge());
        System.out.println(h.getName());

        Human h1  = new Human(29,"Arian");
        System.out.println(h1.getAge());
        System.out.println(h1.getName());

    }
}
