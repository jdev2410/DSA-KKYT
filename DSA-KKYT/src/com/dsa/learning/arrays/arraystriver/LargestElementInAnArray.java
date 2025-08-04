package com.dsa.learning.arrays.arraystriver;

public class LargestElementInAnArray {
    private static int getLargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    private static int secondLargestElement(int[] arr) {
        int largest = getLargestElement(arr);
        int secondLargest = -1;// assuming all the elements are positive
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    private static int secondLargestElementEfficientApproach(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;// assuming all the elements are positive
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                    secondLargest = largest;
                largest = arr[i];
            } else if (arr[i]<largest && arr[i]>secondLargest) {
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 10, 9, 8};
        // System.out.println(getLargestElement(arr));
        // System.out.println(secondLargestElement(arr));
        System.out.println(secondLargestElementEfficientApproach(arr));
    }
}
