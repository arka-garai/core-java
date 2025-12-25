package com.arka._00xEnumToStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _37ParallelStreamDemo {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

//        int sum1 = nums.stream()
//                        .map(i -> i*2)
//                        .reduce(0, (c,e) -> c+e);

        //sequential stream
        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                        .map(i -> {
                            System.out.println("Thread: " + Thread.currentThread().getName());
                            try{Thread.sleep(1);}
                            catch(Exception e){
                                System.out.println(e);
                            }
                            return i*2;
                        })
                        .mapToInt(i -> i)//Stream to IntStream
                        .sum();
        long endSeq = System.currentTimeMillis();

        //parallel stream
        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                        .map(i ->  {
                            System.out.println("Thread: " + Thread.currentThread().getName());
                            try{Thread.sleep(1);}
                            catch(Exception e){
                                System.out.println(e);
                            }
                            return i*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endPara = System.currentTimeMillis();

        System.out.println(sum2+" = "+sum3);
        System.out.println("Seq : "+ (endSeq - startSeq));
        System.out.println("Para : "+ (endPara - startPara));

    }
}
