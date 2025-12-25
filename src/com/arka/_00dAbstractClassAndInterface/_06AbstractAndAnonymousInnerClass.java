package com.arka._00dAbstractClassAndInterface;
abstract class A4{
    static int age = 8;
    public abstract void show();
    public abstract void config();
}
public class _06AbstractAndAnonymousInnerClass {
    public static void main(String[] args) {
        A4 obj = new A4(){

            @Override
            public void show() {
                System.out.println("in anonymous show");
            }

            @Override
            public void config() {
                System.out.println("in anonymous config");
            }
        };
        obj.show();
        obj.config();
    }
}
