package _00Telusko._00xEnumToStreamAPI;

@FunctionalInterface
interface A4 {
    int add(int i, int j);
 }
//lambda expression works only with functional interface
public class _06LambdaExpressionWithReturnDemo {
    public static void main(String[] args) {
        A4 obj = (i, j) -> i+j;

        int result = obj.add(2,3);
        System.out.println(result);
    }
}
