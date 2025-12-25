package com.arka._00eEnumsAndExceptions;
/*
What is a Stream?
A stream is a sequence of data flowing from one place to another. Think of it like a pipe that carries data.

Input stream - Data flowing INTO your program (like keyboard input)
Output stream - Data flowing OUT of your program (like console output)

Standard Streams in Java
Every Java program has 3 standard streams automatically available:

1. stdin (Standard Input) - System.in
Direction: INTO the program
Source: Keyboard, file, or another program
Example: Reading user input
Scanner scanner = new Scanner(System.in);  // Reading from stdin
String input = scanner.nextLine();

2. stdout (Standard Output) - System.out
Direction: OUT of the program
Destination: Console/terminal (normal output)
Purpose: Regular program output
Example: Displaying results
System.out.println("Hello World");  // Goes to stdout

3. stderr (Standard Error) - System.err
Direction: OUT of the program
Destination: Console/terminal (error output)
Purpose: Error messages and diagnostics
Example: Showing errors
System.err.println("Error occurred!");
 */
import java.io.IOException;

public class _12UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number : ");
        int num = System.in.read();//returns ascii value of input character
        //it reads only one character at a time
        System.out.println(num - 48);

    }
}
