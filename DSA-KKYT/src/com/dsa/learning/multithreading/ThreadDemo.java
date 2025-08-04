package com.dsa.learning.multithreading;

public class ThreadDemo extends Thread {

    Display display;
    String name;

    public ThreadDemo(Display d, String name){
        this.display=d;
        this.name=name;
    }


    @Override
    public void run() {

        try {
            display.wish(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
