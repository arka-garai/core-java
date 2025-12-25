package com.arka._00xEnumToStreamAPI;
/*
🌊 Stream API — Introduction
📦 Introduced in:
➡️ Java 8 (JDK 1.8) — alongside the java.time package (in March 2014).

🧠 Definition

The Stream API in Java is used to process collections of data (like lists, sets, arrays)
in a functional and declarative way — meaning, you focus on what to do, not how to do it.

In short:
Stream = a pipeline of data operations (like filter, map, sort, collect).

🎯 Purpose
The Stream API was introduced to:
✅ Simplify bulk data operations on Collections.
✅ Support functional programming using Lambda expressions.
✅ Enable parallel processing (faster performance on multicore systems).
✅ Make code cleaner, shorter, and more expressive.


 */
import java.util.Arrays;
import java.util.List;

public class _34NeedOfStreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

          //normal for loop
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.println(nums.get(i));
//        }

         //Enhanced For loop
//        for (int n : nums){
//            System.out.println(n);
//        }

        //forEach method
        nums.forEach(n -> System.out.println(n));

//        int sum= 0;
//        for (int n : nums) {
//            if(n%2 == 0){
//                n = n*2;
//                sum +=n;
//            }
//        }
//        System.out.println(sum);
    }
}

