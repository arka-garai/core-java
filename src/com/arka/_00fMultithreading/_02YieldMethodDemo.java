package com.arka._00fMultithreading;
/*
What Thread.yield() actually does
yield() does NOT stop the thread
It suggests to the thread scheduler:
“I am willing to pause and let other ready threads run.”
The scheduler may or may not honor this request.
Execution can return to the same thread immediately.
*/
class YieldDemoThread extends Thread {

    public YieldDemoThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is executing iteration " + i);

            // Hint to scheduler to give chance to other threads
            Thread.yield();
        }
    }
}

public class _02YieldMethodDemo {

    public static void main(String[] args) {

        YieldDemoThread t1 = new YieldDemoThread("Thread-A");
        YieldDemoThread t2 = new YieldDemoThread("Thread-B");

        t1.start();
        t2.start();
    }
}
