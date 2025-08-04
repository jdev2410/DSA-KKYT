package com.dsa.learning.arrays.gfg;

import java.util.HashSet;
import java.util.Set;

public class LeaderInAnArray {

    static void leaderInAnArray() {// Non Optimized code
        Set<Integer> set = new HashSet<>();
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        int count = 0;
        int start;
        for (int i = 0; i < arr.length; i++) {
            start = i + 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }
            if (arr.length - start == count) {
                set.add(arr[i]);
            }
            count = 0;

        }
        System.out.println(set);
    }

    static void leaderInAnArrayOptimized() {//  Optimized code

        int[] arr = {7, 10, 4, 10, 6, 5, 2};

        for (int i = 0; i < arr.length; i++) {
            boolean b = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    b = true;
                    break;
                }
            }
            if (b == false) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {

       // leaderInAnArray();
        leaderInAnArrayOptimized();

    }
}
