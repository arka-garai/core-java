package com.arka._00xEnumToStreamAPI;

@FunctionalInterface
interface A3 {
    void show(int i);
}

//java 8 feature : lambda expression only works with functional interface
public class _06LambdaExpressionDemo {
    public static void main(String[] args) {
        A3 obj = i -> System.out.println("in show " + i);
        obj.show(3);
    }
}
