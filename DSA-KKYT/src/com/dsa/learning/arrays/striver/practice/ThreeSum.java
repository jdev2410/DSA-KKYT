package com.dsa.learning.arrays.striver.practice;

import java.util.ArrayList;
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

        public static void main (String[]args){
            int[] arr = {-1, 2, -1, -1, 2, -1};
           // System.out.println(threeSum(arr));
            System.out.println(threeSumOptimized(arr));
        }
    }
