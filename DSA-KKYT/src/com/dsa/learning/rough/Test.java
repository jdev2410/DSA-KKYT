package com.dsa.learning.rough;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Test {
    private void get(){

    }
    public static void main(String[] args) {
//        List<Employee> list = new ArrayList<Employee>();
//        list.add(new Employee(200,"A","D1"));
//        list.add(new Employee(2300,"B","D2"));
//        list.add(new Employee(2500,"C","D3"));
//        list.add(new Employee(2000,"D","D4"));
//        List<Employee> collect = list.stream().sorted(Comparator.comparingInt(Employee::getId).reversed()).skip(3).collect(Collectors.toList());
//        System.out.println(collect);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer collect = list.stream().collect(Collectors.summingInt(i -> i));
       // System.out.println(collect);
    }
}
