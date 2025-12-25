package com.arka._00aObjectOrientedProgramming_OOPs;
class a{
    int i, j;

	/*a(){

	}*/

    a(int a, int b){
        i = a;
        j = b;
    }

    void showij(){
        System.out.println("i and j : " + i + " " + j);
    }
}

class B extends a{
    int k;

    B(int a, int b, int c)
    {

        super(a, b);
        k = c;
    }

    void showk(){
        System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("i + j + k: " + (i+j+k));
    }
}

public class _09SinglelevelInheritance2 {
    public static void main(String args[])
    {
        a superob = new a(10, 20);
        B subob = new B(2, 5, 8);

        System.out.println("Contents of superob: ");
        superob.showij();

        System.out.println();

        System.out.println("Contents of subob: ");
        subob.showk();
        subob.showij();
        subob.sum();
    }
}

