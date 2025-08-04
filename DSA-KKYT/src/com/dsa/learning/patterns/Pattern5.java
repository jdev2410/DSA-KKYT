package com.dsa.learning.patterns;

public class Pattern5 {
    /*

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *

     */

    public static void patter5(int n) {
        int count = 0;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i<=n && count < n) {
                count++;
            }else if(count>=1){
                count--;
            }

            for (int j = 1; j <= count; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patter5(5);
    }
}
