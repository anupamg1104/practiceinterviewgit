package com.java8practice;

import java.util.*;
import java.util.stream.Collectors;

//Example 8: Removing Duplicates from a List
//Scenario: Remove duplicate names from a list.


public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Alice", "John", "David");

        // Remove duplicates
        List<String> uniqueNames = names.stream()
                                        .distinct()
                                        .collect(Collectors.toList());

        System.out.println("Unique names: " + uniqueNames);
    }
}

//Explanation
//distinct() → Removes duplicates.