package com.arka._00eEnumsAndExceptions;


public class _15FinallyBlockDemo {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        try {
            j = 18/i;
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        finally {//block will be executed irrespective of the exception
            System.out.println("bye");
        }
    }
}
