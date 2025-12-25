package com.arka._00aObjectOrientedProgramming_OOPs;
/******** Passing objects to a method ********/

class Test{
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }

    boolean equals(Test o){
        if(o.a == a && o.b == b)  // o.a == ob2.a /// a == ob1.a
            return true;
        else
            return false;
    }
}

public class _01PassOb{
    public static void main(String[] args){
        Test ob1 = new Test(20,10);
        Test ob2 = new Test(20,10);
        Test ob3 = new Test(5,7);

        System.out.println("ob1 == ob2? :" + ob1.equals(ob2));
        System.out.println("ob1 == ob3? :" + ob1.equals(ob3));
        System.out.println("ob2 == ob3? :" + ob2.equals(ob3));
    }
}