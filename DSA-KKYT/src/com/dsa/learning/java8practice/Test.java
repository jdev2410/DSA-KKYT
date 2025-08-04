package com.dsa.learning.java8practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

enum Day {MON,TUES,WED,THRU,FRI,SAT,SUN};

public class Test {
    private static ArrayList<List<String>> anagram() {
        List<String> input = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "live");
        Map<String, List<String>> map = new HashMap<>();
        for (String word : input) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            map.computeIfAbsent(s, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static int[] rotateRight(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return nums;

        k = k % n; // Normalize k

        int finalK = k;
        return IntStream.range(0, n)
                .map(i -> nums[(n - finalK + i) % n])
                .toArray();
        // 1,2,3 0th Rotation
        // 3,1,2 1th Rotation
        //2,3,1 2th Rotation
        //1,2,3 3th Rotation
        //3,1,2 4th Rotation
        // Here 4th rotation== 1 rotation, Means if k=20, you do not need to rotate the array by 20 times.
        // Just noramlize 20%3= 2, means you need to rotate the array 2 times.
        // System.out.println(1%3); Ans-> 1
        // System.out.println(2%3); Ans-> 2
        // System.out.println(3%3); Ans-> 0
        // System.out.println(4%3); Ans-> 1
        // System.out.println(5%3); Ans-> 2
        // System.out.println(6%3); Ans-> 0
        // System.out.println(7%3); Ans-> 1
    }

    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 5, 6, 7};
        //System.out.println(Arrays.toString(rotateRight(i,2)));
        //Lambda expressions provide implementations for functional interfaces.
        // Here we write the logic/operation
        FunInterface funInterface = (a, b) -> a + b;
        // Here we pass the value in the arguments to start the operation.
        int add = funInterface.add(1, 2);// We p
        //System.out.println(add);
        // System.out.println(anagram());

//        List<String> input = Arrays.
//                asList("listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "live");
//        Collection<List<String>> values = input
//                .stream()
//                .collect(Collectors.
//                        groupingBy(a -> a.chars()
//                                        .sorted()
//                                        .mapToObj(s -> String.valueOf((char) s))
//                                        .collect(Collectors.joining()),
//                                LinkedHashMap::new,
//                                Collectors.toList()
//                        )).values();
//        System.out.println(values);
//############################################################################################################
//        String s="Pratyushjkl";
//        Map<String, Long> collect = s.chars().
//                mapToObj(c -> String.valueOf((char) c))
//                .filter(a -> a.startsWith("a") ||
//                        a.startsWith("e") ||
//                        a.startsWith("i") ||
//                        a.startsWith("o") ||
//                        a.startsWith("u"))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        Long vowelSum = collect.entrySet().stream().map(Map.Entry::getValue).reduce(Long::sum).get();
//        System.out.println("Vowel Count : "+vowelSum);
//        int i = s.length() - vowelSum.intValue();
//        System.out.println("Consonent Count : "+i);

        /*
        Returns a sequential ordered IntStream from startInclusive (inclusive) to endExclusive (exclusive) by an incremental step of 1.
Params:
startInclusive – the (inclusive) initial value endExclusive – the exclusive upper bound
Returns:
a sequential IntStream for the range of int elements
API Note:
An equivalent sequence of increasing values can be produced sequentially using a for loop as follows:
         */
//        String str="MADAM";
//        boolean b = IntStream.range(0, str.length() / 2).allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
//        System.out.println(b);

//        List<Employee> list= new ArrayList<>();
//        list.add(new Employee(10,"A"));
//        list.add(new Employee(20,"B"));
//        list.add(new Employee(30,"C"));
//        list.add(new Employee(40,"D"));
//        List<Employee> l= list.stream().sorted((a,b)->b.getSalary().intValue()-a.getSalary().intValue()).toList();
//        System.out.println(l);
//        List<String> list1= new ArrayList<>();
//        List<String> list2= new ArrayList<>();
//        list1.add("A");
//        list1.add("B");
//        list1.add("C");
//        list2.add("C");
//        list2.add("D");
//        list2.add("A");
//        List<String> list = Stream.concat(list1.stream(), list2.stream()).distinct().toList();
//        System.out.println(list);

//        String str="swiss";
//        LinkedHashMap<Character, Long> collect = str.
//                chars().
//                mapToObj(c -> (char) c).
//                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//        Character key = collect.entrySet().stream().filter(a -> a.getValue().intValue() == 1).findFirst().get().getKey();
//        System.out.println(key);

//        List<String> list= Arrays.asList("A","B","A","C","D","C","A","C","C");
//        String key = list.stream().
//                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
//                entrySet().
//                stream().
//                sorted((a, b) -> b.getValue().intValue() - a.getValue().intValue()).findFirst().get().getKey();
//         System.out.println(key );

//        int[] ar1={1,2,3,4};
//        int[] ar2={4,3,6,7,4};
//        Set<Integer> set1 = Arrays.stream(ar1).boxed().collect(Collectors.toSet());
//        int[] array = Arrays.stream(ar2).filter(set1::contains).distinct().toArray();
//        System.out.println(Arrays.toString(array));

//        int[] arr = {1, 2, 4, 5, 6};
//        Object[] array = Arrays.stream(arr).boxed().map(a -> {
//            int l = arr[arr.length - 1];
//            return (l * (l + 1)) / 2;
//        }).toArray();
//        int sum = Arrays.stream(arr).sum();
//        System.out.println((int)array[0]-sum);

//        List<Employee> list= new ArrayList<>();
//        list.add(new Employee(100,"D1"));
//        list.add(new Employee(10,"D2"));
//        list.add(new Employee(300,"D1"));
//        list.add(new Employee(20,"D4"));
//        list.add(new Employee(150,"D2"));


//        List<String> list= new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("A");
//        list.add("B");

        List<String> list1= new ArrayList<>();
        list1.add("C");
        list1.add("E");
        list1.add("D");
        list1.add("A");
        list1.add("C");

    }

    @Setter
    @Getter
    @AllArgsConstructor
    @ToString
    static class Employee {
        private Integer salary;
        private String department;


    }
}
