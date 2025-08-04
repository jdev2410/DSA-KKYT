package com.dsa.learning.arrays.arraystriver;

public class MaximumConsecutiveOnce {
    private static int maximumConsecutiveOnce(int[] arr) {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                max = Math.max(counter, max);
                counter = 0;
            } else {
                counter++;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(maximumConsecutiveOnce(arr));
    }
}
