package com.dsa.learning.arrays.striver.practice;

import java.util.Arrays;

public class RotateArray {

    private static void rotateLeftByOneElement() {
        int[] arr = {1, 2, 3, 4, 5};
        int zeroIndex = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = zeroIndex;
        System.out.println(Arrays.toString(arr));
        // TIME COMPLEXITY= O(N)
        // Space COMPLEXITY= O(N) we are using arr array to solve the problem that's y O(N)
        // Extra Space= O(1) We are not taking any further array that's y O(1)
    }

    private static void rotateLeftByDElement(int d) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};// 3,4,5,6,7,1,2
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = arr.length - d; i < arr.length; i++) {
            arr[i] = temp[(i - (arr.length - d))];
        }
        System.out.println(Arrays.toString(arr));
        // TIME COMPLEXITY= O(D)+O(N-D)+O(D)= O(n+d)
        // Extra Space= O(D) Because we are using temp array.
    }

    private static void rotateRightByOneElement() {
        int[] arr = {1, 2, 3, 4, 5};
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateLefByDElement(int d) {
        int[] arr = {1, 2, 3, 4};
        d = d % arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        // TIME COMPLEXITY= O(2N)
        // Extra Space= O(1) Because we are not using any other array, we are manupulating arr only.
    }

    private static void rotateRightByDElement(int d) {
        int[] arr = {1, 2, 3, 4};
        d = d % arr.length;
        d = arr.length - d;// This line will be responsible for rotating right
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        // TIME COMPLEXITY= O(2N)
        // Extra Space= O(1) Because we are not using any other array, we are manupulating arr only.
    }

    private static void reverse(int[] arr, int start, int end) {
        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        //rotateLeftByOneElement();
        //rotateLeftByDElement(4);// Where 2 is how many left rotate you want.
        //rotateRightByOneElement();
        // rotateLefByDElement(2);
        //rotateRightByDElement(2);
    }
}
