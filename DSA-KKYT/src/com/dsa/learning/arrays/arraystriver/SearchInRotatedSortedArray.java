package com.dsa.learning.arrays.arraystriver;

public class SearchInRotatedSortedArray {
    private static boolean doesElementExists(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == target)
                return true;
            else if (arr[s] <= arr[m]) {
                if ((target >= arr[s] && target <= arr[m]))
                    e = m - 1;
                else
                    s = m + 1;
            } else {
                if (arr[m] <= target && target <= arr[e])
                    s = m + 1;
                else
                    e = m - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 8, 1, 2};
        System.out.println(doesElementExists(arr, 4));
    }
}
