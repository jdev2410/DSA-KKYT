package com.dsa.learning.arrays.gfg;

//VVV.Imp question for interview
public class EquilibriumPoint {

    public static boolean findCenterOfGravity() {
        int[] arr = {2, 2, 4};
        for (int i = 0; i < arr.length; i++) {
            int l = 0;
            int r = 0;
            for (int j = 0; j < i; j++) {
                l += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                r += arr[k];
            }
            if (l == r) {
                return true;
            }
        }
        return false;
    }

    public static boolean findCenterOfGravityOptimisedSolution() {
        int[] arr = {3, 4, 8, 9, -9, 7};
        int rs = 0;
        for (int i = 0; i < arr.length; i++) {
            rs += arr[i];
        }
        int ls = 0;
        for (int i = 0; i < arr.length; i++) {
            rs -= arr[i];
            if (ls == rs)
                return true;
            ls += arr[i];
        }
        return false;
    }

    public static void main(String[] args) {
        //System.out.println(findCenterOfGravity());// Time complexity is O(n2)
        System.out.println(findCenterOfGravityOptimisedSolution()); //Time complexity is O(n)
    }
}
