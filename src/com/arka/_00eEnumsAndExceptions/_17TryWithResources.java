package com.arka._00eEnumsAndExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _17TryWithResources {
    public static void main(String[] args) throws IOException {
        //we don't have to close the resources manually
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in) )
        {
            System.out.println("Enter a number: ");
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
            System.out.println("Enter another number: ");
            int b = sc.nextInt();
            System.out.println(b);
        }

    }
}
