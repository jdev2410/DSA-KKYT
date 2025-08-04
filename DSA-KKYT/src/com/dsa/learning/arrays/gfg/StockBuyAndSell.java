package com.dsa.learning.arrays.gfg;

public class StockBuyAndSell {

    static void buyAndSellStock() {
        int[] arr = {1, 2, 100};
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        buyAndSellStock();
    }
}
