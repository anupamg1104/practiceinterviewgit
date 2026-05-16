package com.preprogramming;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateWordsProcessor {

    // Method 1: Count duplicates (case-insensitive) and return Map
    public Map<String, Long> getDuplicateWords(String sentence) {
        String[] words = sentence.toLowerCase().split("\\s+");

        return Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }

    // Method 2: Print duplicate words
    public void printDuplicates(String sentence) {
        Map<String, Long> duplicates = getDuplicateWords(sentence);
        duplicates.forEach((word, count) -> System.out.println(word + " - " + count));
    }

    // ------------------ TestNG Test Cases ------------------

    @Test
    public void testDuplicateDetection() {
        String input = "My Life My Rules My";
        Map<String, Long> expected = new LinkedHashMap<>();
        expected.put("my", 3L);

        DuplicateWordsProcessor processor = new DuplicateWordsProcessor();
        Map<String, Long> actual = processor.getDuplicateWords(input);

        assert actual.equals(expected) : "Expected " + expected + ", but got " + actual;
    }

    @Test
    public void testMultipleDuplicates() {
        String input = "This is a test this is only a test";
        DuplicateWordsProcessor processor = new DuplicateWordsProcessor();

        Map<String, Long> result = processor.getDuplicateWords(input);

        assert result.get("this") == 2;
        assert result.get("is") == 2;
        assert result.get("a") == 2;
        assert result.get("test") == 2;
    }

    @Test
    public void testNoDuplicates() {
        String input = "Each word is unique here";
        DuplicateWordsProcessor processor = new DuplicateWordsProcessor();

        Map<String, Long> result = processor.getDuplicateWords(input);

        assert result.isEmpty() : "Expected empty map, but got " + result;
    }

    @Test
    public void testWithPunctuation() {
        String input = "Hello, hello. HELLO!";
        DuplicateWordsProcessor processor = new DuplicateWordsProcessor();

        // Clean punctuation
        input = input.replaceAll("[^a-zA-Z ]", "");

        Map<String, Long> result = processor.getDuplicateWords(input);

        assert result.get("hello") == 3;
    }

    @Test
    public void testPrintDuplicates() {
        String input = "Java Java Python Python Java";
        DuplicateWordsProcessor processor = new DuplicateWordsProcessor();

        processor.printDuplicates(input); // Visual verification
    }
}
