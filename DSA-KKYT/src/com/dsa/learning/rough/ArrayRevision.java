package com.dsa.learning.rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayRevision {
    //    public static int largestElementInAnArray(int[] arr) {
//        int largestElement = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largestElement)
//                largestElement = arr[i];
//        }
//        return largestElement;
//}
// ====================================================================================================================
//1 0 2 0 5 6
    // 1 2 0 0 5 6
    // 1 2 5 0 0 6
    // 1 2 5 6 0 0
    // 8 5 0 10 0 0 5
//    public static void moveZerosToEnd(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                for (int j = i + 1; j < arr.length - 1; j++) {
//                    if (arr[j] != 0) {
//                        arr[i] = arr[j];
//                        arr[j] = 0;
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }

//    public static void leftRotateAnArrayByOne(int[] arr) {
//        int temp = arr[0];
//        for (int i = 0; i < arr.length - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        arr[arr.length - 1] = temp;
//        System.out.println(Arrays.toString(arr));
//    }


//    public static void rotateAnArrayNTimes(int[] arr, int n) {
//        int a = arr[0];
//        int temp = 1;
//        while (temp <= n) {
//            for (int i = 0; i < arr.length - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//            arr[arr.length - 1] = a;
//            a=arr[0];
//            temp++;
//        }
//        System.out.println(Arrays.toString(arr));
//    }

//    public static List<Integer> findLeaderInAnArray(int[] arr) {
//        List<Integer> leader = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            boolean x = false;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] > arr[i]) {
//                    x = true;
//                    break;
//                }
//            }
//            if (!x)
//                leader.add(arr[i]);
//        }
//        return leader;
//    }

    //    public static int buyAndSellStock(int[] arr) {
//        int profit = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i + 1] - arr[i] > 0)
//                profit = profit + (arr[i + 1] - arr[i]);
//        }
//        return profit;
//    }
//    public static int[] longestConsecutiveSequence(int[] arr) {
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
////        for (int i = 0; i < arr.length; i++) {
////            int consEleToBeSearched = arr[i] + 1;
////            for (int j = 0; j < arr.length; j++) {
////                if(){
////
////                }
////            }
////        }
//
//        return arr;
//    }

    public static List<List<String>> groupAnagram(List<String> str) {
        Map<String, List<String>> map = new HashMap<>();
        for (String words : str) {
            char[] charArray = words.toCharArray();
            Arrays.sort(charArray);
            String sortedWords = new String(charArray);
            if (!map.containsKey(sortedWords)) {
                map.put(sortedWords, new ArrayList<>());
            }
            map.get(sortedWords).add(words);
        }
        return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {
        //int[] arr={5,6,36,9,8,20};
        //int[] arr = {5, 0, 0, 9, 8, 0};
        //System.out.println(largestElementInAnArray(arr));
        //moveZerosToEnd(arr);
        // int[] i = {1, 2, 3, 4};
        //leftRotateAnArrayByOne(i);
        //rotateAnArrayNTimes(i, 5);
        // int[] lead = {7, 10, 4, 3, 6, 5, 2};
        //int[] lead = {10, 20,30};
        //int[] lead = {30, 20, 10};
        // System.out.println(findLeaderInAnArray(lead));
        // int[] arr = {1, 5, 3, 8, 12, 2};
        //System.out.println(longestConsecutiveSequence(arr));
        //System.out.println(groupAnagram(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat")));
        int[] arr={1,1,1,1,1,1,1,1};
    }
}
