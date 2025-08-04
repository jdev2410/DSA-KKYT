package com.dsa.learning.arrays.arraystriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    private static List<Integer> twoSum(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    list.add(arr[i]);
                    list.add(arr[j]);
                    return list;
                }
            }
        }
        return Collections.emptyList();
    }

    private static void twoSumBetter(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int difference = target - arr[i];
            if (map.containsKey(difference)) {
                System.out.println(i + " " + map.get(difference).intValue());
                return;
            } else {
                map.put(arr[i], i);
            }
        }
    }

    private static boolean twoSumBest(int[] arr, int target) {
        Arrays.sort(arr);
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int sum = arr[s] + arr[e];
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                s++;
            } else if (sum > target) {
                e--;
            }
        }
        return false;
        // TC _ O(N)+O(NlogN)
        //SC- O(1)
    }

    private static void shiftZerosAOnceAndTwo(int[] arr) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zero++;
            else if (arr[i] == 1)
                one++;
            else
                two++;
        }
        System.out.println("zero:" + zero + " one:" + one + " two:" + two);
        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
        for (int i = zero; i < one + zero; i++) {
            arr[i] = 1;
        }
        for (int i = one + zero; i < arr.length; i++) {
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
        //TC-O(N)(for first loop)+O(N)(For last three loop)= O(2N)
        //SC-(1)
    }

    private static void shiftZerosAOnceAndTwoBetter(int[] arr) {
        //Using Dutch Nation Flag Algorithm
        //arr[mid]==0 swap(arr[low], arr[mid]) and low++ and mid++
        //arr[mid]==1 mid++
        //arr[mid]==2 swap(arr[mid], arr[high]) and  high--;
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
        //TC-O(N)
        //SC-O(1)
    }

    private static void shiftZerosAOnce(int[] arr) {
        int low = 0;
        int mid = 0;
        while (mid < arr.length && low <= mid) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void majorityElement(int[] arr) {
        Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Integer key = collect.entrySet().stream().sorted((a, b) -> b.getValue().intValue() - a.getValue().intValue()).findFirst().get().getKey();
        System.out.println(key);
    }


    private static int majorityElementBetter(int[] arr) {
        // Moore's Voting Algorithm.
        int ele = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                ele = arr[i];
                count = 1;
            } else if (ele == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i])
                count1++;
        }
        if (count1 >= (arr.length / 2))
            return ele;
        return -1;
    }


    private static int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    private static int maxSubArrayOptimal(int[] arr) {
        //Kadane's Algorithm
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 0) {
                max = Math.max(sum, max);
            } else {
                sum = 0;
            }
        }
        return max;
    }

    private static int subArrayWithSumK(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 8, 4, 6, -2, -2};
        //System.out.println(longestSubSequence(arr, 3));
        //System.out.println(twoSum(arr, 11));
        //twoSumBetter(arr,-4);
        //System.out.println(twoSumBest(arr, 7));
        //int[] arr = {1, 2, 0, 0, 1, 2, 0, 1, 2, 0, 2, 1, 0, 1, 2};
        //int[] arr = {0, 0, 1, 0, 1, 0, 1, 0, 1};
        //shiftZerosAOnceAndTwo(arr);
        //shiftZerosAOnceAndTwoBetter(arr);
        //shiftZerosAOnce(arr);
        // int[] arr = {1, 2, 3, 1, 1, 1, 2, 2, 2};
        //majorityElement(arr);
        //System.out.println(majorityElementBetter(arr));
        //int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        //ystem.out.println(maxSubArray(arr));
        //System.out.println(maxSubArrayOptimal(arr));
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        System.out.println(subArrayWithSumK(arr, 3));
    }
}
