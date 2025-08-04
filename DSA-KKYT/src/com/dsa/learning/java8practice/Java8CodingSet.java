package com.dsa.learning.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Java8CodingSet {

    public static void main(String[] args) {
       // List<Integer> list = Arrays.asList(10, 20, 10, 30, 35, 20, 50, 40);
       // Set<Integer> set = new HashSet<>();
        //list = list.stream().filter(a -> !set.add(a)).toList();
        // System.out.println(list);

        //Multiply mul= (a,b)->a*b;
        //System.out.println(mul.multiply(2,3));
        String s="I am I and you is you who are you";
         String[]  list = s.split(" ");

        Map<String, Long> map = new HashMap<>();
        for(String i: list){
            if(!map.containsKey(i)){
                map.put(i, 1L);
            }
            else {
                map.compute(i,(K,V)->V+1);
            }
        }
        System.out.println(map);
    }
}


@FunctionalInterface
interface Multiply {
    int multiply(int a, int b);
}

