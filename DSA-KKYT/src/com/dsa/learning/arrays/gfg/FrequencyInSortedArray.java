package com.dsa.learning.arrays.gfg;

public class FrequencyInSortedArray {

    static void frequencyOfSortedArray() {
        int[] arr = {1, 1, 1, 3, 3, 4};
        int count = 1;
        int i = 1;
        while (i < arr.length) {
            while (i < arr.length && arr[i] == arr[i - 1]) {
                count++;
                i++;
            }
            System.out.println(arr[i - 1] + "--" + count);
            i++;
            count = 1;
        }
        if (i == arr.length && arr[i - 1] != arr[i - 2]) {
            System.out.println(arr[i - 1] + "--" + count);
        }
    }

    public static void main(String[] args) {
        frequencyOfSortedArray();
    }
}
