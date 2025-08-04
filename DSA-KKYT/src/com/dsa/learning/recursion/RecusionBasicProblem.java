import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import static com.dsa.learning.searching.BinarySearch.binarySearch;

public class RecusionBasicProblem {

    private static void printName5Times(int count) {
        if (count == 0)
            return;
        System.out.println("Pratyush");
        printName5Times(count - 1);
    }

    private static void printLinearly(int count, int N) {
        if (count > N)
            return;
        System.out.println(count);
        printLinearly(count + 1, N);
    }

    private static void printNto1(int count, int N) {
        if (count > N)
            return;
        System.out.println(N);
        printNto1(count, N - 1);
    }

    private static void print1ToNUsingBackTracking(int count, int N) {
        if (count < 1)
            return;
        print1ToNUsingBackTracking(count - 1, N);
        System.out.println(count);
    }

    private static void printNTo1UsingBackTracking(int count, int N) {
        if (count > N)
            return;
        printNTo1UsingBackTracking(count + 1, N);
        System.out.println(count);
    }

    private static int sumOfFirstNNumbers(int i, int sum) {
        if (i < 1)
            return sum;
        return sumOfFirstNNumbers(i - 1, sum + i);
    }

    private static int sumOfFirstNNumbersUsingFunction(int i) {
        if (i == 0)
            return 0;
        return i + sumOfFirstNNumbersUsingFunction(i - 1);
    }

    private static int findFactorial(int i) {
        if (i == 0)
            return 1;
        return i * findFactorial(i - 1);
    }

    private static void backTrackOnetoN(int n, int count) {
        if (count < 1)
            return;
        backTrackOnetoN(n, count - 1);
        System.out.println(count);
    }

    private static void backTrackNtoOne(int n, int count) {
        if (count > n)
            return;
        backTrackNtoOne(n, count + 1);
        System.out.println(count);
    }

    private static void sumOfFirstNNumber(int n, int sum, int count) {
        if (count > n) {
            System.out.println(sum);
            return;
        }
        sum = sum + count;
        sumOfFirstNNumber(n, sum, (count + 1));
    }

    private static int fibonacci(int n) {
        if (n <= 1)
            return n;
        int f0 = fibonacci(n - 1);
        int f1 = fibonacci(n - 2);
        return f0 + f1;

    }

    private static void subsequence(int index, ArrayList<Integer> emptyList, int[] data) {
        if (index >= data.length) {
            System.out.println(emptyList);
            return;
        }
        emptyList.add(data[index]);
        subsequence(index + 1, emptyList, data);
        emptyList.removeLast();
        subsequence(index + 1, emptyList, data);
    }

    private static int binarySearchR(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid])
            return mid;
        if (target > arr[mid]) {
            return binarySearchR(arr, mid + 1, end, target);
        }
        return binarySearchR(arr, start, mid - 1, target);

    }

    private static void print1ToNN(int n) {
        if (n == 0)
            return;
        print1ToNN(n - 1);
        System.out.println(n);
    }
}

private static int facto(int n) {
    if (n == 0)
        return 1;
    return n * facto(n - 1);

}

private static int digitSum(int n) {
    if (n == 0)
        return n;
    return n % 10 + digitSum(n / 10);
}

private static void test(int n) {
    if (n == 0)
        return;
    System.out.println(n);
    test(--n);
}

private static int countZero(int n, int count) {
    if (n == 0)
        return count;
    int rem = n % 10;
    if (rem == 0)
        count = count + 1;
    n = n / 10;
    return countZero(n, count);
}

private static boolean checkIfArrayIsSorted(int[] arr, int index) {
    if (index == arr.length - 1)
        return true;
    if (arr[index] <= arr[index + 1])
        return checkIfArrayIsSorted(arr, index + 1);
    else
        return false;
}

public static int rotatedSortedArray(int[] arr, int s, int e, int x) {
    if (s > e)
        return -1;
    int m = s + (e - s) / 2;
    if (arr[m] == x)
        return m;
    if (arr[s] <= arr[m]) {
        if (x >= arr[s] && x <= arr[m])
            return rotatedSortedArray(arr, s, m - 1, x);
        else
            return rotatedSortedArray(arr, m + 1, e, x);
    }
    if (x >= arr[m] && x <= arr[e])
        return rotatedSortedArray(arr, m + 1, e, x);
    else
        return rotatedSortedArray(arr, s, m - 1, x);

}

// Start pattern problem
/*

 * * * *
 * * *
 * *
 *

 */
public static void startPattern(int i, int n) {
    if (i <= n) {
        printStarHelper(i);
        System.out.println();
        i = i + 1;
        startPattern(i, n);
    } else
        return;
}

public static void printStarHelper(int j) {
    if (j <= 4) {
        System.out.print("* ");
        j = j + 1;
        printStarHelper(j);
    } else {
        return;
    }

}

public static void removeGivenCharacterFromString(String ans, String str) {
    if (str.isEmpty()) {
        System.out.println(ans);
        return;
    }
    char chr = str.charAt(0);
    if (chr == 'a') {
        removeGivenCharacterFromString(ans, str.substring(1));
    } else {
        removeGivenCharacterFromString(ans + str.charAt(0), str.substring(1));
    }
}

public static void removeGivenStringFromString(String ans, String str) {
    if (str.isEmpty()) {
        System.out.println(ans);
        return;
    }
    //String chr = str.charAt(0);
    if (str.startsWith("apple")) {
        removeGivenCharacterFromString(ans, str.substring(5));
    } else {
        removeGivenCharacterFromString(ans + str.charAt(0), str.substring(1));
    }
}

public static void subSeq(String p, String up) {
    if (up.isEmpty()) {
        System.out.println(p);
        return;
    }
    char c = up.charAt(0);
    subSeq(p + c, up.substring(1));
    subSeq(p, up.substring(1));
}

public static void sumOfFirstNNumber(int i, int sum) {
    if (i < 1) {
        System.out.println(sum);
        return;
    }
    sumOfFirstNNumber(i - 1, sum + i);
}

public static void reverseAnArray(int[] arr, int s, int e) {
    if (e <= s) {
        System.out.println(Arrays.toString(arr));
        return;
    }
    int initialValue = arr[s];
    arr[s] = arr[e];
    arr[e] = initialValue;
    s = s + 1;
    e = e - 1;
    reverseAnArray(arr, s, e);
}

public static void checkPalindrome(String str, int s, int e) {
    if (str.charAt(s) != str.charAt(e)) {
        System.out.println("Provided string is not palindrome");
        return;
    }
    if (s >= e) {
        System.out.println("Provided string is  palindrome");
        return;
    }
    checkPalindrome(str, s + 1, e - 1);
}

//0 1 1 2 3 5 8 13 21
public static int fibonacci(int n) {
    if (n <= 1)
        return n;
    int l = fibonacci(n - 1);
    int r = fibonacci(n - 2);
    return l + r;
}

public static void subSeq(int i, ArrayList<Integer> arr) {
    int[] arr1 = {1,2,3,4,5};
    if (i > arr1.length - 1) {
        if(!arr.isEmpty() && arr.stream().reduce(Integer::sum).get()==5)
         System.out.println(arr);
        return;
    }
    arr.add(arr1[i]);
    subSeq(i + 1, arr);
    arr.remove(arr.size() - 1);
    subSeq(i + 1, arr);
}


public static void main(String[] args) {
    subSeq(0, new ArrayList<>());
    // System.out.println(fibonacci(4));
    // String str="M";
    //checkPalindrome(str,0,str.length()-1);
    //int[] arr={1,2,3,4};
    // reverseAnArray(arr,0,arr.length-1);
    //sumOfFirstNNumber(3,0);
    //printName5Times(5);
    // printLinearly(1,4);
    // printNto1(1,5);
    // print1ToNUsingBackTracking(3,3);
    //printNTo1UsingBackTracking(1,3);
    //System.out.println(sumOfFirstNNumbers(3,0));
    //System.out.println(sumOfFirstNNumbersUsingFunction(3));
    //System.out.println(findFactorial(5));
    // backTrackOnetoN(5,5);
    //backTrackNtoOne(5,1);
    //System.out.println(RecusionBasicProblem.fibonacci(50));
    // int[] arr={3,1,2};
    //RecusionBasicProblem.subsequence(0,new ArrayList<>(),arr);
    //int[] arr={1,2,3,4,5};

    // System.out.println(RecusionBasicProblem.binarySearchR(arr,0,arr.length-1,1));
    // RecusionBasicProblem.print1ToNN(90);
    //System.out.println(facto(5));
    //System.out.println(digitSum(3405));
    //test(5);
    //System.out.println(countZero(133400,0));
    // int[] arr = {5,4};
    //System.out.println(checkIfArrayIsSorted(arr, 0));

    //int[] arr = {4, 5, 6, 1, 2, 3};
    //System.out.println(rotatedSortedArray(arr,0,arr.length-1,2));
    //startPattern(1,4);
    //String s="apple";
    // removeGivenCharacterFromString("",s);
    // System.out.println(s.startsWith("violent"));
    //subSeq("", "abc");
}