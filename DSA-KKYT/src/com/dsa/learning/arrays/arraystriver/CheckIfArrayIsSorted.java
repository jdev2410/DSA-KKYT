package com.dsa.learning.arrays.arraystriver;

public class CheckIfArrayIsSorted {
    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>=arr[i-1]){

            }
            else
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0};
        System.out.println(isSorted(arr));
    }
}
