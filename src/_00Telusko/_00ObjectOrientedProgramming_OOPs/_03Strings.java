package _00Telusko._00ObjectOrientedProgramming_OOPs;

public class _03Strings {
    public static void main(String[] args) {
        String name = new String("arka ");
        //String name = "arka";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.equals("arka "));
        System.out.println(name.equalsIgnoreCase("ARka "));
        System.out.println(name.compareTo("Arka "));
        System.out.println(name.compareToIgnoreCase("ARKA "));
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,3));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.replace("ka","yooo"));
        System.out.println(name.contains("ka"));
        System.out.println(name.startsWith("ar"));
        System.out.println(name.endsWith(" "));
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());
        System.out.println(name.indexOf("a"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(String.valueOf(10));
        System.out.println(name.hashCode());
        System.out.println(name.concat(" hello"));
        System.out.println(name+" hello");

        String formattedString = String.format("My name is %s and I am %d years old.", "John", 23);
        System.out.println(formattedString);

        String name1 = "Amar Panchal";
        System.out.println(name1.substring(2,8));
        System.out.println(name1.subSequence(2,8));


    }
}
