package com.arka._00xEnumToStreamAPI;

import java.util.Arrays;
import java.util.List;

public class _39MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arka","Laxmi","Kajal","Ram");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        upperCaseNames.forEach(System.out::println);

        //System.out.println(upperCaseNames);
    }
}
