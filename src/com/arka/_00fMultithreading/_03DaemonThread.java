package com.arka._00fMultithreading;
//Daemon Thread (bg thread for which jvm doesn't wait)
class DaemonWorker extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello world!");
        }
    }
}
public class _03DaemonThread {
    public static void main(String[] args) {
        DaemonWorker myThread = new DaemonWorker();

        // Must be called BEFORE start()
        myThread.setDaemon(true);

        myThread.start();

        System.out.println("Main done");
    }
}
