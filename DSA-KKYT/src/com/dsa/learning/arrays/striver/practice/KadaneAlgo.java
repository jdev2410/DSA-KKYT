package com.dsa.learning.arrays.striver.practice;

import java.util.Map;

public class KadaneAlgo {
    private static int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    private static int maxSubArrayOptimized(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max)
                max = sum;
            if (sum < 0)
                sum = 0;

        }
        return max;
        //TC: O(N)
        //SC: O(1)
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -1, 5};
        //System.out.println(maxSubArray(arr));
        System.out.println(maxSubArrayOptimized(arr));
    }
}
