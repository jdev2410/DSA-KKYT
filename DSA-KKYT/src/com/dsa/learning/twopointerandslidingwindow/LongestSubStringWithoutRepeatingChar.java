package com.dsa.learning.twopointerandslidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {

    private static int longestSubStringWithoutRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int l = 0;
        int r = 0;
        int max = 0;
        while (r < str.length()) {
            char c = str.charAt(r);
            if (!map.containsKey(c)) {
                map.put(c, r);
            } else {
                int oldIndex = map.get(str.charAt(r));
                if (oldIndex < l) {
                } else {
                    l = oldIndex + 1;
                }
                map.put(str.charAt(r), r);
            }
            int length = r - l + 1;
            max = Math.max(max, length);
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "cadbzabcd";
        System.out.println(longestSubStringWithoutRepeatingChar(str));
    }
}
