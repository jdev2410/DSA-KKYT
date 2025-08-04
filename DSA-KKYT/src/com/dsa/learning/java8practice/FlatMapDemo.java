package com.dsa.learning.java8practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<Integer> list1=Arrays.asList(1,2,5,8);
        List<Integer> list2=Arrays.asList(6,14,50,80,80,50);
        List<Integer> list3=Arrays.asList(13,25,50,15);
        List<List<Integer>> list = Arrays.asList(list1, list2, list3);
        Map<Integer, Long> collect1 = list.stream().flatMap(a -> a.stream()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //List<Integer> collect = collect1.entrySet().stream().filter(a -> a.getValue() > 1).map(a -> a.getKey()).collect(Collectors.toList());
        Set<Integer> collect = list2.stream().filter(a -> Collections.frequency(list2, a) > 1).collect(Collectors.toSet());
        //  System.out.println(collect);
        String ab=null;
                 String s = Optional.ofNullable(ab).orElse(callMe());
        // orElse- 1- orElse function doesn't accept supplier, we can directly pass else value="srivas"
        // Not optimized because , if ab is null or not, supplier will get invoked. Means srivas is already taken space in memory.
        // Suppose one DB call invoked and returned User. If this user is not null then also orElse will get invoked.
        // Suppose a case like Optional.ofNullable(User!=null).orElse(getUserFromOtherDB(int userId));
        // First getUserFromOtherDB will get called even if user is not null, hence unnecessary one DB call got invoked.
        // Decreases the performance
       System.out.println(s);
              // String s1 = Optional.ofNullable(ab).orElseGet(() -> callMe());
        // orElseGet- 1- orElseGet function do accept supplier, we can pass else value="srivas" using lambda.
        // More optimized because , if ab is null then supplier will get invoked. Here srivas will take space in memory only if ab is null.
        // Suppose one DB call invoked and returned User. If this user is not null then also orElseGet will NEVER get invoked.
        // Suppose a case like Optional.ofNullable(User!=null).orElseGet(getUserFromOtherDB(int userId));
        // getUserFromOtherDB will NEVER get called even if user is not null, hence DB call will NEVER get invoked.
        // Increases the performance
       // System.out.println(s1);

              //String s1 = Optional.ofNullable(ab).orElseThrow(()->new RuntimeException()); // It simply throws Exception if ofNullable contains
        // null.
        //System.out.println(s1);
              //Optional<List<String>> ofNullable= Optional.ofNullable(Arrays.asList());
        // Use ofNullable(contained Object) method where contained object can be null or not null. Safe to use.
        // In above example I have passed Arrays.asList() which is empty. If it is empty that doesn't mean isPresent() will return false.
        //isPresent() will return true even it is empty because, isPresent() will only check null or not null values but not empty list.
             //Optional<List<String>> of= Optional.of(Arrays.asList());
        // Use of(contained Object) method where you are sure that contained object is not null. If contained object is null then
        // it will throw Null pointer exp.
//        if(ofNullable.isPresent())
//            System.out.println("Value is present");
//        else
//            System.out.println("Value is not present");
       // Optional<String> str= Optional.ofNullable("abcd");
        //str.ifPresent(a->a.);
       // Integer i = Arrays.asList(1, 6, 10, 25, 3, 4, 36).stream().sorted((a, b) -> a - b).skip(1).findFirst().get();
       // System.out.println(i);
//        List<Integer> list4 = new ArrayList<>();
//        list4.add(1);
//        list4.add(5);
//        list4.add(3);
//        list4.add(2);
//        List<Integer> list5 = new ArrayList<>();
//        list5.add(10);
//        list5.add(5);
//        list5.add(3);
//        list5.add(20);
//        list4.addAll(list5);
        //System.out.println(list4);
        //Set<Integer> set= new HashSet<>();
       // List<Integer> collect2 = list4.stream().filter(a->!set.add(a)).collect(Collectors.toList());
        //System.out.println(collect2);
       // String[] str={"apple","banana","tea","coffee","Pratyush"};
       // int i = Arrays.asList(str).stream().mapToInt(String::length).max().orElse(0);
       // System.out.println(i);

    }

    // reverse an int array using IntStream with java 8
    public static void reverseIntArray(int[] arr){
        IntStream.range(0,arr.length/2).forEach(a->{
            int n = arr[a];
            arr[a]= arr[arr.length-a-1];
            arr[arr.length-a-1]=n;
        });
        System.out.println(Arrays.toString(arr));
    }
    public static String callMe(){
        System.out.println("Call me function called");
        return "Pratyush Srivastava";
    }
    static void method(Integer i)
    {
        System.out.println(1);
    }

    static void method(Double d)
    {
        System.out.println(2);
    }

    static void method(Number n)
    {
        System.out.println(4);
    }

    static void method(Object o)
    {
        System.out.println(5);
    }
}
