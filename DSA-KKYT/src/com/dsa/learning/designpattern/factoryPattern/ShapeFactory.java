package com.dsa.learning.designpattern.factoryPattern;

public class ShapeFactory {
Shape getShape(String shapeType) {
    return switch (shapeType) {
        case "Circle" -> new Circle();
        case "Triangle" -> new Triangle();
        default -> null;
    };
}
}
