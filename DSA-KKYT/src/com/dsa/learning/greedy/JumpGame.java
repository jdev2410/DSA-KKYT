package com.dsa.learning.greedy;

import java.util.Arrays;

public class JumpGame {
    // In this question, can reach till the end or not.
    private static Boolean jumpGamePartOne(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > max)
                return false;
            max = Math.max(max, i + arr[i]);
        }
        return true;
    }

    // In how many minimum attempts we can reach at the end
    private static int jumpGamePartTwo(int[] arr) {

return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 1, 0, 2, 5};
        int[] arr1 = {2, 3, 1, 4, 1, 1, 1, 2};
        // System.out.println(jumpGamePartOne(arr));
       // System.out.println(jumpGamePartTwo(arr1));
        Integer i = Arrays.asList(1, 2, 3, 4, 5, 6).stream().reduce((a, b) -> a + b).get();
        System.out.println(i);
    }
}
