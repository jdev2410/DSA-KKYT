package com.dsa.learning.java8practice;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class FirstNonRepeatedCharacter {
    public static Character findFirstNonRepeatedCharacter(String input) {
        Map<Character,Long> map= input.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

        return map.entrySet().stream().filter(a->a.getValue()==1).findFirst().get().getKey();
    }

    private static void findFirstNonRepeatedCharacterWithoutJava8(String input){
        Map<Character, Integer> map= new LinkedHashMap<>();
        for(int i=0; i<input.length(); i++){
            Character c=input.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.compute(c,(K,V)->V+1);
            }
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }

        }

    }

    private void sum(int i,int j){

    }
    private int sum(int i){
      return 0;
    }

    public static void main(String[] args) {
         //System.out.println(findFirstNonRepeatedCharacter("aashhu"));
        //findFirstNonRepeatedCharacterWithoutJava8("aashhu");
    }
}
