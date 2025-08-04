package com.dsa.learning.arrays.gfg;
//VVV.IMP interview question
public class TrappingRainWater {
// This  question is still not clear hence implementation is incomplete
    static int trappingRainWater() {
        int[] arr = {2, 1, 0, 5,0,3};
        int waterCollected = 0;
        int maxWallHeight = arr[0];
        if (arr[1] >= arr[0]) {
            return -1;
        } else if (!(arr[arr.length - 1] >= arr[0])) {
            return -1;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                if (maxWallHeight > arr[i]) {
                    waterCollected += maxWallHeight - arr[i];
                }

            } else {
                if(arr[i]>maxWallHeight){
                    maxWallHeight=arr[i];
                }
                else if(arr[i]<maxWallHeight){
                    waterCollected += maxWallHeight - arr[i];
                }
            }

        }

        return waterCollected;
    }

    public static void main(String[] args) {
        System.out.println(trappingRainWater());
    }
}
