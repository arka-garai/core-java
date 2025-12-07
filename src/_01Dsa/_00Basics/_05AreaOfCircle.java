package _01Dsa._00Basics;

import java.util.Scanner;

public class _05AreaOfCircle {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter value of radius(r) : ");
      double r = sc.nextDouble();
      System.out.println("Area of circle : " + Math.PI*Math.pow(r,2)+" sq. units");
  }
}
