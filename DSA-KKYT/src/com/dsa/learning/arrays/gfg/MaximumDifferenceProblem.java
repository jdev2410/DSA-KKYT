package com.dsa.learning.arrays.gfg;

public class MaximumDifferenceProblem {

    static void maxDiff() {
        //2,3,10,6,4,8,1
        int[] arr = {7,7,3,1};
        int ans = arr[1]-arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] > ans ) {
                ans = arr[i + 1] - arr[i];
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        maxDiff();
    }
}
