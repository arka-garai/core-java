package _00Telusko._00xEnumToStreamAPI;

public class _01IfElseEnumDemo {
    public static void main(String[] args) {
        Status s = Status.Running;

        if(s == Status.Running){
            System.out.println("All Good");
        }else if(s == Status.Failed){
            System.out.println("Try Again");
        }else if(s == Status.Pending){
            System.out.println("Please Wait");
        }else{
            System.out.println("Done");
        }
    }
}
