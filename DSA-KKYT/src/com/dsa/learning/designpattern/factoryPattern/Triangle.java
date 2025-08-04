package com.dsa.learning.designpattern.factoryPattern;

public class Triangle implements Shape {
    @Override
    public void createShape() {
        System.out.println("This is triangle");
    }
}
