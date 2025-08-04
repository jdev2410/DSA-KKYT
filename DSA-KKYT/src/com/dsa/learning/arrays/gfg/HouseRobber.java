package com.dsa.learning.arrays.gfg;

public class HouseRobber {
    public static int rob(int[] arr) {
        int robbedAmount = 0;
        for (int i = 0; i < arr.length; i += 2) {
            robbedAmount = arr[i] + robbedAmount;
        }
        return robbedAmount;
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(rob(arr));
    }
}
