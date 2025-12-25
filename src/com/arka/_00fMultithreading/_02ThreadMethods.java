package com.arka._00fMultithreading;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            String a = "";
            for (int j = 0; j < 10000; j++) {
                a += "a"; //expensive work
            }
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}
//start run sleep join setPriority interrupt
public interface _02ThreadMethods {
    static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("T1 - MIN_PRIORITY");
        MyThread t2 = new MyThread("T2 - NORM_PRIORITY");
        MyThread t3 = new MyThread("T3 - MAX_PRIORITY");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();t2.start();t3.start();
        t1.interrupt();t2.interrupt();t3.interrupt();
        t1.join();t2.join();t3.join();

        System.out.println("Hello");
    }
}
