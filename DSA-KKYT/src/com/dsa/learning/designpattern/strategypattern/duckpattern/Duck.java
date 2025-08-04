package com.dsa.learning.designpattern.strategypattern.duckpattern;

import com.dsa.learning.designpattern.strategypattern.duckpattern.interfaces.FlyBehaviour;
import com.dsa.learning.designpattern.strategypattern.duckpattern.interfaces.QuackBehaviour;

public abstract class Duck {
    public Duck(){}
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour.fly();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("I can swim too");
    }

    public abstract void display();


}
