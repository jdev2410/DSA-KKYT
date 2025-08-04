package com.dsa.learning.designpattern.decoratorpattern;

public class IceCream extends Condiments{

    Beverage beverage;
    public IceCream(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" With icecream on the top"; // adding desc of condiment
    }

    @Override
    public int cost() {

        return beverage.cost()+30; // charging extra for ice cream
    }

}
