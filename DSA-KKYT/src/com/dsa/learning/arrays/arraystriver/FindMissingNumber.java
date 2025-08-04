package com.dsa.learning.arrays.arraystriver;

public class FindMissingNumber {
    private static int findMissingNumber(int[] arr) {
        int x1 = 0;
        int x2 = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            x2 = x2 ^ arr[i];
            x1 = x1 ^ arr[i + 1];
        }
        x1 = x1 ^ arr.length;
        return x1 ^ x2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(findMissingNumber(arr));
    }
}
