package _00Telusko._00xEnumToStreamAPI;

class A10 implements Runnable{
    public void run(){
        for (int i = 1; i <=5 ; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(Thread.currentThread().getName());
    }
}

class B10 implements  Runnable{
    public void run(){
        for (int i = 1; i <=5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName());
    }
}

public class _19RunnableDemo {
    public static void main(String[] args) {
       Runnable obj1 = new A10();
       Runnable obj2 = new B10();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
