package _00Telusko._00xEnumToStreamAPI;
/*
🧩 Java Collections Framework (JCF)
The Java Collections Framework provides a unified architecture for storing and manipulating groups
of objects.

🔹 Collection API

The Collection API is the core part of the JCF.
It was introduced in Java 1.2.
It provides interfaces, classes, and algorithms for working with data structures
like lists, sets, and maps.

🔹 Collection (Interface)
Collection is the root interface of the Collection hierarchy.
It defines common methods like add(), remove(), size(), etc.
Subinterfaces include:
List
Set
Queue

🔹 Collections (Class)
Collections is a utility class that provides static methods for operations on collections such as:
Sorting (Collections.sort(list))
Searching (Collections.binarySearch(list, key))
Synchronization (Collections.synchronizedList(list))

 */
import java.util.ArrayList;
import java.util.List;
public class _23ListAndArrayListDemo {
    public static void main(String[] args) {
//        Collection<Integer> nums = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.set(1,3);
        nums.addLast(9);

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(5));

//        for (int num : nums) {
//            System.out.println(num);
//        }
//        System.out.println(nums);
//        Iterator<Integer> values = nums.iterator();
//
//        while(values.hasNext())
//            System.out.println( values.next()  );
    }
}
