package com.dsa.learning.java8practice;

public interface Interface1 {
    default void m1(){
        System.out.println("this is default implementation  in Interface1");
    }
    static void m2(){
        System.out.println("this is static method");
    }
}
