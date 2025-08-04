package com.dsa.learning.arrays.gfg;

public class SubArrayOfGivenSum {

    public static boolean subArrayOfProvidedSum(int sum) {
        int[] arr = {3,2,0,4,7};
        for (int i = 0; i < arr.length; i++) {
            int ans = 6;
            for (int j = i; j < arr.length; j++) {
                ans = ans+ arr[j];
                if (ans == sum) {
                    return true;
                } else if (ans > sum) {
                    break;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(subArrayOfProvidedSum(6));
    }
}
