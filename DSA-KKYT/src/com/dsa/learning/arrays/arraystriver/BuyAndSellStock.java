package com.dsa.learning.arrays.arraystriver;

public class BuyAndSellStock {

    private static int buyAndSellStock(int[] arr) {
        int min = arr[0];
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            int profit = arr[i] - min;
            max = Math.max(max, profit);
            min = Math.min(min, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4,10};
        System.out.println(buyAndSellStock(arr));
    }
}
