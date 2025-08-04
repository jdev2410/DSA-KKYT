package com.dsa.learning.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExecutorDemo {
    public void print() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor
                (3, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), new MyDefaultFactory());
        AtomicInteger count = new AtomicInteger();
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside for loop");
            executor.submit(() -> {
                try {
                    System.out.println("Inside try, before sleep");
                    Thread.sleep(5000); //  5 sec sleep
                    System.out.println("Inside try, after sleep");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + count.getAndIncrement() + " Processed by :- " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }

    public static void main(String[] args) {
        ThreadPoolExecutorDemo t = new ThreadPoolExecutorDemo();
        t.print();

    }
}

class MyDefaultFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.currentThread().setName("Pratyush-1");
        t.setDaemon(false);
        return t;
    }
}