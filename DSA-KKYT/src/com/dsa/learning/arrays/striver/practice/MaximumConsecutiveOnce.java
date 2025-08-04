package com.dsa.learning.arrays.striver.practice;

public class MaximumConsecutiveOnce {

    private static void maximumConsecutiveOnce() {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1,1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max=Math.max(count,max);
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        maximumConsecutiveOnce();
    }
}
