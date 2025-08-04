package com.dsa.learning.arrays.striver.practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LongestConsecutive {

    private static int longestCons(int[] arr) {
        //1,1,2,2,3,6,7
        //1,2,3,6,7
        List<Integer> list = Arrays.stream(arr).boxed().sorted().distinct().toList();
        int s = 1;
        int e = list.size();
        int count = 1;
        int largest = 0;
        while (s < e) {
            if (list.get(s) - list.get(s - 1) == 1) {
                count++;
            } else {
                count = 1;
            }
            s++;
            largest = Math.max(largest, count);
        }
        return largest;
    }

    //private static

    public static void main(String[] args) {
        int[] arr = {1, 3, 6};
        System.out.println(longestCons(arr));
    }
}
