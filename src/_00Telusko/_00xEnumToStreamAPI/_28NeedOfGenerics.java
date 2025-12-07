package _00Telusko._00xEnumToStreamAPI;

import java.util.ArrayList;

public class _28NeedOfGenerics {
    public static void main(String[] args) {
        //Type Safety
        String[] name = new String[5];
        name[0] = "Arka";
        name[1] = "Rick";
        //name[2] = 10; compile time error
        String str = name[2];
        System.out.println(str);

        //No Type Safety without generics
        ArrayList list = new ArrayList();
        list.add("arka");
        list.add("Rohan");
        list.add("lol");
        list.add(23);//when you do list.add(23), Java automatically boxes 23 into an Integer object

        String name3 = (String) list.get(2);
        System.out.println(name3.toUpperCase());

//        String name4 = (String) list.get(3); //runtime error      (we need generics now)
//        System.out.println(name4.toUpperCase());

    }
}
