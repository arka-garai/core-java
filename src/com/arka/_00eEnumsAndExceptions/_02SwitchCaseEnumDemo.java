package com.arka._00eEnumsAndExceptions;

public class _02SwitchCaseEnumDemo {
    public enum Days{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        System.out.println(Days.FRIDAY);
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
        }
    }
}
