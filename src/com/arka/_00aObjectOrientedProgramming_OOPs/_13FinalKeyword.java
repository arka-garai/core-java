package com.arka._00aObjectOrientedProgramming_OOPs;
/*
Final Keyword Properties in Java

Final Variable:
Cannot be reassigned once initialized
Must be initialized at declaration or in constructor
Reference is constant (for objects, not the object's content)

Final Method:
Cannot be overridden by subclasses
Implementation remains unchanged in inheritance hierarchy

Final Class:
Cannot be extended or inherited by any other class
Prevents inheritance completely
 */
public class _13FinalKeyword {
    public static void main(String[] args) {
        final int B = Integer.MAX_VALUE;//constant variable
        System.out.println(B);

    }
}
