package _00Telusko._00ObjectOrientedProgramming_OOPs;

public class _03Strings {
    public static void main(String[] args) {
        String name = new String("arka");
        //String name = "arka";
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" hello"));
        System.out.println(name+" hello");
        System.out.println(name.equals("arka"));
        System.out.println(name.equalsIgnoreCase("ARka"));
        System.out.println(name.toUpperCase());
        System.out.println(name.compareTo("Arka"));
        System.out.println(name.compareToIgnoreCase("ARKA"));


    }
}
