package com.dsa.learning.designpattern.strategypattern.duckpattern;
import com.dsa.learning.designpattern.strategypattern.duckpattern.interfaces.impl.Fly;
import com.dsa.learning.designpattern.strategypattern.duckpattern.interfaces.impl.Quack;

public class MallardDuck extends Duck{


public MallardDuck(){
        quackBehaviour=new Quack();
        flyBehaviour= new Fly();
}
    @Override
    public void display() {
        System.out.println("Hi, I am Mallard duck.");
    }
}
