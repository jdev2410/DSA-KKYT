package com.dsa.learning.twopointerandslidingwindow;

import java.util.HashSet;
import java.util.Set;

public class FruitsInBasket {

    private static int fruitsInBasket(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < arr.length; j++) {
                set.add(arr[j]);
                if (set.size() <= 2) {
                    max = Math.max(max, j - i + 1);
                } else
                    break;
            }
        }
        return max;
    }
    // Rewrite the solution. **** Incorrect code
    private static int fruitsInBasketBetterSol(int[] arr) {
        int max = 0;
        int l = 0;
        int r = 0;
        Set<Integer> set = new HashSet<>();
        while (r < arr.length) {
            set.add(r);
            if (set.size() <= 2) {
                max = Math.max(max, r - l + 1);
                r++;
            } else {
                l = r - 1;
                r = l;
                set = new HashSet<>();
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        //System.out.println(fruitsInBasket(arr));
        System.out.println(fruitsInBasketBetterSol(arr));
    }
}
