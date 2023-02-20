package com.sample.functional.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {


    public static void main(String[] args) {

        Consumer<Integer> printValue = p -> System.out.println("Printing " + p);

        printValue.accept(34);
        // write your code here

        // Consumer with forEach

        List<Integer> list1 = Arrays.asList(10,20,30,40);
        list1.stream().forEach( t -> System.out.println("Looping array " + t));
    }
}
