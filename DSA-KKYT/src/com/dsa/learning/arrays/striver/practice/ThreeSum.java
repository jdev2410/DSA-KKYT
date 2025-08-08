package com.dsa.learning.arrays.striver.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    public static Set<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    List<Integer> list = new ArrayList<>();
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        List<Integer> list1 = list.stream().sorted().toList();
                        set.add(list1);
                    }
                }
            }
        }
        return set;
        // Time complexity= (N)^3 N cube
        // Space complexity= (N)^3 N cube
    }

    public static List<List<Integer>> threeSumOptimized(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> hash = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> list = new ArrayList<>();
                int sum = -(nums[i] + nums[j]);
                if (hash.contains(sum)) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(sum);
                    List<Integer> list1 = list.stream().sorted().toList();
                    set.add(list1);
                }
                hash.add(nums[j]);
            }
        }
        return set.stream().toList();
    }

    private static List<List<Integer>> threeSumBestApproach(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer> > list1 = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    list1.add(list);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }

        }
        return list1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, -1, 2, -1};
        // System.out.println(threeSum(arr));
        System.out.println(threeSumOptimized(arr));
        System.out.println(threeSumBestApproach(arr, arr.length));
    }
}
