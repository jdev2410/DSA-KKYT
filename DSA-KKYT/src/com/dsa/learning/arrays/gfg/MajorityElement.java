package com.dsa.learning.arrays.gfg;

public class MajorityElement {

    static int majorityElement() {
        int[] arr = {3, 7, 4, 7, 7, 5};
        int temp = 1;
        int result = 1;
        int res = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    temp++;
                    result = Math.max(result, temp);
                }
            }
            if (temp > res) {
                res = result;
                index = i;
            }
            temp = 1;

        }

        if (res > arr.length / 2) {
            return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement());
    }
}
