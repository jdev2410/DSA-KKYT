package com.dsa.learning.arrays.gfg;

public class MaximumEvenOddSubArray {

    static int maxEvenOdd() {
        int[] arr = {3,2,5,8,9,10,12,14,18,15,15,20};
        int res = 1;
        int temp=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] % 2 == 0 && arr[i] % 2 != 0) {
                temp++;
                res =  Math.max(res,temp);
            } else if (arr[i - 1] % 2 != 0 && arr[i] % 2 == 0) {
                temp++;
                res =  Math.max(res,temp);
            }
            else {
                temp=1;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxEvenOdd());
    }
}
