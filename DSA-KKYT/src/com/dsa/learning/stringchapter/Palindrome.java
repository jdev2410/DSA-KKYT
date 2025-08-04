package com.dsa.learning.stringchapter;

public class Palindrome {

    // Nive solution
    public static boolean isPalindromeString(String str){
        StringBuilder stringBuilder= new StringBuilder(str);
        stringBuilder.reverse();
        if(str.equals(stringBuilder.toString()))
            return true;
        else
            return false;
    }
    // Efficient solution
    public static boolean isPalindromeEfficientSolution(String str){
        int start=0;
        int end=str.length()-1;
        while(start<=end){
             if(str.charAt(start)==str.charAt(end)){
                 start++;
                 end--;
             }
             else {
                 return false;
             }
        }
      return true;
    }
    public static void main(String[] args) {
       // System.out.println(isPalindromeString("ABAC"));
        System.out.println(isPalindromeEfficientSolution("ABCCBA"));
    }
}
