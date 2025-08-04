package com.dsa.learning.rough;

public class MyClassOverriding {
    public static void main(String[] args) {
      P p= new P();
       p.m1();
       C c= new C();
       c.m1();
        P pc= new C();
        pc.m1();
    }
}
class P{
    public  void m1(){
        System.out.println("parent");
    }
}
class C extends P{

    public  void m1(){
        System.out.println("child");
    }
}
