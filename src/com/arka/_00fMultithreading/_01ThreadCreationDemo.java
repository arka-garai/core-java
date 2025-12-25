package com.arka._00fMultithreading;
/* Creating new Thread
Methodology for creating new thread :
	1. We can implement the Runnable interface.
	2. We can extend the Thread class, itself.
*/
/****** Using Runnable Interface *******/
class NewThread1 implements Runnable{
	Thread t;
	NewThread1(){
		t = new Thread(this,"Demo Thread1");
		System.out.println("Child Thread1 : " + t);
		t.start();
	}
	public void run(){
		try{
		for(int i=10;i>0;i--){
			System.out.println("Child Thread1 : " + i);
			Thread.sleep(1000);
		}
		}catch(InterruptedException e){
            System.out.println("Child Thread1 Interrupted");
		}
	}
}
/****** Using Thread Class *******/
class NewThread extends Thread{
    NewThread(){
        super("Demo Thread");
        System.out.println("Child Thread : " + this);
        start();
    }
    public void run(){
        try{
            for(int i=10;i>0;i--){
                System.out.println("Child Thread : " + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child Thread Interrupted");
        }
    }
}
public class _01ThreadCreationDemo{
    public static void main(String args[]){
//        NewThread1 newThread1 = new NewThread1();
//        Thread t1 = new Thread(newThread1,"Demo Thread1");
//        t1.start();

        new NewThread1();

//        NewThread newThread = new NewThread();
//        newThread.start();

        new NewThread();
    }
}

