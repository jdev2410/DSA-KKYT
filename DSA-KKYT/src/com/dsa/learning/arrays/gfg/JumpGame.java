package com.dsa.learning.arrays.gfg;
// Need to understand the questions first.
public class JumpGame {
    public static boolean jump(int[] arr) {
        if (arr.length==1 && arr[0] == 0)
            return true;
        int maxLength = arr.length-1;
        int currentIndex = 0;
        while (currentIndex < maxLength) {
            if (arr[currentIndex] == 0)
                return false;
            else {
                currentIndex = currentIndex + arr[currentIndex];
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={0,1};
        System.out.println(jump(arr));
    }
}
