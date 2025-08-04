package com.dsa.learning.arrays.arraystriver;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromSortedArray {

    private static void removeDuplicateFromSortedArray(int[] arr) {
        //int start = arr[0];
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                list.add(arr[i]);
            }
            else {
                list.add(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4, 4, 6, 6 };
        removeDuplicateFromSortedArray(arr);
    }
}
