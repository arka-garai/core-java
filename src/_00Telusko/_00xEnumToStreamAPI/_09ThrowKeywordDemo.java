package _00Telusko._00xEnumToStreamAPI;

public class _09ThrowKeywordDemo {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{
            //critical statements
            j = 18/i;
            if(j == 0)
                throw new ArithmeticException("I don't want to print zero");
        } catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("that's the default output "+ e);
        } catch (Exception e){
            System.out.println("Something went wrong !"+ e);
        }
        System.out.println(j);
        System.out.println("bye idc");
    }
}
