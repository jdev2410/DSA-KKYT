package com.dsa.learning.java8practice;

import java.util.Optional;

public class OptionalDemo{

    public static void main(String[] args) {
       // Object object = Optional.of(null).orElseThrow(() -> new RuntimeException());
        //System.out.println(object);
        String s1=null;
        String s = Optional.ofNullable(s1).orElse("Srivatava");
        //System.out.println(s);
        new X().X();


    }
}
class X
{
    public X(int i){
        System.out.println("1");
    }
    public X(){
        this(10);
        System.out.println("2");
    }
    void X(){
        X(3);
        System.out.println("4");
    }
    void X(int i){
        System.out.println(i);
    }

    void method(int a)
    {
        System.out.println("ONE");
    }

    void method(double d)
    {
        System.out.println("TWO");
    }
}


