package com.preprogramming;

//Given an array Of Strings, group the strinbgs that are anagrams of  each other.
// Example:
// Input:
// arr=["eat","tea","tan","ate","nat","bat"]
// Output:
// [["eat,"tea","ate"],["tan","nat"],["bat"]]
// Explaination: The group of anagrams are ["eat,"tea","ate"],["tan","nat"]  and ["bat"]

import java.util.*;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnagramGroups {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); // Store groups of anagrams
        for (String str : strs) {
            String sorted = sortString(str); // Sort the characters of the string
            Reporter.log(sorted, true);
            map.putIfAbsent(sorted, new ArrayList<>()); // Add a new list if the key doesn't exist
           System.out.println(map.keySet());
            map.get(sorted).add(str); // Add the original string to the group
        }
        return new ArrayList<>(map.values()); // Convert the map values to a list
    }

    private static String sortString(String str) {
        char[] charArray = str.toCharArray(); // Convert to char array
        Arrays.sort(charArray); // Sort the characters
//        Reporter.log(charArray.toString(), true);
        return new String(charArray); // Convert back to string
    }

    @Test
    public static void Anagram() {
        String[] arr = {"eat", "tea", "tan", "atee", "nat", "bat"};
        System.out.println("Anagram Groups: " + groupAnagrams(arr));
    }
}

