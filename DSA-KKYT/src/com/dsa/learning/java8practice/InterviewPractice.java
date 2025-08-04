package com.dsa.learning.java8practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewPractice {

    public static void main(String[] args) {
        // Question-1 Sort the map on the bases of values
        Map<Integer, String> map= new HashMap<>();
        map.put(1,"A");
        map.put(2,"G");
        map.put(3,"C");
        map.put(4,"M");
        LinkedHashMap<Integer, String> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> o, LinkedHashMap::new));
       // System.out.println(collect);

        // Question-2 Flatten the list of lists
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        List<Integer> collect1 = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        //System.out.println(collect1);

        // Question-3  How do you find frequency of each character in a string using Java 8 streams?
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> frequency = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       // System.out.println(frequency);

        // Question-4 Find the frequency of each word in the given string.
        String inputString1 = "java is not java a language It is more than a language";
        String[] split = inputString1.split("\\s+");
        Map<String, Long> collect2 = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect2);
    }
}
