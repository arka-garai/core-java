package com.arka._00eEnumsAndExceptions;
import java.util.Arrays;
//enum means enumeration ( i.e. listing things)
//An enum in Java is a special data type that represents a group of named constants.
//Status is the enum name.
//each named constant (Running, Failed, Pending, Success) is actually a public static final object of type Status.
enum Status{
    Running, Failed, Pending, Success
}


public class _00enumDemo {
    public static void main(String[] args) {
        Status s3 = Status.Success;
        System.out.println(s3);

        System.out.println(s3.ordinal());
        System.out.println(s3.getClass().getName());
        System.out.println(s3.getClass().getSuperclass());
        System.out.println(s3.name());
        Status s1 = Status.valueOf("Running");
        System.out.println(s1);

        System.out.println(Arrays.toString(Status.values()));

        Status[] statuses = Status.values();
        for (Status status: statuses){
            System.out.println(status +" : "+ status.ordinal());
        }

    }
}
