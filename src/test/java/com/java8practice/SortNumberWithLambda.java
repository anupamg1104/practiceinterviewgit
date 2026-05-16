package com.java8practice;

import java.util.*;

public class SortNumberWithLambda {
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(3.5);
        numberList.add(7.2f);
        numberList.add(1L);

        // Sort using lambda
        numberList.sort((n1, n2) -> Double.compare(n1.doubleValue(), n2.doubleValue()));

        System.out.println("Sorted Numbers:");
        numberList.forEach(System.out::println);
    }
}

