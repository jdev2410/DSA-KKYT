package com.dsa.learning.designpattern.observerpattern;

public class CurrentConditionDisplayElement implements Observer{
    private Subject subject;
    public CurrentConditionDisplayElement(Subject subject){
        this.subject=subject;
        subject.registerObserver(this);
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current whether condition is "+"Temperature: "+temperature+ " Humidity: "+humidity+" Pressure: "+ pressure);
    }
}
