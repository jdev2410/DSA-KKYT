package com.dsa.learning.searching.binarysearch.tuf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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

    private static int singleElementInSortedArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[0] != nums[i + 1]) {
                    return nums[0];
                }
            } else if (i == nums.length - 1) {
                if (nums[i] != nums[i - 1]) {
                    return nums[i];
                }
            } else {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
                    return nums[i];
            }
        }
        return -1;
    }

    private static int singleElementInSortedArrayBetterApproach(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2])
            return nums[nums.length - 1];

        int left = 1;
        int right = nums.length - 2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            if (mid % 2 == 1 && nums[mid] == nums[mid - 1] || mid % 2 == 0 && nums[mid] == nums[mid + 1])// we are on the left half
            {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static int findThePeakElement(int[] nums) {
        int peak = -1;
        if (nums.length == 1 || nums[0] > nums[1])
            return 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                peak = i;
                break;
            }
        }
        if (peak == -1)
            return nums.length - 1;
        else
            return peak;
    }

    private static int findThePeakElementBetter(int[] nums) {
        if (nums.length == 1)
            return 0;
        if (nums[0] > nums[1])
            return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;
        int l = 1;
        int r = nums.length - 2;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                return mid;
            else if (nums[mid] > nums[mid - 1] || nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1])
                l = mid + 1;
            else if (nums[mid] > nums[mid + 1])
                r = mid - 1;
        }
        return -1;
    }

    private static long findSquareRoot(long x) {
        long l = 0;
        long r = x;
        int ans = 0;
        while (l <= r) {
            long mid = (l + r) / 2;
            if (mid * mid == x)
                return mid;
            if (mid * mid > x) {
                r = mid - 1;
            } else {
                ans = (int) mid;
                l = mid + 1;
            }
        }
        return ans;
    }

    private static int findTheNthRootOfM(int n, int m) {
        for (int i = 1; i < m; i++) {
            if (findMultiple(i, n) == m)
                return i;
            else if (findMultiple(i, n) > m)
                break;
        }
        return -1;
    }

    private static int findMultiple(int num, int times) {
        int ans = 1;
        for (int i = 1; i <= times; i++) {
            ans = ans * num;
        }
        return ans;
    }

    private static int findTheNthRootOfMBetter(int n, int m) {
        int l = 1;
        int r = m;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (findMultiple(mid, n) == m)
                return mid;
            else if (findMultiple(mid, n) > m)
                r = mid - 1;
            else
                l = mid + 1;

        }
        return ans;
    }

    private static int kokoEatingBanana(int k, int[] nums) {

        int count = 1;
        while (true) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum = (Math.ceilDiv(nums[i], count)) + sum;
            }
            if (sum > k)
                count++;
            else
                break;
        }
        return count;
    }

    private static long findSumKoKoEatingBanana(int[] nums, int mid) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = (Math.ceilDiv((long) nums[i], (long) mid)) + sum;
        }
        return sum;
    }

    private static int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }


    private static int kokoEatingBananaBetter(int k, int[] nums) {
        int l = 1;
        int r = findMax(nums);
        while (l <= r) {
            int mid = (l + r) / 2;
            long ans = findSumKoKoEatingBanana(nums, mid);
            if (ans <= k) {
                r = mid - 1;
                ans = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private static int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = findMax(nums);
        long t = Integer.MAX_VALUE;
        while (l <= r) {
            int mid = (l + r) / 2;
            long ans = findSumKoKoEatingBanana(nums, mid);
            if (ans > threshold)
                l = mid + 1;
            else {
                t = Math.min(t, mid);
                r = mid - 1;
            }
        }
        return (int) t;
        //TC: log(n)*N
        //SC: 1
    }

    private static boolean placeTheCow(int[] nums, int distance, int cows) {
        int cowsCount = 1;
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - last >= distance) {
                cowsCount++;
                last = nums[i];
            }
        }
        if (cowsCount >= cows)
            return true;
        else
            return false;
    }

    private static int aggressiveCows(int[] nums, int numberOfCows) {
        Arrays.sort(nums);
        int l = 1;
        int r = (nums.length - 1) - nums[0];
        while (l <= r) {
            int mid = (l + r) / 2;
            if (placeTheCow(nums, mid, numberOfCows))
                l = mid + 1;
            else
                r = mid - 1;

        }
        return r;
    }

    private static int findSumOfArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    private static int findMaxPages(int[] nums, int student) {
        if (student > nums.length)
            return -1;
        int maxSizeBooks = findMax(nums);
        int sumOfArray = findSumOfArray(nums);
        for (int i = maxSizeBooks; i <= sumOfArray; i++) {
            int noOfStudent = allocateBooks(nums, maxSizeBooks);
            if (noOfStudent == student)
                return maxSizeBooks;
            maxSizeBooks++;
        }
        return 0;
    }

    private static int findMaxPagesBetter(int[] nums, int student) {
        if (student > nums.length)
            return -1;
        int maxSizeBooks = findMax(nums);
        int sumOfArray = findSumOfArray(nums);
        while (maxSizeBooks <= sumOfArray) {
            int mid = (maxSizeBooks + sumOfArray) / 2;
            int noOfStudents = allocateBooks(nums, mid);
            if (noOfStudents == student)
                return mid;
            else if (noOfStudents < student) {
                sumOfArray = mid - 1;
            } else {
                maxSizeBooks = mid + 1;
            }

        }
        return 0;
    }


    private static int allocateBooks(int[] nums, int pages) {
        int student = 1;
        int pagesStudent = 0;
        for (int i = 0; i < nums.length; i++) {
            if (pages >= nums[i] + pagesStudent) {
                pagesStudent = nums[i] + pagesStudent;
            } else {
                student++;
                pagesStudent = nums[i];
            }
        }
        return student;
    }

    private static int findTheMedianOfTwoSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                list.add(nums1[i]);
                i++;
            } else {
                list.add(nums2[j]);
                j++;
            }
        }
        while (i < nums1.length) {
            list.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            list.add(nums2[j]);
            j++;
        }
        System.out.println(list);
        if (list.size() % 2 == 1)
            return list.size() / 2;
        else
            return (list.size() / 2 + list.size() / 2 - 1) / 2;

    }

    private static int findTheMedianOfTwoSortedArrayBetter(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int n = (nums1.length + nums2.length);
        int index2 = n / 2;
        int index1 = index2 - 1;
        int count = 0;
        int indexLength1 = -1;
        int indexLength2 = -1;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (count == index1) indexLength1 = nums1[i];
                if (count == index2) indexLength2 = nums1[i];
                i++;
                count++;
            } else {
                if (count == index1) indexLength1 = nums2[j];
                if (count == index2) indexLength2 = nums2[j];
                j++;
                count++;
            }

        }
        while (i < nums1.length) {
            if (count == index1) indexLength1 = nums1[i];
            if (count == index2) indexLength2 = nums1[i];
            i++;
            count++;
        }
        while (j < nums2.length) {
            if (count == index1) indexLength1 = nums2[j];
            if (count == index2) indexLength2 = nums2[j];
            j++;
            count++;
        }
        if (n % 2 == 1)
            return indexLength2;
        else
            return (indexLength2 + indexLength1) / 2;
    }

    private static int rowWithMaximumNoOf1s(int[][] nums) {
        int max1s = Integer.MIN_VALUE;
        int count = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i][j] == 1)
                    count++;
            }
            if (count > max1s) {
                max1s = count;
                index = i;
            }
            count = 0;
        }
        return index;
        //TC= O(NxM)
    }

    private static int rowWithMaximumNoOf1sBetter(int[][] nums) {
        int max1s = Integer.MIN_VALUE;
        int count = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            count = lBound(nums[i]);
            if (count > max1s) {
                max1s = count;
                index = i;
            }
        }
        return index;
        // TC= O(N*Log M)
    }

    private static int lBound(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] >= 1) {
                ans = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        if (ans == -1)
            return ans;
        return nums.length - ans;
    }

    private static boolean searchIn2DMatrix(int[][] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int[] innerArray = nums[i];
            if (innerArray[0] <= target && target <= innerArray[innerArray.length - 1] && search(innerArray, target))
                return true;
        }
        //TC= O(N)+ O(Log M)
        return false;
    }

    private static boolean searchIn2DMatrixBetter(int[][] nums, int target) {
        //for (int i = 0; i < nums.length; i++) {
        // int[] innerArray = nums[i];
        int rowSize = nums.length;
        int colSize = nums[0].length;
        if (nums[0][0] <= target && target <= nums[rowSize - 1][colSize - 1] && search1(target, rowSize * colSize, colSize, nums))
            return true;
        //}
        //TC=O(Log(NXM))
        return false;
    }

    private static boolean search(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target)
                return true;
            if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }


    private static boolean search1(int target, int r, int colSize, int[][] arr) {
        int l = 0;
        int end = r - 1;
        while (l <= end) {
            int mid = (l + end) / 2;
            int row = mid / colSize;
            int col = mid % colSize;

            if (arr[row][col] == target)
                return true;
            if (arr[row][col] > target) {
                end = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    private static boolean searchElementIn2DArray(int[][] nums, int target) {
        int row = nums.length;
        int col = nums[0].length - 1;
        int l = 0;
        while (l < row && 0 <= col) {
            if (nums[l][col] == target)
                return true;
            else if (target > nums[l][col])
                l++;
            else
                col--;

        }
        return false;
        //TC- O(N+M)
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 5, 5, 6, 7};
        int[] arr1 = {5, 7, 7, 8, 8, 10};
        int[] arr2 = {6, 7, 8, 1, 2, 3, 4};
        int[] arr3 = {3, 1, 2, 3, 3, 3, 3};
        int[] arr4 = {1, 1, 2, 2, 4, 3, 3};

        //findLowerBound(arr, 3);
        //findUpperBound(arr,4);
        //findFloorValue(arr,6);
        //findFirstAndLastOccurrenceOfX(arr1, 9);
        //System.out.println(lowerBound(arr, 1));
        //findFirstAndLastOccurrenceOfXBetter(arr1, 5);
        //findFirstAndLastOccurrenceOfXBetter(arr1, 8);
        //System.out.println(searchInRotatedBinarySearch(arr2, 10));
        // System.out.println(searchInRotatedBinarySearchIfNumbersAreDuplicate(arr2, 1));
        //System.out.println(findTheMinimumInRotatedDuplicateSortedArray(arr3));
        //System.out.println(singleElementInSortedArray(arr4));
        //System.out.println(singleElementInSortedArrayBetterApproach(arr4));
        int[] arr5 = {1, 2, 1, 2, 1};
        //System.out.println(findThePeakElement(arr5));
        //System.out.println(findThePeakElementBetter(arr5));
        //System.out.println(findSquareRoot(2147395599));
        //System.out.println(findTheNthRootOfM(4, 69));
        // System.out.println(findTheNthRootOfMBetter(3, 124));
        int[] arr6 = {21212, 10101, 12121};
        //System.out.println(kokoEatingBanana(5, arr6));
        //System.out.println(kokoEatingBananaBetter(1000000000, arr6));
        // System.out.println(smallestDivisor(arr6, 1000000));
        //3,2,2,4,1,4 days=3
        int[] arr7 = {0, 3, 4, 9, 7, 10};
        int[] arr8 = {25, 46, 28, 49, 24};
        //System.out.println(aggressiveCows(arr7, 4));
        //System.out.println(findMaxPages(arr8, 4));
        //System.out.println(findMaxPagesBetter(arr8, 4));
        int[] arr9 = {0, 1};
        int[] arr10 = {2, 3, 4, 5};
        //System.out.println(findTheMedianOfTwoSortedArrays(arr9, arr10));
        //System.out.println(findTheMedianOfTwoSortedArrayBetter(arr9, arr10));
        int[][] arr11 = {{0, 0, 1, 1, 1}, {0, 0, 0, 0, 0}, {0, 1, 1, 1, 1}, {0, 0, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int[][] arr12 = {{3, 4, 7, 9}, {12, 13, 16, 18}, {20, 21, 23, 29}};
        //System.out.println(rowWithMaximumNoOf1s(arr11));
        //System.out.println(rowWithMaximumNoOf1sBetter(arr11));
        //System.out.println(searchIn2DMatrix(arr12, 30));
        //System.out.println(searchIn2DMatrixBetter(arr12, 30));
        //System.out.println(searchElementIn2DArray(arr12,90));
    }
}
