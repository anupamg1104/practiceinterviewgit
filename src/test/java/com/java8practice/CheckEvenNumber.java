package com.java8practice;

import java.util.Arrays;
import java.util.List;

//Example 10: Checking if a List Contains Any Even Number
//Scenario: Check if the list contains any even number.

public class CheckEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 23, 35, 40, 51);

        // Check if any number is even
        boolean hasEven = numbers.stream()
                                 .anyMatch(n -> n % 2 == 0);

        System.out.println("Contains even number? " + hasEven);
    }
}

//Explanation
//anyMatch(n -> n % 2 == 0) → Returns true if any element is even.