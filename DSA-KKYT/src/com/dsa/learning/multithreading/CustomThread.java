package com.dsa.learning.multithreading;

public class CustomThread {
    public static void main(String[] args) {
        MultiThreadingClass t= new MultiThreadingClass();
        t.start();
        for(int i=0; i<4 ;i++){
            System.out.println("Main Thread");
        }
    }
    // In this code o/p cannot be determined. Mixed O/P will get.
}
 class MultiThreadingClass extends Thread{

    public void run(){
        for(int i=0; i<4; i++){
            System.out.println("Child Thread");
        }
    }

 }