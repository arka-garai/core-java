package _00Telusko._00xEnumToStreamAPI;

public class _02SwitchCaseEnumDemo {
    public static void main(String[] args) {
        Status s = Status.Running;

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}
