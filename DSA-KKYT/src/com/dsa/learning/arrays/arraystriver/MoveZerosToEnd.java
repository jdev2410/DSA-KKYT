package com.dsa.learning.arrays.arraystriver;

import java.util.Arrays;

public class MoveZerosToEnd {
    private static int[] reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;
    }


    private static int[] moveZerosToEnd(int[] arr) {
        Arrays.sort(arr);
        reverse(arr, 0, arr.length - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 5, 6,};
        System.out.println(Arrays.toString(moveZerosToEnd(arr)));
    }
}
