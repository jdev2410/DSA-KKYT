package com.dsa.learning.designpattern.factoryPattern;

public class Circle implements Shape {
    @Override
    public void createShape() {
        System.out.println("This is circle");
    }
}
