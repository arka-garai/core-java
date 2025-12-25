package com.arka._00fMultithreading;

public class _02MyThreadsLifeCycle extends Thread {

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        _02MyThreadsLifeCycle t1 = new _02MyThreadsLifeCycle();//new
        System.out.println(t1.getState());
        t1.start();//runnable
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();//here main thread will wait for t1 thread to get finished
        System.out.println(t1.getState());


    }
}
