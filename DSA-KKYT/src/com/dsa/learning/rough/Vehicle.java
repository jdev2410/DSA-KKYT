package com.dsa.learning.rough;

public  class Vehicle {
    public static void main(String[] args) {
        Bus b= new Bus();
        System.out.println(b.getNoOfGears());
        System.out.println(b.getNoOfWheels());
        System.out.println(b.defaultCase());
        Vehicle1 v1= new Bus();

    }
}
abstract class Vehicle1 {
    public abstract int  getNoOfWheels();
    public abstract  int  getNoOfGears();
    public String defaultCase(){
        return "Local Transport Vehicle";
    }
}
class Bus extends Vehicle1{

    @Override
    public int getNoOfWheels() {
        return 4;
    }

    @Override
    public int getNoOfGears() {
        return 6;
    }
    public void common(){}

}






