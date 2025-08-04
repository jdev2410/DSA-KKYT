package com.dsa.learning.greedy;

import java.util.Arrays;

public class AssignCookies {
    private static int assignCookies(int[] size, int[] greed) {
        Arrays.sort(size);
        Arrays.sort(greed);
        int l = 0;
        int r = 0;
        while (l < size.length) {
            if (size[l] >= greed[r])
                r++;
            l++;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] greed = {1, 5, 3, 3, 4};
        int[] size = {4, 2, 1, 2, 1, 3};
        System.out.println(assignCookies(size,greed));
    }
}
