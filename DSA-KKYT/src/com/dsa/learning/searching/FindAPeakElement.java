package com.dsa.learning.searching;

public class FindAPeakElement {

    public static int findAPeakElement() {
        int[] arr = {6, 7, 8, 20, 12,60};
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if ((mid == 0 || arr[mid - 1] < arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }
            if (mid > 0 && arr[mid - 1] >= arr[mid])
                r = mid - 1;
            else
                l = mid +1;

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findAPeakElement());
    }
}
