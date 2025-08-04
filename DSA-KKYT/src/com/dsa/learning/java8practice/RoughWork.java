package com.dsa.learning.java8practice;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RoughWork {


    public static void main(String[] args) {
        Predicate<String> str1 = s -> s.length() > 5;
        //System.out.println(str1.test("ashusr"));
        Predicate<String> str2 = s -> s.length() % 2 == 0;
        //System.out.println(str1.and(str2).test("ashusr"));

        Function<Integer,Integer> fun1= f->f*f;
        Function<Integer,Integer> fun2= f->f+f;
        //System.out.println(fun1.andThen(fun2).apply(5));
        // First fun1 will get calculated and then fun2. fun1=5*5=25 and then fun2 25+25 and ans=50
        //System.out.println(fun1.compose(fun2).apply(5));
        // First fun2 will get calculated and then fun2. fun2=5+5=10 and then fun1 10*10 and ans=100

        Supplier<Date> date = Date::new; // It does take any input or consume anything, just supplies the required object.
        //System.out.println(date.get());

        Integer sumOfFirstFiveNumbers = Arrays.asList(1, 2, 3, 4, 5).stream().reduce((a, b) -> a + b).get();
        //System.out.println(sumOfFirstFiveNumbers);
        Optional<String> name = Optional.ofNullable(null);

        if (name.isPresent()) {
            System.out.println(name.get().toUpperCase());
        } else {
            System.out.println("No name found");
        }

        List<String> names = Arrays.asList("alice", "bob", "charlie");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println(names);

/* ************ IMPORTANT **************
//QUESTION- How many elements will actually go through the map() operation? Explain the execution flow.
List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6);

int result = nums.stream()
    .filter(n -> {
        System.out.println("Filter: " + n);
        return n % 2 == 0;
    })
    .map(n -> {
        System.out.println("Map: " + n);
        return n * 2;
    })
    .findFirst()
    .orElse(-1);

System.out.println("Result: " + result);

 */

        /*
        ANSWER- Explanation:
Due to short-circuiting behavior of findFirst(), once it finds the first even number (2), it stops the pipeline.

So:

Filter: 2 → passes

Map: 2 → executed

findFirst() returns 4 (2 * 2) and exits

Only 2 passes through map(). Neither 4 nor 6 are evaluated.
         */
    }
}
