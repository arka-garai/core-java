package _00Telusko._00xEnumToStreamAPI;

class A9 extends Thread{
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}

class B9 extends Thread{
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class _18CreatingMultipleThreadsDemo {
    public static void main(String[] args) {
        A9 obj1 = new A9();
        B9 obj2 = new B9();
         /*
        System.out.println(obj1.getPriority());
         obj2.setPriority(Thread.MAX_PRIORITY);
        */

        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
