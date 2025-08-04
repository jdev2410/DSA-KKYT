package com.dsa.learning.multithreading;



class ThreadTest extends Thread
{
    public void run()
    {
        for(int i = 0; i < 3; i++)
        {
            System.out.println("A");
            System.out.println("B");
        }
    }
}
public class ThreadDemo1 extends Thread
{
    public void run()
    {
        for(int i = 0; i < 3; i++)
        {
            System.out.println("C");
            System.out.println("D");
        }
    }
    public static void main(String args[])
    {
        ThreadTest t1 = new ThreadTest();
        ThreadDemo1 t2 = new ThreadDemo1();
        t1.start();
        t2.start();
    }
}