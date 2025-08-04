package com.dsa.learning.arrays.arraystriver;

import java.util.Arrays;

public class LeftRotate {


    private static int[] leftRotateByOne(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }
        return arr;
        // space complexity= O(N)
        // Extra space =O(1)
        // Time complexity= O(N)
    }

    private static int[] leftRotateByDPlaces(int[] arr, int d) {
        int rotationTimes = d % arr.length;
        for(int j=0; j<rotationTimes; j++) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }
        }
        return arr;
    }

    private static int[] leftRotateByDPlacesAnotherApproach(int[] arr, int d) {
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
        return arr;
    }

    private static int[] reverse(int[] arr, int start, int end) {
//        int start=0;
//        int end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5,6,7,8,9,10};
       // System.out.println(Arrays.toString(leftRotateByOne(arr)));
        // System.out.println(Arrays.toString(leftRotateByDPlaces(arr,1)));
         //System.out.println(Arrays.toString(reverse(arr)));
         //System.out.println(Arrays.toString(leftRotateByDPlacesAnotherApproach(arr,3)));
    }
}
