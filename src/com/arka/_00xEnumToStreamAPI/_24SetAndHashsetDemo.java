package com.arka._00xEnumToStreamAPI;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class _24SetAndHashsetDemo {
    public static void main(String[] args) {

        //Collection<Integer> nums = new HashSet<>(); //unique elements + Unordered, no guarantee of order.
        //Set<Integer> nums = new HashSet<>(); //unique elements + Unordered, no guarantee of order.
        Set<Integer> nums = new TreeSet<>();//Maintains elements in sorted (natural/custom) order.
        nums.add(62);
        nums.add(25);
        nums.add(58);
        nums.add(62);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println( values.next()  );


//        for (Integer num : nums) {
//            System.out.println(num);
//        }
    }
}
