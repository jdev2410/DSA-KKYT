package com.dsa.learning.sorting;

import java.util.Arrays;

public class SelectionSort {
    private static String selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int b = -1;
            for (int j = i; j < arr.length; j++) {
               if(arr[j]<min){
                   min=arr[j];
                   b = j;
               }
            }
            swap(arr, i, b);
        }
        return Arrays.toString(arr);
        //TC- O(N square)
    }

    private static void swap(int[] arr, int i, int b) {
        int temp = arr[b];
        arr[b] = arr[i];
        arr[i] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 3, 2, 18};
        System.out.println(selectionSort(arr));
    }
}
