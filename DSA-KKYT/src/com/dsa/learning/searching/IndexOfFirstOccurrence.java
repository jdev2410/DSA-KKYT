package com.dsa.learning.searching;

public class IndexOfFirstOccurrence {

    public static int indexOfFirstOccurrence(int element) {
        int[] arr = {1, 10};
        //int[] arr = {1, 2,3,3,3,3,3,3,4,5};
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (element > arr[mid]) {
                mid++;
                l = mid;
            } else if (element < arr[mid]) {
                mid--;
                r = mid;
            } else {
                if (mid==0 || arr[mid]!=arr[mid-1])
                    return mid;
                else {
                    mid--;
                    r = mid;
                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(indexOfFirstOccurrence(10));
    }
}
