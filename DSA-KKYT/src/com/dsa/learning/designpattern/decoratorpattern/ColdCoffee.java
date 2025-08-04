package com.dsa.learning.designpattern.decoratorpattern;

public class ColdCoffee extends Beverage {
    Size s ;
    public ColdCoffee(Size s){
        description="Fantastic cold coffee";
        this.s=s;
    }

    @Override
    public int cost() {
        return sizeCostCalculator(this.s)+150;
    }

    private int sizeCostCalculator(Size s){
        if(s.equals(Size.MEDIUM))
            return 50;
        else if (s.equals(Size.LARGE))
            return 100;
        else
            return 0;


    }

}
