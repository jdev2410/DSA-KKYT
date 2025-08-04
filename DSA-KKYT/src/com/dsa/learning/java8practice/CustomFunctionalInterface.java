package com.dsa.learning.java8practice;
//@FunctionalInterface
public interface CustomFunctionalInterface {
   void sum(int a,int b);
   default void sum3(){
      System.out.println("this is default implementation");
   }


}
