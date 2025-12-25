package com.arka._00fMultithreading;

// Shared resource
class Counter {

    private int count = 0;//shared resource

    // synchronized method to avoid race condition
    // -------- OPTION 1: synchronized METHOD --------
    // public synchronized void increment() { //one thread will be able to access it at a time (mutual exclusion)
    //     count++; //critical section
    // }

    // -------- OPTION 2: synchronized BLOCK --------
    public void increment() {
        synchronized (this) {
            count++;
        }
    }
    public int getCount() {
        return count;
    }
}

// Worker thread
class MyThread4 extends Thread {

    private Counter counter;

    public MyThread4(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}


public class _04Synchronization {

    public static void main(String[] args) {

        Counter counter = new Counter();

        MyThread4 t1 = new MyThread4(counter);
        MyThread4 t2 = new MyThread4(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Final Count = " + counter.getCount());
    }
}
