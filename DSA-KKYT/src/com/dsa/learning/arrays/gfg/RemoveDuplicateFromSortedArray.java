package com.dsa.learning.arrays.gfg;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] a={10,20};
         int count=0;
        List<Integer> list= new ArrayList<>();
        if(a.length==1) {
            list.add(a[count]);
        }
            while (a.length - 1 > count) {
                if (a[count] == a[count + 1]) {
                    list.add(a[count]);
                }
                count++;
            }
        System.out.println(list);
    }
}
