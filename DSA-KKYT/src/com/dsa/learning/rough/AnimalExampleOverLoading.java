package com.dsa.learning.rough;

public class AnimalExampleOverLoading {
    public static void main(String[] args) {
//        Animal animal= new Animal();
//        animal.makeSound();
//        Dog dog= new Dog();
//        dog.makeSound();
//        dog.makeSound("Bhooo Bhoo");
        Animal ad= new Dog();
        ad.makeSound(); //Method resolution always takes care by reference type(ad Animal)

    }
}

class Animal{
     int s=0;
    public void makeSound(){
        System.out.println("Some generic sound");
    }

}
class Dog extends Animal{

    public void makeSound(){
        System.out.println("Some generic sound child class"+super.s);
    }
//    public void makeSound(){
//        System.out.println("Woff- Woff");
//    }
   // public void makeSound(String sound){
      //  System.out.println("I bark like "+ sound);
    //}
}
