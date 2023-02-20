package com.sample.functional.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo {


    public static void main(String[] args) {

        Predicate<Integer> predicate = t -> t%5 == 0;
        List<Integer> list2 = Arrays.asList(11,12,13,14,15);
        list2.stream().filter(predicate).forEach(t-> System.out.println("Divisible by 5 " + t));


        Supplier<String> supplier = ()-> "Hi Nisha!";
        List<String> list3 = Arrays.asList("a", "b");
        List<String> list4 = Arrays.asList();
        System.out.println(list3.stream().findAny().orElseGet(supplier));
        System.out.println(list4.stream().findAny().orElseGet(supplier));


    }
}
