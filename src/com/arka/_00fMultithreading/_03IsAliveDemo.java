package com.arka._00fMultithreading;
class Thread3 implements Runnable {

    Thread t;
    int a;
    String name;

    Thread3(String s) {
        name = s;
        t = new Thread(this, name);
        System.out.println("NewThread : " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " exiting");
    }
}

public class _03IsAliveDemo  {

    public static void main(String args[]) {

        Thread3 ob1 = new Thread3("One");   // ob1: t, a, name
        Thread3 ob2 = new Thread3("Two");   // ob2: t, a, name
        Thread3 ob3 = new Thread3("Three");

        System.out.println("Thread one is alive :" + ob1.t.isAlive());
        System.out.println("Thread two is alive :" + ob2.t.isAlive());
        System.out.println("Thread three is alive :" + ob3.t.isAlive());

        try {
            System.out.println("Waiting for threads to finish.");

            // main thread waits for child threads
            ob1.t.join();
            ob2.t.join();      // join(10000) is another version with timeout
            ob3.t.join();

        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("Thread one is alive :" + ob1.t.isAlive());
        System.out.println("Thread two is alive :" + ob2.t.isAlive());
        System.out.println("Thread three is alive :" + ob3.t.isAlive());

        System.out.println("Main Thread Exiting");
    }
}

