package _00Telusko._00xEnumToStreamAPI;

import java.util.Arrays;
import java.util.List;

/*
Optional Class Summary:
Purpose: Avoid NullPointerException by explicitly handling the presence or absence of values.
Key Methods:

Optional.of(value) - Create Optional with non-null value
Optional.empty() - Create empty Optional
Optional.ofNullable(value) - Create Optional that may be null
isPresent() - Check if value exists
get() - Get value (throws exception if empty)
orElse(default) - Get value or default
ifPresent(consumer) - Execute action if value exists
map(function) - Transform the value
filter(predicate) - Filter based on condition

Common with Streams:

reduce() without identity returns Optional
findFirst(), findAny() return Optional
max(), min() return Optional
 */
public class _38OptionalClassDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arka","Laxmi","Kajal","Ram");
//        Optional<String> name = names.stream()
//                .filter(str -> str.contains("x"))
//                .findFirst();
//
//        System.out.println(name.orElse("Not found"));

       String name = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst()
                .orElse("Not found");

        System.out.println(name);

    }
}
