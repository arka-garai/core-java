package _00Telusko._00xEnumToStreamAPI;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _26ComparatorDemo {
    public static void main(String[] args) {
//        Comparator<Integer> comp = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i, Integer j) {
//                if(i%10 > j%10){
//                    return 1; //swap
//                }else{
//                    return -1; // no swap
//                }
//            }
//        };
//        List<Integer> nums = new ArrayList<>();
//        nums.add(73);
//        nums.add(29);
//        nums.add(26);
//        nums.add(64);
//        nums.add(13);
//        Collections.sort(nums,comp);
//        System.out.println(nums);

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                if(i.length() > j.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        List<String> nums = new ArrayList<>();
        nums.add("arka");
        nums.add("ram");
        nums.add("dwaipayan");
        nums.add("aranya");
        nums.add("pi");
        Collections.sort(nums,comp);
        System.out.println(nums);

    }
}
