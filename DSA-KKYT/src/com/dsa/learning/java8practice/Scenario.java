package com.dsa.learning.java8practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Scenario {
    public static void main(String[] args) {
        Employee emp1 = Employee.builder().name("Emp1").salary(800).build();
        Employee emp2 = Employee.builder().name("Emp1").salary(200).build();
        Employee emp3 = Employee.builder().name("Emp1").salary(600).build();
        Employee emp4 = Employee.builder().name("Emp1").salary(100).build();
        List<Employee> list = Arrays.asList(emp1, emp2, emp3, emp4);
        //List<Employee> collect = list.stream().sorted((a, b) -> b.getSalary() - a.getSalary()).skip(3).collect(Collectors.toList());
       // System.out.println(collect);
       // Employee employee = list.stream().sorted((a, b) -> b.getSalary() - a.getSalary()).findFirst().get();
        String collect = list.stream().map(a -> a.getName()).collect(Collectors.joining(",  "));
        System.out.println(collect);
    }
}
@Builder
@Getter
@Setter
@ToString
class Employee{
private String name;
private Integer salary;
}