package _00Telusko._00xEnumToStreamAPI;

//SAM -> single abstract method interface ≡ FunctionalInterface
@FunctionalInterface
interface A2 {
    void show();
}


public class _05FunctionalInterface {
    public static void main(String[] args) {
        A2 obj = new A2(){
            @Override
            public void show() {
                System.out.println("in show");
            }
        };
        obj.show();
    }
}
