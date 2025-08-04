package com.dsa.learning.searching;

import java.util.*;
import java.util.stream.Collectors;

public class CountOccurrenceInSortedArray {

    public static void countOfOccurrence() {
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("anil", 1000);
        map2.put("ankit", 1200);
        map2.put("bhavna", 1200);
        map2.put("james", 1200);
        map2.put("micael", 1000);
        map2.put("tom", 1300);
        map2.put("daniel", 1300);


        Map<Integer, List<String>> collect = map2.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        Optional<Map.Entry<Integer, List<String>>> first = collect.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).stream().skip(0).findFirst();
        System.out.println(first);
    }

    public static void main(String[] args) {
        countOfOccurrence();
    }
}
