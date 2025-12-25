package com.arka._00xEnumToStreamAPI;

import java.util.ArrayList;

class Candidate{
    private int id;
    private String name;

    public Candidate(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Employee{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class _30SyntaxAndUsageOfGenericsDemoTwo {
    public static void main(String[] args) {
        Candidate cd1 = new Candidate(1,"Arka");
        Candidate cd2 = new Candidate(2,"Rohan");

        Employee em = new Employee(1,"Ramesh");
        //we cannot use primitive datatypes for generics, it should be reference datatypes
        ArrayList<Candidate> list = new ArrayList<>();
        list.add(cd1);
        list.add(cd2);
        System.out.println(list);

    }
}
