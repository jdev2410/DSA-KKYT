package com.dsa.learning.searching;

public class SearchInSortedRotatedArray {

    public static int searchInSortedRotatedArray(int k) {

        int[] arr = {100, 200, 500, 1000, 2000, 10, 20};
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == k)
                return mid;
            if (arr[l] <= arr[mid]) {
                if (k >= arr[l] && k < arr[mid])
                    r = mid-1;
                else
                    l = mid+1;
            } else {
                if (k > arr[mid] && k <= arr[r])
                    l = mid+1;
                else
                    r = mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(searchInSortedRotatedArray(20));
    }
}
