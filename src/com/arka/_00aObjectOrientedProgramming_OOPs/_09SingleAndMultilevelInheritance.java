package com.arka._00aObjectOrientedProgramming_OOPs;

/*
Inheritance:
Inheritance is the concept where properties & methods of base class are passed on to a derived class.
Key Terms
Base Class (Parent/Super class): The class whose properties and methods are inherited
Derived Class (Child/Sub class): The class that inherits from the base class
 */
class AdvCalc extends Calculator{//(child / derived / sub) class
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}

class VeryAdvCalc extends AdvCalc{
    public int pow(int a,int b){
        return (int) Math.pow(a,b);
    }
}

public class _09SingleAndMultilevelInheritance {
    public static void main(String[] args) {
        AdvCalc c = new AdvCalc();
        System.out.println(c.add(2,3));
        System.out.println(c.sub(2,3));

        VeryAdvCalc v = new VeryAdvCalc();
        System.out.println(v.add(2,3));
        System.out.println(v.sub(2,3));
        System.out.println(v.pow(2,3));
    }

}
