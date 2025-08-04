package com.dsa.learning.searching;

public class SquareRoot {
    public static int findSquareRoot(int x) {
        int l = 1;
        int r = x;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int sqr = mid * mid;
            if (sqr == x)
                return mid;
            if (sqr > x) {
                r = mid - 1;
            }else if(sqr<x){
                l=mid+1;
                ans=mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findSquareRoot(169));
    }
}
