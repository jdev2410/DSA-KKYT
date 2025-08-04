package com.dsa.learning.designpattern;

public class SingletonPattern {
//There are 4 types of Singleton design Pattern
    // 1- Eager initialization
    // 2- Lazy initialization
    // 3- Thread safe method initialization
    // 4- Thread safe block initialization
    private static SingletonPattern singletonPattern;

    private SingletonPattern(){}

    // 4th one example
    public static  SingletonPattern getInstance4(){
        if(singletonPattern==null) {
            synchronized(SingletonPattern.class) {
                singletonPattern = new SingletonPattern();
            }
        }
        return singletonPattern;
    }

    public static synchronized SingletonPattern getInstance3(){
        if(singletonPattern==null)
                singletonPattern = new SingletonPattern();

        return singletonPattern;
    }

    public static SingletonPattern  getInstanceByLazy(){
        if(singletonPattern==null)
            singletonPattern= new SingletonPattern();
        return singletonPattern;
    }

    public static void main(String[] args) {
//        SingletonPattern instance1 = SingletonPattern.getInstance4();
//        System.out.println(instance1);
//        SingletonPattern instance2 = SingletonPattern.getInstance4();
//        System.out.println(instance2);
//
//
//        SingletonPattern instance3 = SingletonPattern.getInstance3();
//        System.out.println(instance1);
//        SingletonPattern instance4 = SingletonPattern.getInstance3();
//        System.out.println(instance2);.
        SingletonPattern instanceByLazy = SingletonPattern.getInstanceByLazy();
        System.out.println(instanceByLazy.hashCode());
        SingletonPattern instanceByLazy1 = SingletonPattern.getInstanceByLazy();
        System.out.println(instanceByLazy1.hashCode());
    }

}
