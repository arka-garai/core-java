package com.arka._00fMultithreading;
/* Few common Thread class methods
1. getName() : Obtain a thread's name
2. setName(String name) : Set name of a thread
3. getPriority() : Obtain a thread's priority
4. setPriority(int prio) : set the priority of a thread
5. isAlive() : Return boolean true or false; determine thread is alive or not.
6. join() : Wait for a thread to terminate.
7. sleep(long millis)/sleep(long millis, int nanos) : Suspend the thread for a period of time.
8. start() : Start of a thread and send them to runnable state
9. run() : Entry point of the thread i.e, starting its execution and start the running state.
*/

/* Thread Constructors
1. Thread()
2. Thread(Runnable target)
3. Thread(Runnable target, String name)
4. Thread(String name)
5. Thread(ThreadGroup group, Runnable target)
6. Thread(ThreadGroup group, Runnable target, String name)
7. Thread(ThreadGroup group, Runnable target, String name, long stackSize)
8. Thread(ThreadGroup group, String name)

Inside any thread execution if we want the current thread object we can use ,
currentThread() method calling.
static Thread currentThread()

ThreadGroup tg1 = new ThreadGroup();
Thread t1 = new Thread(tg1, "ThreadOne");
Thread t2 = new Thread(tg1, "ThreadTwo");
Thread t3 = new Thread(tg1, "ThreadThree")
*/
public class _01CurrentThreadDemo {
    public static void main(String args[]){
        Thread t = Thread.currentThread();
        System.out.println("Current Thread : " + t);
        t.setName("My Thread");
        t.setPriority(7);
        System.out.println("After name change : " + t);
        try{
            for(int n=1;n<11;n++){

                System.out.println(n);

/*** static void sleep(long milliseconds) throws InterruptedException***/
                Thread.sleep(3000);

            }
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
    }
}



