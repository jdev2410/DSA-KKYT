package com.dsa.learning.rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class My {
    public static void main(String[] args) {
        Employee employee= new Employee(1,"Pratyush","Devloper");
        Department department= new Department(1,"Dev", Arrays.asList(employee));
        Company company1= new Company(1,"Google",Arrays.asList(department));
        Company company2= new Company(1,"Microsoft",Arrays.asList(department));
        Company company3= new Company(1,"DigiMantra",Arrays.asList(department));
        List<Company> listOfCompany = Arrays.asList(company1, company2, company3);

        List<Employee> collect = listOfCompany.stream()
                .flatMap(company -> company.getDepartmentList().stream())
                .flatMap(department1 -> department1.getEmployeeList().stream())
                .filter(employee1 -> "Devloper".equals(employee1.getDesignation()))
                .collect(Collectors.toList());
        System.out.println(collect);

//        List<List<List<Employee>>> devloper = listOfCompany.stream().map(mapper -> {
//            return mapper.getDepartmentList().stream().map(mapper1 -> {
//                return mapper1.getEmployeeList().stream().filter(mapper2 -> mapper2.getDesignation().equals("Devloper")).collect(Collectors.toList());
//            }).collect(Collectors.toList());
//        }).collect(Collectors.toList());

    }
}