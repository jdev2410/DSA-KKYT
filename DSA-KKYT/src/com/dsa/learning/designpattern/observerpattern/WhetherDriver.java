package com.dsa.learning.designpattern.observerpattern;

import java.util.Observable;

public class WhetherDriver   {
    public static void main(String[] args) {
        WhetherImpl whether= new WhetherImpl();// WhetherImpl is subject
        CurrentConditionDisplayElement c=new CurrentConditionDisplayElement(whether);// registering subject with CurrentConditionDisplayElement(observer)
        whether.setMeasurement(25.5f,15.4f,100.0f);
    }
}
