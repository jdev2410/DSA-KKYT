package com.dsa.learning.arrays.striver.practice;

public class BuyAndSellStocks {

    private static int buyAndSellStock(int[] arr) {
        int profit = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - min > 0) {
                profit = Math.max(profit, arr[i]-min);
            }
            min = Math.min(min, arr[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 4};
        System.out.println(buyAndSellStock(arr));
    }
}
