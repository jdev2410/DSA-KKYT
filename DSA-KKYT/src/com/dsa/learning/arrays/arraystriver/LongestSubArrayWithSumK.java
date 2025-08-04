package com.dsa.learning.arrays.arraystriver;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

    private static int longestSubArrayWithSumK(int[] arr, int k) {
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        int length = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            map.put(sum, i);
            if (sum == k) {
                length = Math.max(length, i + 1);
            }
            int sumAndKDiff = sum - k;
            if (map.containsKey(sumAndKDiff)) {
                int value = i - map.get(sumAndKDiff);
                length = Math.max(length, value);
            }
        }
        System.out.println(map);
        return length;
    }

    private static int longestSubArrayWithSumKEfficientApproach(int[] arr, int k) {
        int length = 0;
        int sum = arr[0];
        int l = 0;
        int r = 0;
        while (l<=r) {
            if (sum == k) {
                int diff = r -l;
                length = Math.max(length, diff+1);
                r++;
            } else if (sum > k) {
                l++;
            } else {
                r++;
            }
            sum = sum + arr[r];
        }
        return length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
       // System.out.println(longestSubArrayWithSumK(arr, 3));
        System.out.println(longestSubArrayWithSumKEfficientApproach(arr, 3));
    }
}
