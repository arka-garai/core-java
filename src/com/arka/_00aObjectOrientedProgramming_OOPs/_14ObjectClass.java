package com.arka._00aObjectOrientedProgramming_OOPs;

import java.util.Objects;

class Laptop{
        String model;
        int price;

    public Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop[" +
                "model='" + model + '\'' +
                ", price=" + price +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}
public class _14ObjectClass {
    public static void main(String[] args) {
        Laptop obj  = new Laptop("ASUS TUF A17",75_000);
        System.out.println(obj);

        Laptop obj1  = new Laptop("ASUS TUF A17",75_000);
        System.out.println(obj1);

        System.out.println(obj.equals(obj1));

        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());

        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
    }
}
