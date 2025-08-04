package com.dsa.learning.patterns;

public class Pattern2 {
//        * * * *
//        * * * *
//        * * * *
//        * * * *
    public static void patter2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patter2(4);
    }
}
