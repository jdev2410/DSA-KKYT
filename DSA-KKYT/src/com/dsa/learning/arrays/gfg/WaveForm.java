package com.dsa.learning.arrays.gfg;

import java.util.Arrays;

public class WaveForm {

    public static String  sorted() {
        int[] arr = {5, 2, 6, 9, 8, 7};
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        System.out.println(sorted());
    }
}
