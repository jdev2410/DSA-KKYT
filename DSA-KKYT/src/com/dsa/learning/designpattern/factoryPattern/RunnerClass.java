package com.dsa.learning.designpattern.factoryPattern;

public class RunnerClass {

    public static void main(String[] args) {
        // Abstract factory works when we want get an object on the bases of some condition
        // For example pass triangle and get triangle object, pass circle and get circle object
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Triangle");
        circle.createShape();
    }
}
