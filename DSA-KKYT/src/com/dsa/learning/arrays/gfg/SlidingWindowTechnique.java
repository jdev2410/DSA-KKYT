package com.dsa.learning.arrays.gfg;

//VVV.IMP interview question
public class SlidingWindowTechnique {
    //Time complexity of this solution is O(n*k)
    public static int slidingWindow(int k) {
        int[] arr = {2, 6, 3, 1, 2};

        int max = 0;
        for (int i = 0; i + k - 1 <= arr.length - k; i++) {
            int curr = 0;
            for (int j = 0; j < k; j++) {
                curr += arr[i + j];
            }
            max = Math.max(curr, max);
        }
        return max;
    }

    //Time complexity of optimized solution is O(n)
    public static int slidingWindowOptimized(int k) {
        int[] arr = {3,7,2,1,9,5};
        int curr = 0;
        int res = 0;
        for (int i = 0; i < k; i++) {
            curr = curr + arr[i];
        }
        res = curr;
        for (int i = k; i < arr.length; i++) {
            curr = arr[i] + curr - arr[i - k];
            res = Math.max(curr, res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(slidingWindowOptimized(3));
    }
}
