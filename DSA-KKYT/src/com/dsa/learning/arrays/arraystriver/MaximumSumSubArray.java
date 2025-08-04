package com.dsa.learning.arrays.arraystriver;

public class MaximumSumSubArray {
    // Brut sol
    // space O(1)
    // time O(Ncube)
    private static int maximumSumSubArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            //  for (int j = i; j < arr.length; j++) {
            int sum = 0;
            for (int k = i; k < arr.length; k++) {
                sum = sum + arr[k];
                max = Math.max(sum, max);
            }
            //}
        }
        return max;
    }
    // Best sol
    // space O(1)
    // time O(N)
    private static int maximumSumSubArrayKadanesAlgo(int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > 0) {
                if(sum>max){
                    max=sum;
                }
                 System.out.println(arr[i]);
            } else {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
       // System.out.println(maximumSumSubArray(arr));
        System.out.println(maximumSumSubArrayKadanesAlgo(arr));
    }
}
