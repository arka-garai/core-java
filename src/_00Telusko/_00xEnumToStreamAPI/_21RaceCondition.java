package _00Telusko._00xEnumToStreamAPI;

class Counter {
    int count;
    public synchronized void increment(){//executed by one thread at a time
        System.out.println(Thread.currentThread().getName() +"  sep  "+count);
        count++;
    }
}
public class _21RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () ->
        {
            for (int i = 1; i <=10000; i++) {

                c.increment();
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        };

        Runnable obj2 = () ->
        {
            for (int i = 1; i <=10000; i++) {

                c.increment();
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        };

        Thread t1 = new Thread(obj1);

        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join(); //main thread will wait for t1 thread
        t2.join(); //main thread will wait for t2 thread

        System.out.println(c.count);


    }
}
