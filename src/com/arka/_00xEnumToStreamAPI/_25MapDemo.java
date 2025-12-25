package com.arka._00xEnumToStreamAPI;

import java.util.Hashtable;
import java.util.Map;

public class _25MapDemo {
    public static void main(String[] args) {
//Map<String, Integer> students = new HashMap<>();//unordered + keys are unique(≡set) + values can be repeated(≡list)
        Map<String, Integer> students = new Hashtable<>();//Hashtable is synchronized
        students.put("Arka",56);
        students.put("Harsh",26);
        students.put("Raj",86);
        students.put("Navin",46);
        students.put("Kiran",15);
        students.put("Harsh",56);

        System.out.println( students.remove("Navin",46));
        System.out.println( students.remove("Arka"));

        System.out.println(students.replace("Harsh",34));
        System.out.println(students.replace("Raj",86,39));

        for (String key : students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }

        //System.out.println(students);
    }
}
