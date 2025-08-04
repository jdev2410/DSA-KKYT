package com.dsa.learning.arrays.striver.practice;

import java.util.Arrays;

public class FindMissingNumber {

    private static void findMissingNumber() {
        int[] arr = {1, 2, 3,  5};
        int n = 5;
        int sumOfArrayIncludingMissingNumber = n * (n + 1) / 2;
        Integer sumOfGivenArray = Arrays.stream(arr).boxed().reduce((a, b) -> a + b).get();
        System.out.println(sumOfArrayIncludingMissingNumber - sumOfGivenArray);
        //TIME COMPLEXITY-> O(N)
    }

    public static void main(String[] args) {
        findMissingNumber();
    }
}
