package com.dsa.learning.patterns;

public class Pattern6 {
/*
            *
          *   *
         *  *   *
       *  *  *   *
      *  *  *  *   *
       *  *  *   *
         *  *  *
          *  *
            *
 */
    public static void pattern6(int n)
    {
        int count=1;
        for(int i = 1; i <= 2*n-1; i++){
          for(int j=1; j<=n ;j++){
              if(count<n)
              System.out.print("* ");
              else
                  System.out.print(" ");
          }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern6(4);
    }
}
