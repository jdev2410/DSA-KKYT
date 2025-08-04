package com.dsa.learning.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WhetherImpl implements Subject{
    private List<Observer> observers;
    private  float temprature;
    private  float humidity;
    private  float pressure;


    public WhetherImpl(){
        this.observers=new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
       for(Observer ob: observers){
           ob.update(this.temprature, this.humidity, this.pressure);
       }
    }

    public void setMeasurement(float temp, float humidity, float pressure){
        this.temprature=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        notifyObserver();
    }

}
