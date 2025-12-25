package com.arka._00aObjectOrientedProgramming_OOPs;

class BaseClass{
    public String show(String a){
        return a;
    }
}
class DerivedClass extends BaseClass{
    public int show(int a){
        return a;
    }
}
public class _02OverloadingInInheritance {
    public static void main(String[] args) {
        BaseClass b = new BaseClass();
        String name = b.show("arka");

        DerivedClass d = new DerivedClass();
        int num = d.show(29);
        String name1 = d.show("arka");
        System.out.println(name + " : "+num);

    }
}
