package com.dsa.learning.arrays.gfg;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSumLeetCode {

    private static Set<List<Integer>> get3Sum(int[] arr) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
                        set.add(collect);
                    }
                }
            }
        }
        return set;
    }

    private static Set<List<Integer>> get3SumEfficientApproach(int[] arr, int length) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < length; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int j = i + 1;
            int k = length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    set.add(list);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }
        return set;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        // Set<List<Integer>> lists = get3Sum(arr);
        Set<List<Integer>> lists = get3SumEfficientApproach(arr, arr.length);
        System.out.println(lists);
    }
}
