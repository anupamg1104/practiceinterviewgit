package com.java8practice;

import java.util.*;
import java.util.stream.Collectors;

//Example 9: Counting Word Frequencies
//Scenario: Count occurrences of each word in a list.

public class WordFrequency {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        // Count word frequency
        Map<String, Long> wordCount = words.stream()
                                           .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println("Word frequencies: " + wordCount);
    }
}

//Explanation
//groupingBy(word -> word, counting()) → Groups words and counts occurrences.