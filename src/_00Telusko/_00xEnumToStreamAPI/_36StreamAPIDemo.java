package _00Telusko._00xEnumToStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class _36StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
//        Stream<Integer> s3 = s2.map(n -> n*2);
//        Integer result = s3.reduce(0, (c, e) -> c + e);

        //filter method needs Predicate object
//        Predicate<Integer> p = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
//                return n % 2 == 0;
//            }
//        };

            // map method needs Function object
//            Function<Integer, Integer> fun = new Function<Integer, Integer>() {
//                public Integer apply(Integer n) {
//                    return n * 2;
//                }
//            };

           //reduce method needs an identity value (0 in this case) and BinaryOperator object
//            BinaryOperator<Integer> sum = new BinaryOperator<Integer>() {
//                public Integer apply(Integer a, Integer b) {
//                    return a + b;
//                }
//            };


        Integer result = nums.stream()
                             .filter(n -> n % 2 == 0)
                             .map(n -> n * 2)
                             .reduce(0, (c, e) -> c + e);  //.reduce(0, Integer::sum); Using method reference (most concise)
        System.out.println(result);

        Stream<Integer> sortedNums = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();

        sortedNums.forEach(n-> System.out.print(n+" "));

    }
}
