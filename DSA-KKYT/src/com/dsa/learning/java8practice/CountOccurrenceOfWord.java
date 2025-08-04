package com.dsa.learning.java8practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrenceOfWord {

    public static void main(String[] args) {
        String s = "I am I and you is you So who are you";
        Map<String, Long> map = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
