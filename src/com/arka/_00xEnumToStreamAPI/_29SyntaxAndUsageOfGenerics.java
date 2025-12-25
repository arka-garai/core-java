package com.arka._00xEnumToStreamAPI;
/*
Generics were officially introduced in Java 1.5 (Java 5) — released in September 2004.

🧩Generics:
Generics in Java allow you to write classes, interfaces, and methods that can work with
any data type — while still providing compile-time type safety.

🎯 Purpose of Generics
✅ Type Safety — Detects type errors at compile time.
✅ Code Reusability — Write one class/method for multiple data types.
✅ Eliminates Type Casting — No need to manually cast objects.
✅ Better Readability and Maintenance

💡 Basic Example: Without vs With Generics
❌ Without Generics
ArrayList list = new ArrayList();
list.add("Arka");
list.add(123); // Compiles fine (no type checking)

String name = (String) list.get(0); // Manual casting

🔴 Problem:
No compile-time checking
Requires type casting
Can cause ClassCastException

✅ With Generics
ArrayList<String> list = new ArrayList<>();
list.add("Arka");
// list.add(123); ❌ Compile-time error

String name = list.get(0); // No casting needed ✅


Here, the compiler ensures that only String objects can be added to the list.

🔷 Generic Class Example
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(100);

        Box<String> strBox = new Box<>();
        strBox.set("Hello");

        System.out.println(intBox.get());
        System.out.println(strBox.get());
    }
}


🧠 T is a type parameter (can be replaced with any data type — Integer, String, etc.)

🔸 Generic Method Example
public <T> void printData(T data) {
    System.out.println(data);
}

printData(10);
printData("Hello");
printData(5.7);


Here <T> is declared before the return type — it makes the method generic.

⚙️ Multiple Type Parameters Example
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void show() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "Arka");
        p1.show();
    }
}

🧱 Common Generic Type Parameters
 Symbol	Meaning
    T	Type
    E	Element (used in collections)
    K	Key
    V	Value
    N	Number
 */
import java.util.ArrayList;

public class _29SyntaxAndUsageOfGenerics {
    public static void main(String[] args) {
        //type safety with generics
        ArrayList<String> list = new ArrayList<>();
        list.add("arka");
        list.add("Rohan");
        list.add("lol");
        //list.add(23); compile time error
        String name1 = list.get(0);
        System.out.println(name1.toUpperCase());

        String name2 = list.get(1);
        System.out.println(name2.toLowerCase());

        String name3 = list.get(2);
        System.out.println(name3.toLowerCase());

    }
}
