package com.dsa.learning.arrays.arraystriver;

public class FindMinimumInArray {
    // time O(n)
    private static int findMinInArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    private static int findMinInArrayEfficientApproach(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int min = 100;
        if (arr[s] < arr[e])
            return arr[s];
        while (s <= e) {
            int m = (s+e) / 2;
            if (arr[s] <= arr[m]) {
                min = Math.min(min, arr[s]);
                s = m + 1;
            } else {
                min = Math.min(min, arr[m]);
                e = m - 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // Array is rotated sorted array.
        // Write the code in log N time
        int[] arr = {3, 4, 5, 1, 2};
      //  System.out.println(findMinInArray(arr));
        System.out.println(findMinInArrayEfficientApproach(arr));
    }
}
