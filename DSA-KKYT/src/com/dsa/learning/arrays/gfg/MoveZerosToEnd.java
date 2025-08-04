package com.dsa.learning.arrays.gfg;

import java.util.Arrays;

public class MoveZerosToEnd {
 static void naiveSolution(){
     int[] array = {10,5,0,0,8,0,9,0};
     for (int i = 0; i < array.length; i++) {
         if(array[i]==0){
             for (int j = i+1; j < array.length; j++) {
                 if(array[j]!=0){
                     int var1=array[i];
                     int var2=array[j];
                     array[j]=var1;
                     array[i]=var2;
                 }
             }
         }

     }
     System.out.println(Arrays.toString(array));
 }

    static void efficientSolution(){
        int[] array = {10,5,0,0,8,0,9,0};
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                        int var1=array[i];
                        int var2=array[count];
                        array[count]=var1;
                        array[i]=var2;
                        count++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        //naiveSolution();
        efficientSolution();
    }
}