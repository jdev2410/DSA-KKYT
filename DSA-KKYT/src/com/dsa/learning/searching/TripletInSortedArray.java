package com.dsa.learning.searching;

public class TripletInSortedArray {

    public static boolean tripletInSortedArray(int k) {
        int[] arr = {2, 5, 10, 15, 18};
        int l = 0;
        int r = arr.length - 1;
        int mid = (l + r) / 2;
        while (mid != r) {
            int ans = arr[l] + arr[r] + arr[mid];
            if (ans == k) {
                return true;
            }
            if (ans < k) {
                l = l + 1;
                if (l == mid) {
                    mid = mid + 1;
                    l = l - 1;
                }
            } else {
                r = r - 1;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(tripletInSortedArray(33));
    }
}
