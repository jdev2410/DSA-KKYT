package com.dsa.learning.stringchapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

public class AnagramSolver {
    public static List<List<String>> groupAnagrams(String[] arrayOfStrings) {
        Map<String,List<String>> map= new HashMap<>();
      for(String words : arrayOfStrings){
          char[] charArray = words.toCharArray();// converting word to char array because we to use in Arrays.sort()
          Arrays.sort(charArray);// Using arrays.sort to sort the words if "BAC"-> "ABC"
          String sortedKey= new String(charArray);
          if(!map.containsKey(charArray)){// Here we are inserting sorted unique keys in map and an empty list.
              map.put(sortedKey,new ArrayList<>());
          }
          map.get(sortedKey).add(words);// Here we are adding original word that we used for sorting for example
          // Arrays.sort(tea)-> will be aet. so in the map it will be like
          // KEY  |  VALUES |       Iteration
          // aet  |   [eat] |         1
          // aet  |   [eat,tea] |     2
          // ant  |   [tan] |         3
          // aet  |   [eat,tea,ate] | 4
          // ant  |   [tan,nat] |     5
          // abt  |   [bat] |         6
      }
      return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }
}
