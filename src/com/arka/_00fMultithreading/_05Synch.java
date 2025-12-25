package com.arka._00fMultithreading;

class Callme{

    synchronized void call(String msg){
        System.out.print("[" + msg);
        try{
            Thread.sleep(10000);

        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run(){
        target.call(msg);
        /**** We can use synchronized block
         synchronized(target){
         target.call(msg);
         }
         ****/
    }

}

public class _05Synch{
    public static void main(String args[]){
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");//ob1:msg,target,t
        Caller ob2 = new Caller(target, "Synchronized");//ob2:msg,target,t
        Caller ob3 = new Caller(target, "World");

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){
            System.out.println("Main interrupted");
        }
    }
}

/****** Desired output :
 [Hello]
 [Synchronized]
 [World]
 ****/
/* [Hello[Synchronized[World]
   ]
   ]
*/
