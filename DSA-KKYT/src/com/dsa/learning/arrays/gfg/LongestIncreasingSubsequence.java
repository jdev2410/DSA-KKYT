package com.dsa.learning.arrays.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {

    public static List<Integer> findLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        int n = nums.length;
        int[] lis = new int[n];
        int[] prev = new int[n];
        Arrays.fill(lis, 1);
        Arrays.fill(prev, -1);

        int maxLength = 1;
        int maxIndex = 0;

        // Build the lis array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                    prev[i] = j;
                }
            }
            if (lis[i] > maxLength) {
                maxLength = lis[i];
                maxIndex = i;
            }
        }

        // Reconstruct the LIS sequence
        List<Integer> sequence = new ArrayList<>();
        for (int i = maxIndex; i >= 0; i = prev[i]) {
            sequence.add(0, nums[i]);
            if (prev[i] == -1) {
                break;
            }
        }

        return sequence;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 6, 7, 3, 10, 25};
        List<Integer> lis = findLIS(nums);
        System.out.println("Longest Increasing Subsequence: " + lis);
    }
}
