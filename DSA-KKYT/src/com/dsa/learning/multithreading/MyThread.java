package com.dsa.learning.multithreading;

public class MyThread {
    final StringBuffer sb1 = new StringBuffer();
    final StringBuffer sb2 = new StringBuffer();
    public static void main(String[] args) {
        final MyThread h = new MyThread();
        Display d= new Display();

        ThreadDemo t = new ThreadDemo(d,"Pratyush");
        ThreadDemo t1 = new ThreadDemo(d,"Ashu");
        new Thread()
        {
            public void run()
            {
                synchronized(this)
                {
                    h.sb1.append("Java");
                    h.sb2.append("Thread");
                    System.out.println(h.sb1);
                    System.out.println(h.sb2);
                }
            }
        }.start();
        t.run();
        t1.run();

    }

}


