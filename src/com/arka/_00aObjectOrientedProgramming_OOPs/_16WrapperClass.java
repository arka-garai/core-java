package com.arka._00aObjectOrientedProgramming_OOPs;

public class _16WrapperClass {
    public static void main(String[] args) {
        int n1 = 2;
        Integer n2 = n1; //Auto-boxing
        int n3 = n2; //Auto-Unboxing

        String str = "12";
        int n4 = Integer.parseInt(str);
        System.out.println(n4*2);
    }
}
