package com.dsa.learning.arrays.gfg;

//VVV.IMP interview question
public class MinimumConsecutiveFlips {

    static void minConsecutiveFlips() {

        int[] arr = {1, 1, 0, 0, 0, 1,0};
      int startIndex = 0;
      int endIndex = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[0]!=arr[i]){
                    startIndex=i;
                    System.out.print("from "+startIndex+" to ");
                }
                else {
                    endIndex=i-1;
                    System.out.println(endIndex);
                }
            }
        }
if(arr[arr.length-1]!=arr[0]){
    System.out.println(arr.length-1);
}
    }

    public static void main(String[] args) {
     minConsecutiveFlips();
    }
}
