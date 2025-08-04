package com.dsa.learning.arrays.arraystriver;

import java.util.*;

public class ThreeSum {
    // time O(Ncube)*log(unique array set)
    // space 2*O(No of triplets)
    private static Set<List<Integer>> getThreeSum(int[] arr) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    List<Integer> list = new ArrayList<>();
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        List<Integer> collect = list.stream().sorted().toList();
                        set.add(collect);
                    }

                }
            }
        }
        return set;
    }
  // time- n logn+ O(n)square
    //space- O(number of unique triplets)
    private static Set<List<Integer>> getThreeSumEfficientApproach(int[] arr) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int ans = arr[i] + arr[j] + arr[k];
                if (ans < 0) {
                    j++;
                } else if (ans > 0) {
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
        System.out.println(getThreeSum(arr));
        System.out.println(getThreeSumEfficientApproach(arr));
    }
}
