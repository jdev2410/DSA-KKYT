package com.dsa.learning.java8practice;

import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaDemo implements Interface1{
    public static void main(String[] args) {
//        BiConsumer<Integer,Integer> biConsumer = (a, b) -> System.out.println(a + b); // Functional Interfaces are reference to the lambda exp.
//        //----------Functional Interface------ =  ----------lambda Expression---------
//        biConsumer.accept(2,5);
//        String a="ja";
//        String b="az";
//        Comparator<String> comp = (c, d) -> a.compareTo(b); // // Functional Interfaces are reference to the lambda exp.
//        int compare = comp.compare(a, b);
//        System.out.println(compare);
//        CustomFunctionalInterface fi= (j,k)-> {
//            System.out.println(j+k);
//        };
//        fi.sum(2,98);
//        fi.sum(3,98);
//        fi.sum(5,98);
        // Here BiConsumer and Comparator are FI.
        LambdaDemo v= new LambdaDemo();
        v.m1();
        Interface1.m2();// calling static method directly using interface name.
        Predicate<Integer> predicate=a->a>10;
        Predicate<Integer> predicate1=a->a==10;

       // System.out.println(predicate.and(predicate1).test(10));
       Function<String,String> function= i-> String.valueOf(i.compareTo("s"));
        //System.out.println(function.apply("a"));
        List<Integer> collect = Arrays.asList(5, 2, 1, 6).stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
    @Override
    public void m1(){
        Interface1.super.m1();
    }

    public boolean isNumberGreater(int a){
        return 5>a?true:false;
    }

}
