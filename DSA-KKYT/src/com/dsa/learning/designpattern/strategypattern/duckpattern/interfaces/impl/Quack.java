package com.dsa.learning.designpattern.strategypattern.duckpattern.interfaces.impl;

import com.dsa.learning.designpattern.strategypattern.duckpattern.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I can do Quack Quack");
    }
}
