package com.dsa.learning.searching.binarysearch.tuf;

import java.util.List;

public class BSBasic {
// smallest index such that arr[index]>=x
    private static void findLowerBound(int[] arr, int x){
        int l=0;
        int e=arr.length-1;
        int ans=arr.length+1;
        while(l<=e){
            int mid=(l+e)/2;
            if(arr[mid]>=x){
                ans=mid;
                e=mid-1;

            }
                else
                    l=mid+1;
        }
        System.out.println(ans);
    }
    // smallest index such that arr[index]>x   880767426   fyxps9366d
    private static void findUpperBound(int[] arr, int x){
        int l=0;
        int e=arr.length-1;
        int ans=arr.length+1;
        while(l<=e){
            int mid=(l+e)/2;
            if(arr[mid]>x){
                ans=mid;
                e=mid-1;

            }
            else
                l=mid+1;
        }
        System.out.println(ans);
    }

    private static void findFloorValue(int[] arr, int x){
        int l=0;
        int e=arr.length-1;
        int ans=arr.length+1;
        while(l<=e){
            int mid=(l+e)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                l=mid+1;

            }
            else
                e=mid-1;
        }
        System.out.println(ans);
    }

//    private static List<Integer> findFirstAndLastOccurrenceOfX(int[] arr, int x){
//
//    }

    public static void main(String[] args) {
int[] arr={2,4,5,6,6,6};
        findLowerBound(arr,3);
        //findUpperBound(arr,4);
        //findFloorValue(arr,6);
        //System.out.println(findFirstAndLastOccurrenceOfX(arr,6));
    }
}
