package com.arka._00cArrays;
/*
A 1D array is a collection of elements of the same data type
stored in consecutive memory locations and accessed using an index.

A 2D array in Java is an array of arrays,
used to store data in a row and column format (like a matrix or table).
*/
public class _00ArrayCreation{
    public static void main(String[] args) {
        //1D array
        int[] nums = {1,2,3};
        System.out.println("size: "+nums.length);

        for (int num : nums) {
            System.out.print(num+" ");
        }

        //2D array
        int[][] marks = new int[3][4];

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = (int) (Math.random() * (100));
            }
        }

        System.out.println();
//        for (int i = 0; i < marks.length; i++) {
//            for (int j = 0; j < marks[i].length; j++) {
//                System.out.print(marks[i][j]+" ");
//            }
//            System.out.println();
//        }

        for (int[] mark : marks) {
            for(int m : mark){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
