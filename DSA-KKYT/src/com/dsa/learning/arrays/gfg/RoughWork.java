package com.dsa.learning.arrays.gfg;

import java.util.*;

public class RoughWork {
    private static void printNo(int n, int s) {
        System.out.println(s);
        if (s < n) {
            printNo(n, s + 1);
        }

    }

    private static String findBinary(int b) {
        StringBuilder binary = new StringBuilder();
        int zero = 0;
        if (b == 0)
            return binary.toString();
        while (b > 0) {
            int rem = b % 2;
            binary.append(rem);
            b = b / 2;
            if (rem == 0)
                zero++;
        }
        System.out.println(zero);
        return binary.toString();
    }

    private static boolean findEquilibriumIndex(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length) / 2)
                continue;
            if (i < (arr.length - 1) / 2) {
                leftSum += arr[i];
            } else {
                rightSum += arr[i];
            }
        }
        return leftSum == rightSum ? true : false;
    }


    public static void main(String[] args) {
        //    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //list.stream().filter(a->a%2!=0).forEach(a->System.out.println(a*a));
        //int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        TreeSet<Employee12> t = new TreeSet<>(new MyComp());
        t.add(new Employee12(1,"A"));
        t.add(new Employee12(2,"Z"));
        t.add(new Employee12(3,"C"));

        //  t.add(null);
        //    t.add(null);
        System.out.println(t);
        //System.out.println(findBinary(9));
        // System.out.println(findEquilibriumIndex(arr));
        //printNo(5,1);

//        String message = "LO2V#@E0 I1 CO5D2I0N*&G";
//        String[] str = message.split(" ");
//        TreeMap<Integer, StringBuffer> treeMap = new TreeMap<>();
//        for (int i = 0; i < str.length; i++) {
//            String singleWord = str[i];
//            int sum = 0;
//            StringBuffer strB = new StringBuffer();
//            for (int j = 0; j < singleWord.length(); j++) {
//                if (Character.isAlphabetic(singleWord.charAt(j))) {
//                    strB.append(singleWord.charAt(j));
//                } else if(Character.isDigit(singleWord.charAt(j))) {
//                    int z = singleWord.charAt(j);
//                    sum = sum + Character.getNumericValue(z);
//                }
//            }
//            treeMap.put(sum, strB);
//        }
//        treeMap.entrySet().stream().forEach(a -> System.out.print(a.getValue() + " "));
//        String url = "https://storage.googleapis.com/doms_docs_test/arya_doms_doc_temp/t1001/aryadhan/43881792534100067EoJ";
//
//        // Define the regex pattern
//        String regex = "^https://storage.googleapis.com/doms_docs_test/arya_doms_doc_temp/t[0-9]+/[a-zA-Z]+/[a-zA-Z0-9]+$";
//
//        // Compile the pattern
//        Pattern pattern = Pattern.compile(regex);
//
//        // Match the URL against the pattern
//        Matcher matcher = pattern.matcher(url);
//
//        // Check if there is a match
//        if (matcher.matches()) {
//            System.out.println("URL matches the pattern.");
//        } else {
//            System.out.println("URL does not match the pattern.");
//        }
    }
}

class MyComp implements Comparator<Employee12> {

    @Override
    public int compare(Employee12 a, Employee12 b) {
        return a.getName().compareTo(b.getName());
    }
}
 class Employee12{
    private int id;
    private String name;

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Employee12(int id, String name) {
         this.id = id;
         this.name = name;
     }

     @Override
     public String toString() {
         return "Employee12{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 '}';
     }
 }
