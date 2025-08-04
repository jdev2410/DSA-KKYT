package com.dsa.learning.patterns;

public class Pattern3 {
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern3(5);
    }
}
