package com.dsa.learning.searching;

public class TwoPointersApproach {
    // Not optimised solution O(n2)
    //Naive solution
    public static boolean twoPointersApproach(int k) {
        int[] arr = {2, 5, 6, 7, 10};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

// Optimized solution O(n)
    // Using two pointers approach
    public static boolean twoPointersApproachOptimisedSol(int k) {
        int[] arr = {2, 5, 6, 7, 10};
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] + arr[r] == k) {
                return true;
            }
            if (arr[l] + arr[r] < k) {
                l = l + 1;
            } else {
                r = r - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // System.out.println(twoPointersApproach(100));
        System.out.println(twoPointersApproachOptimisedSol(130));
    }
}
