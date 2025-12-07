package _00Telusko._00ObjectOrientedProgramming_OOPs;

public class _05StringBufferAndStringBuilder {
    public static void main(String[] args) {
        //thread safe
        StringBuffer sb = new StringBuffer("Arka");//capacity 16 initially
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(" Garai");
        sb.insert(5,"Java ");
        sb.setLength(30);
        sb.ensureCapacity(100);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());


    }
}
