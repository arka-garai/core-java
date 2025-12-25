package com.arka._00eEnumsAndExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16FinallyBlockToCloseResources {
    public static void main(String[] args) throws IOException {


        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number: ");
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);

        } finally {
            br.close();
            //finally block is used to close the resources(file, input, network connection, database connection)
        }
    }
}
