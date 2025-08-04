package com.dsa.learning.searching;

import java.util.Arrays;
import java.util.Collections;

public class RepeatingElement {

    public static int noOfRepeatingElement() {
        int[] arr = {0, 1, 2, 3, 2, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
            return -1;
    }
    public static int betterApproach() {
        int[] arr = {0, 1, 2, 3, 5, 4};
        boolean[] bool=new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
          if(bool[arr[i]]){
              return arr[i];
          }
            bool[arr[i]]=true;
        }
        return -1;
    }
    public static void main(String[] args) {
        //System.out.println(noOfRepeatingElement());
        System.out.println(betterApproach());
    }
}
