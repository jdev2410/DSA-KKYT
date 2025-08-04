package com.dsa.learning.searching;

public class SearchingInInfiniteSizedArray {
    public static int searchingInInfiniteArray(int k) {
        int[] arr = {1, 2, 3, 4, 7, 10, 20, 25, 60};
        if (arr[0] == k)
            return 0;
        int i = 1;
        int min = 0;
        while (k > arr[i]) {
            i = i * 2;
        }
        if (arr[i] == k)
            return i;
        return binarySearch(arr, k, i/2+1, i-1);
    }

    public static int binarySearch(int[] arr1, int element, int left, int right) {
        int[] arr = arr1;
        int l = left;
        int r = right;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (element > arr[mid]) {
                mid++;
                l = mid;
            } else if (element < arr[mid]) {
                mid--;
                r = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(searchingInInfiniteArray(5));
    }
}
