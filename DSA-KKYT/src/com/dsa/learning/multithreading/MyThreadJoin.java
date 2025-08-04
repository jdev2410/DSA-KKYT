package com.dsa.learning.multithreading;

public class MyThreadJoin {

    public static void main(String[] args) throws InterruptedException {
        ChildThreadClass t = new ChildThreadClass();
        t.start();// After this line we have 2 thread maine and child thread.
        // Child thread is responsible to execute run method and main thread is responsible to execute below for loop.
        t.join();
        //ChildThreadClass.mt = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread_" + i);
        }
    }
}

class ChildThreadClass extends Thread {
    static Thread mt;

    public void run() {
       // try {
            //mt.join();// Here child thread has to wait until completing main thread. Because here child thread
            // is responsible for running the run method.
            //Here child thread called join() method on mt. mt is main thread.
//        } catch (InterruptedException e) {
//            System.out.println("$$$$");
//        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread_" + i);
        }
    }
// SUMMARY- If we uncomment mt.join() in run() method then DEAD LOCK situation will occur because both will
    // wait for each other.
}


