package com.dsa.learning.searching;

import java.util.function.Predicate;

public class BinarySearch {
// Time complexity of binary search is O(log n) and in worst case it is Theta of log n
    public static int binarySearch(int element){
        int[] arr={2,3,6,9,15,20};
        int l=0;
        int r=arr.length-1;
        while(l<=r){
             int mid=(l+r)/2;
             if(element>arr[mid]){
                 mid++;
                 l=mid;
             }
             else if(element<arr[mid]){
                 mid--;
                 r=mid;
             }
             else {
                 return mid;
             }
        }
        return -1;
    }

    public static void main(String[] args) {
        //System.out.println(binarySearch(66));

    }
}
