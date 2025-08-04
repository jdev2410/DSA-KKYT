package com.dsa.learning.arrays.striver.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnionAndIntersectionOfTwoArray {
    private static void unionOfTwoArray() {
        int[] arr1 = {1, 2, 3, 3, 4, 4, 5, 6};
        int[] arr2 = {6, 7, 7, 8, 8, 9};
        Set<Integer> collect1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> collect2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        collect1.addAll(collect2);
        System.out.println(collect1);
    }

    private static void unionOfTwoArrayOptimalSolution() {
        int[] arr1 = {1, 2, 3, 4, 4, 5, 7};
        int[] arr2 = {1, 7, 7, 8, 8, 9};

    }

    public static void main(String[] args) {
        //unionOfTwoArray();
        unionOfTwoArrayOptimalSolution();
    }
}
