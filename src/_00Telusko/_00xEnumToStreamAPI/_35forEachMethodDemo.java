package _00Telusko._00xEnumToStreamAPI;

import java.util.Arrays;
import java.util.List;

public class _35forEachMethodDemo {
    public static void main(String[] args) {
        //forEach method needs Consumer object
//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };
        //Consumer is functional interface so we can use lambda expression
//       Consumer<Integer> con = (n) -> System.out.println(n) ;

        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
      //  nums.forEach(con);
        nums.forEach( n -> System.out.println(n));
    }
}
