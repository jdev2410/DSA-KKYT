package com.dsa.learning.arrays.striver.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {

    public static void moveZerosToEnd() {
        int[] arr = {0, 0, 1, 2, 0, 10, 0, 0};
        List<Integer> listOfNonZeros = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) { // O(N)
            if (arr[i] != 0)
                listOfNonZeros.add(arr[i]);
        }
        for (int i = 0; i < listOfNonZeros.size(); i++) {//O(X)
            arr[i] = listOfNonZeros.get(i);
        }
        for (int i = listOfNonZeros.size(); i < arr.length; i++) {//O(N-X)
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
        // TIME COMPLEXITY= O(N)+O(X)+O(N-X)=O(2N)
        // Extra Space= O(X)- Means size of non zero size array. Or it could be O(N) also because what if there is
        // no zero in the array. All the non zero element will be transfer to arrayList so it will be O(N).
    }

    public static void moveZerosToEndOptimal() {
        int[] arr = {0,0,0,1, 2, 0, 9, 0, 3,0,4,7};
        int zeroPointer = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroPointer = i;
                break;
            }
        }
            int nonZero=zeroPointer+1;
            while(nonZero< arr.length){
                if(arr[nonZero]!=0) {
                    arr[zeroPointer] = arr[nonZero];
                    arr[nonZero] = 0;
                    zeroPointer++;
                }
                nonZero++;
            }
        System.out.println(Arrays.toString(arr));
        // TIME COMPLEXITY=O(X), where is x the first 0th position - O(N-X) , means O(X)+O(N)-O(X)= O(N)
        // SPACE COMPLEXITY= No extra space is using, we are manipulating arr[] only so O(1).
    }


    public static void main(String[] args) {
        //moveZerosToEnd();
        moveZerosToEndOptimal();
    }
}
