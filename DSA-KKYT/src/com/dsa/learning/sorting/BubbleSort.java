package com.dsa.learning.sorting;

import java.util.Arrays;

public class BubbleSort {
    private static String bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j+1);
            }
        }
        return Arrays.toString(arr);
    }

    private static void swap(int[] arr, int i, int b) {
        int temp = arr[b];
        arr[b] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 2, 1, 9};
        System.out.println(bubbleSort(arr));
    }
}
