package com.dsa.learning.leetcode.arraymediumlevel;

public class ContainerWithMostWater {

    public static int containsMostWater() {
        int[] arr = {2,6,1,5,4};
        int leftIndex=0;
        int rightIndex= arr.length-1;
        int max=0;
        while(leftIndex<rightIndex){
            int leftVertical = arr[leftIndex];
            int rightVertical = arr[rightIndex];
            int min = Math.min(leftVertical, rightVertical);
             max= Math.max(max,min*(rightIndex-leftIndex));
             if(leftVertical<rightVertical)
                 leftIndex++;
             else
                 rightIndex--;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(containsMostWater());
    }
}
