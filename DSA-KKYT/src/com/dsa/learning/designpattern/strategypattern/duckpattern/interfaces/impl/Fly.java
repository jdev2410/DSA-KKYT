package com.dsa.learning.designpattern.strategypattern.duckpattern.interfaces.impl;

import com.dsa.learning.designpattern.strategypattern.duckpattern.interfaces.FlyBehaviour;

public class Fly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
