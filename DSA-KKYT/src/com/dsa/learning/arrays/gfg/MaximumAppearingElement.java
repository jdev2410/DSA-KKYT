package com.dsa.learning.arrays.gfg;

public class MaximumAppearingElement {

    public static void maxAppearingEle(int amount) {

        int[] arr = {2000, 500, 200, 100};
        int noteCount = 0;
        boolean check = true;
        if(amount%100!=0)
            check= false;
            if(check) {
                for (int i = 0; i < arr.length; i++) {
                    if (amount >= arr[i]) {
                        noteCount = amount / arr[i];
                        System.out.println(arr[i] + "-- No of notes is " + noteCount);
                        amount = amount % arr[i];
                    }
                }
            }
            else {
                System.out.println("Amount must be entered in multiple of 100 ");
            }
    }


    public static void main(String[] args) {
        maxAppearingEle(700);

    }
}
