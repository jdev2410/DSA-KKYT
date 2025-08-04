package com.dsa.learning.arrays.arraystriver;

public class MaximumProductSubArray {

//    private static int maxProductSubArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 1;
//            for (int j = i; j < arr.length; j++) {
//               sum=
//            }
//        }
//    }

    private static int maxProductSubArrayEfficientSolution(int[] arr) {
        int prefix = 1;
        int suffix = 1;
        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix = prefix * arr[i];
            suffix = suffix * arr[arr.length - i - 1];
            max = Math.max(max,  Math.max(prefix, suffix));

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 2, 5, 1};
        System.out.println(maxProductSubArrayEfficientSolution(arr));
    }
}
