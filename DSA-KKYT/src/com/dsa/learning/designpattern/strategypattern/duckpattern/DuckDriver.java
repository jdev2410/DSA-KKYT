package com.dsa.learning.designpattern.strategypattern.duckpattern;

import com.dsa.learning.designpattern.strategypattern.duckpattern.interfaces.impl.Fly;
import com.dsa.learning.designpattern.strategypattern.duckpattern.interfaces.impl.Quack;

public class DuckDriver {

    public static void main(String[] args) {
        Duck d= new MallardDuck();
        d.setFlyBehaviour(new Fly());
        d.setQuackBehaviour(new Quack());
        //d.performQuack();
        //d.performFly();
        d.display();
        d.swim();
    }
}
