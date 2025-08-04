package com.dsa.learning.java8practice;

import java.util.*;
import java.util.function.Predicate;

public class PredicateDemo {


    public static void main(String[] args) {

        Predicate<String> length= s->s.length()>=5;
        Predicate<String> evenLength= s->s.length()%2==0;

        System.out.println(length.and(evenLength).test("ashusrivas"));
        System.out.println(length.or(evenLength).test("ashusrivas"));
        System.out.println(length.negate().test("ashusrivas"));
    }

}
