package com.dsa.learning.multithreading;

public class MyRunnableClass {
    public static void main(String[] args) {
        CustomRunnable cr= new CustomRunnable();
        Thread t= new Thread();
        Thread t1= new Thread(cr);
        t.start();//A new thread will be created, Only In main method will get printed
        t.run();// Only In main method will get printed, because run method does not have implementation
        t1.start();// A new thread will be created, and Thread t1
        for(int i=0; i<4; i++){
            System.out.println("In main method "+ Thread.currentThread().getName()+"  "+ Thread.currentThread().getPriority());
        }
    }
}
// Although we have implemented Runnable interface but still CustomRunnable class
// Does not have funcationality to run. That's y, we have to create a new Thread Object and passed cr as
// an argument.
class CustomRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Inside run method "+ Thread.currentThread().getName()+"  "+ Thread.currentThread().getPriority());
        }
    }
}
