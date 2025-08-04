package com.dsa.learning.java8practice;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer,Boolean> fun= i->i%2==0;
        Function<Integer,Integer> fun1=i->i+i;
        System.out.println(fun.apply(5));
       // System.out.println(fun.andThen(fun1).apply(4));
        //System.out.println(fun.compose(fun1).apply(4));
        Consumer<Integer> con= c->System.out.println("abc"+c);
        con.accept(5);

        Supplier<Date> date= Date::new;
        System.out.println(date.get());
       // System.out.println( fun.andThen(fun1).apply(4));
    }
}
