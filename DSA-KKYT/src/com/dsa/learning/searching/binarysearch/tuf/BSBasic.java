package com.dsa.learning.searching.binarysearch.tuf;

import java.util.List;
import java.util.Map;

public class BSBasic {
    // smallest index such that arr[index]>=x
    private static void findLowerBound(int[] arr, int x) {
        int l = 0;
        int e = arr.length - 1;
        int ans = arr.length + 1;
        while (l <= e) {
            int mid = (l + e) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                e = mid - 1;

            } else
                l = mid + 1;
        }
        System.out.println(ans);
    }

    // smallest index such that arr[index]>x
    private static int findUpperBound(int[] arr, int x) {
        int l = 0;
        int e = arr.length - 1;
        int ans = arr.length;
        while (l <= e) {
            int mid = (l + e) / 2;
            if (arr[mid] > x) {
                ans = mid;
                e = mid - 1;

            } else
                l = mid + 1;
        }
        return ans;
    }

    private static void findFloorValue(int[] arr, int x) {
        int l = 0;
        int e = arr.length - 1;
        int ans = arr.length + 1;
        while (l <= e) {
            int mid = (l + e) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                l = mid + 1;

            } else
                e = mid - 1;
        }
        System.out.println(ans);
    }

    private static int lowerBound(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        int ans = arr.length;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        return ans;
    }

    private static void findFirstAndLastOccurrenceOfX(int[] arr, int x) {
        //1 2 3 4 4 4 5 6 7   x=4
        int count = 0;
        int s = -1;
        int e = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
                if (s == -1)
                    s = i;
                e = i;
            }
        }
        if (count == 0 || count == 1)
            System.out.println(s + "," + e);
        if (count > 1)
            System.out.println(s + "," + e);
    }

    private static void findFirstAndLastOccurrenceOfXBetter(int[] arr, int x) {
        int i = lowerBound(arr, x);
        if (arr.length == i || arr[i] != x) {
            System.out.println("-1, -1");
            return;
        }
        int upperBound = findUpperBound(arr, x);
        if (arr[upperBound - 1] == x) {
            System.out.println(i + "," + (upperBound - 1));
        }
    }

    private static int searchInRotatedBinarySearch(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] >= target)
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (nums[mid] <= target && nums[right] >= target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }

    private static boolean searchInRotatedBinarySearchIfNumbersAreDuplicate(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left = left + 1;
                right = right + 1;
                continue;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] >= target)
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (nums[mid] <= target && nums[right] >= target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return false;
        //TC- average TC will be O(log n) but worst will be O(n/2)
        //SC- O(1)
    }

    private static int findTheMinimumInRotatedSortedArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[left] <= nums[mid]) {
                min = Math.min(min, nums[left]);
                left = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                right = mid - 1;
            }
        }
        return min;
    }

    private static int findTheMinimumInRotatedDuplicateSortedArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left = left + 1;
                right = right - 1;
                continue;
            }

            if (nums[left] <= nums[mid]) {
                min = Math.min(min, nums[left]);
                left = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                right = mid - 1;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 5, 5, 6, 7};
        int[] arr1 = {3, 5, 5, 5, 6, 9};
        int[] arr2 = {6, 7, 8, 1, 2, 3, 4};
        int[] arr3 = {3, 1, 2, 3, 3, 3, 3};
        //findLowerBound(arr, 3);
        //findUpperBound(arr,4);
        //findFloorValue(arr,6);
        //findFirstAndLastOccurrenceOfX(arr1, 9);
        //lowerBound(arr, 3);
        //findFirstAndLastOccurrenceOfXBetter(arr1, 5);
        //findFirstAndLastOccurrenceOfXBetter(arr1, 7);
        //System.out.println(searchInRotatedBinarySearch(arr2, 10));
        // System.out.println(searchInRotatedBinarySearchIfNumbersAreDuplicate(arr2, 1));
        //System.out.println(findTheMinimumInRotatedDuplicateSortedArray(arr3));
    }
}
