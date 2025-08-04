package com.dsa.learning.designpattern.decoratorpattern;

public class BeverageDriver {

    public static void main(String[] args) {
        Beverage b= new ColdCoffee(Beverage.Size.SMALL);// Creating coffee here with size small, medium and large
        b = new IceCream(b ); // adding single scope ice cream on the top
        b = new IceCream(b); // adding double scope ice cream on the top
        System.out.println(b.cost());
        System.out.println(b.getDescription());
    }
}
