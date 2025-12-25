package com.arka._00cArrays;

public class _02Demo3DArray {
    public static void main(String[] args) {
        int[][][] nums = new int[3][4][5];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = (int) (Math.random()*100);
                }
            }
        }

        int l = 0;
        for (int[][] num : nums){
            System.out.println("Row : "+l++);
            for(int[] nu : num){
                for(int n : nu){
                    System.out.print(n+" ");
                }
                System.out.println();
            }
            System.out.println();
        }




    }
}
