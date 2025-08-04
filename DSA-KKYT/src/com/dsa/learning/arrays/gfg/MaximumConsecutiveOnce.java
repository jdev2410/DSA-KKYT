package com.dsa.learning.arrays.gfg;

import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumConsecutiveOnce {


    static int maxConsOnce() {

        int[] arr = {0, 1, 1, 0, 0, 1, 1, 0};
        int sum = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sum++;
                result = Math.max(result, sum);
            } else {
                sum = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) throws ParseException {
       // System.out.println(maxConsOnce());
        Optional<List<String>> opt= Optional.of(Arrays.asList());
        if(!opt.get().isEmpty()){
            System.out.println("sdflksj");
        }
        else
            System.out.println("Empty list");
        String s="";
        s.getBytes(StandardCharsets.UTF_8);
    }
}
