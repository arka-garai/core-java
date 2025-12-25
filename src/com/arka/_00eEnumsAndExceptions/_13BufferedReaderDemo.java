package com.arka._00eEnumsAndExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _13BufferedReaderDemo {
    public static void main(String[] args) throws IOException {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        System.out.println("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        //close the resource
        br.close();

    }
}
