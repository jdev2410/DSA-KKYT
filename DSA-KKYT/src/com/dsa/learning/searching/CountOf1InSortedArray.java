package com.dsa.learning.searching;

public class CountOf1InSortedArray {

    public static int countOf1(int k) {
        int[] arr = {0};
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (k > arr[mid]) {
                mid++;
                l = mid;
            } else if (k < arr[mid]) {
                mid--;
                r = mid;
            } else {
                if (mid==0 || arr[mid - 1] < arr[mid]) {
                    return arr.length - mid;
                } else {
                    mid--;
                    r = mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(countOf1(1));
    }
}
