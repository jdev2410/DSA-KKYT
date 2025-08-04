package com.dsa.learning.multithreading;

public class Display {
    public void wish(String name) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("good Morning:");
            Thread.sleep(1000);
            System.out.println(name);
        }
    }
}
