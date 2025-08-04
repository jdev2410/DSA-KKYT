package com.dsa.learning.arrays.striver.practice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
    // Brut force approach
    private static int longestSubArray(int[] arr, int k) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    ans = Math.max(ans, j - i + 1);
                    break;
                }
            }
        }
        return ans;
    }

    // Better approach than previous
//    private static int longestSubArrayBetterApproach(int[] arr, int k) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//            if(sum==k){
//
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 2, 1, 1, 4, 5};
        System.out.println(longestSubArray(arr, 10));
    }
}
