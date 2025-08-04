package com.dsa.learning.arrays.striver.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberAppearsOnlyOne {

    private static void numberAppearsOne(int[] arr) {
        Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<Integer, Long> integerLongEntry = collect.entrySet().stream().sorted((a, b) -> a.getValue().intValue() - b.getValue().intValue()).findFirst().get();
        System.out.println(integerLongEntry.getKey());
    }


    public static void main(String[] args) {
        //int[] arr = {0, 1, 1, 3, 3}; //Case 1
         int[] arr = {1, 1, 1, 4};
        numberAppearsOne(arr);
    }
}
