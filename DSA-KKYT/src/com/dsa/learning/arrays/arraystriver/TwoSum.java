package com.dsa.learning.arrays.arraystriver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static void getTwoSum(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (k == arr[i] + arr[j]) {
                    System.out.println(i + " " + j);
                    // break;
                }
            }
        }
    }

    private static void getTwoSumBetterSolution(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = k - arr[i];
            if (!map.containsKey(diff))
                map.put(arr[i], i);
            else {
                System.out.println(i + " " + map.get(diff));
            }
        }
    }

    private static String getTwoSumGreedySolution(int[] arr, int k) {
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum > k)
                r--;
            else if (sum < k)
                l++;
            else
                return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 10, 2, 8, 6, 4};
        // getTwoSum(arr, 12);
       // getTwoSumBetterSolution(arr, 12);
        System.out.println(getTwoSumGreedySolution(arr, 12));
    }
}
