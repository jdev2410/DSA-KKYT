package com.dsa.learning.arrays.striver.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    private static List<Integer> twoSum(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    list.add(i);
                    list.add(j);
                    return list;
                }
            }
        }

        return list;
    }

    private static List<Integer> twoSumOptimized(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int left = target - arr[i];
            if (!map.containsKey(left)) {
                map.put(arr[i], i);
            } else {
                Integer val = map.get(left);
                return Arrays.asList(val, i);
            }
        }
        return Collections.emptyList();
        //TC- N logN
        //SC- N
    }

    private static List<Integer> twoSumSuperOptimized(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        Arrays.sort(arr);
        List<Integer> ans = new ArrayList<>();
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                ans.add(start);
                ans.add(end);
                return ans;
            }
            else if(sum<target)
                start++;
            else end--;
        }
        return Collections.emptyList();
        //TC-O(N) + O(N log N) for sorting
        //SC-O(1)
    }


    public static void main(String[] args) {
        //int[] arr = {1, 2, 5, 3, 7, 9, 2, 1};
        int[] arr = {2, 5, 3, 7, 9, 1};
        //System.out.println(twoSum(arr, 10));
        //System.out.println(twoSumOptimized(arr, 10));
        System.out.println(twoSumSuperOptimized(arr, 8));

    }
}
