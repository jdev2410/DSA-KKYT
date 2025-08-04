package com.dsa.learning.greedy;

public class LemonadeChange {
    public static Boolean lemonadeChange(int[] money) {
        int five = 0;
        int ten = 0;

        for (int i = 0; i < money.length; i++) {

            if (money[i] == 5)
                five++;

            else if (money[i] == 10) {
                ten++;
                if (five == 0)
                    return false;
                else {
                    five--;
                }
            } else {

                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 20};
        System.out.println(lemonadeChange(arr));
    }
}

