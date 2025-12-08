package _01Dsa._00Basics;

import java.io.*;
import java.util.Scanner;

public class _06TakingInput {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter value of radius(r) : ");
    double r = Double.parseDouble(br.readLine());
    System.out.println("Area of circle : " + Math.PI * Math.pow(r, 2) + " sq. units");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter text : ");
    String a = sc.nextLine();
    System.out.print("Enter text : ");
    String a1 = sc.nextLine();
    System.out.print("Enter text : ");
    String a2 = sc.nextLine();
    System.out.print("Enter text : ");
    String a3 = sc.nextLine();
    System.out.print(a + " " + a1 + " " + " " + a2 + " " + a3);

    sc.close();

  }
}
