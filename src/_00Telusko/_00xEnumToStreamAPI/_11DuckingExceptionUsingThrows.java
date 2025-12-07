package _00Telusko._00xEnumToStreamAPI;


class D{
    static {
        System.out.println("Class Loaded");
    }
    public void show() throws ClassNotFoundException {
//        System.out.println(Class.forName("_00xEnumToStreamAPI.D"));
        System.out.println(Class.forName("D"));
        D lol = new D();
        lol.show();
    }
}
public class _11DuckingExceptionUsingThrows {
    static {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
       D obj = new D();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Class not found. Please check the class name!"+e);

        }
        for (int i = 0; i <10 ; i++) {
            System.out.println("line no: "+ i);
        }

    }
}
