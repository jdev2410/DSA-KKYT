package com.dsa.learning.arrays.gfg;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static int getLongestConsecutiveSeq(int[] arr) {
        Arrays.sort(arr);
        int count=0;//4
        int maxSeq=0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {

            }
        }
        return maxSeq;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 1, 3, 2};
        getLongestConsecutiveSeq(arr);
    }
}
