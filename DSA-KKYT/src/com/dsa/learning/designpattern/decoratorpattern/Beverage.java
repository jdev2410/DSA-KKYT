package com.dsa.learning.designpattern.decoratorpattern;

public abstract class Beverage {
    public String description="Unknown Beverage";
    public enum Size{SMALL, MEDIUM, LARGE};
    public String getDescription(){
        return description;
    }
    public abstract int cost();

}
