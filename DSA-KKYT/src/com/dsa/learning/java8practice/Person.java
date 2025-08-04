package com.dsa.learning.java8practice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString
public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Person> list= new ArrayList<>();
        list.add(new Person("Pratyush", 30));
        list.add(new Person("Darshika", 34));
        list.add(new Person("Pooja", 34));
        list.add(new Person("Sona", 30));
        list.add(new Person("sam", 20));
        list.add(new Person("json", 20));
        list.add(new Person("Raju", 52));
        list.add(new Person("Nishu", 50));
        //Group a list of people by age using Collectors.groupingBy.
        //Map<Integer, List<Person>> collect = list.stream().collect(Collectors.groupingBy(a -> a.age));
        //System.out.println(collect);

        //Count the occurrences of each character in a string using streams.
        String str="aabbacvsvss";
        Map<Character, Long> collect = str.chars() //gives an IntStream of Unicode values.
                .mapToObj(c -> (char) c). //turns them into Character objects for grouping.
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); //is a common pattern for counting frequencies.
        //System.out.println(collect);

        List<String> strList = new ArrayList<>();
        strList.add("Pratyush");
        strList.add("Darshikaaa");
        strList.add("Pooja");
        strList.add("Sona");
        strList.add("sam");
        strList.add("Nishu");
        Map.Entry<Integer, String> integerStringEntry = strList.
                stream().
                collect(Collectors.toMap(String::length, str1 -> str1, (o, n) -> n))
                .entrySet().stream().sorted((a, b) -> b.getKey() - a.getKey()).findFirst().get();
        System.out.println(integerStringEntry);
    }
}
