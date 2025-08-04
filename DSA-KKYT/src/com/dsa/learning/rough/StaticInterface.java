package com.dsa.learning.rough;

public interface StaticInterface {
    static String getMyName(){
        return "Pratyush";
    }
}

class MyClass implements StaticInterface{
    static String getMyName(){
        StaticInterface.getMyName();
        return "Pratyush";
    }

}
