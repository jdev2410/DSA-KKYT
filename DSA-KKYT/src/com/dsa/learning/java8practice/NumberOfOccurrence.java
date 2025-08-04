package com.dsa.learning.java8practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurrence {
    public static Map<String, Long> findNoOfOccurrence(String str){
        List<String> list = Arrays.asList(str.split(" "));
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return collect;
    }
    public static List<Integer> findNoOfDuplicate(List<Integer> numbers){
        Set<Integer> unique= new HashSet<>();
       return numbers.stream().filter(a->!unique.add(a)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        //System.out.println(findNoOfOccurrence("My name is pratyush pratyush is a java developer he loves java by name"));
        System.out.println(findNoOfDuplicate(Arrays.asList(1,2,3,1,5,6,2)));
    }
}
