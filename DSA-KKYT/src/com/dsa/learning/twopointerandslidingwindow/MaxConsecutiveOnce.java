package com.dsa.learning.twopointerandslidingwindow;

public class MaxConsecutiveOnce {
    // Brut sol
    private static int maxConsecutiveOnce(int[] arr, int k) {
        int max = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0)
                    zeroCount++;
                int len = 0;
                if (zeroCount <= k) {
                    len = j - i + 1;
                    max = Math.max(len, max);
                } else
                    break;
            }
        }
        return max;
    }

    private static int maxConsecutiveOnceBetterSol(int[] arr, int k) {
        int max = 0;
        int zeroCount = 0;
        int l = 0;
        int r = 0;
        int len = 0;
        while (r < arr.length) {
            if (arr[r] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (arr[l] == 0)
                    zeroCount--;
                l++;
            }
            if (zeroCount <= k) {
                len = r - l + 1;
                max = Math.max(len, max);
            }
            r++;

        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        //System.out.println(maxConsecutiveOnce(arr, 2));
        System.out.println(maxConsecutiveOnceBetterSol(arr, 2));
    }
}
