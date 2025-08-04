package com.dsa.learning.stringchapter;

import java.util.Arrays;

public class LongestCommonPrefix {

    private static String getCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length-1];
        int index=0;
        StringBuffer s= new StringBuffer();
        while(index<firstString.length()){
            if(firstString.charAt(index)!=lastString.charAt(index))
                break;
            else {
                System.out.print(firstString.charAt(index));
                s.append(firstString.charAt(index));
            }
            index++;
        }
       return new String(s);
    }
    public static void main(String[] args) {
        String[] str= {"ab","a"};
        getCommonPrefix(str);
    }
}
