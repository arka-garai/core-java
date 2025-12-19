package _00Telusko._00ObjectOrientedProgramming_OOPs;

public class _00ATypeConversionAndCasting {
    public static void main(String[] args) {
        byte byteValue = 10; // 1 byte
        short shortValue = byteValue; // 2 bytes
        int intValue = shortValue; // 4 bytes
        long longValue = intValue; // 8 bytes
        float floatValue = longValue; // 4 bytes
        double doubleValue = floatValue; // 8 bytes

        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        char charValue = 'A';
        int intValueChar = charValue; // Widening conversion from char to int

        System.out.println("char: " + charValue);
        System.out.println("int: " + intValueChar);

        char charValue1 = 'A';
        float intValueChar1 = charValue; // Widening conversion from char to float

        System.out.println("char: " + charValue1);
        System.out.println("float: " + intValueChar1);

        long a = Long.MAX_VALUE; // 01111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111
        System.out.println(a);
        int b = (int) a; // 11111111 11111111 11111111 11111111
        System.out.println(b); // -1
    }
}
