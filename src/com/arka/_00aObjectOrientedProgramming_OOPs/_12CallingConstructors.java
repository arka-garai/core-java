package com.arka._00aObjectOrientedProgramming_OOPs;

class Aa{
    Aa(){
        System.out.println("Aa's constructor");
    }
}

class Bb extends Aa{
    Bb(){
        System.out.println("Bb's constructor");
    }
}

class C extends Bb{
    C(){
        System.out.println("C's constructor");
    }
}
public class _12CallingConstructors {
    public static void main(String[] args) {
        //constructor chaining
//        a super constructor call is always made when you create an object of a child class.
          C c = new C();
    }
}
