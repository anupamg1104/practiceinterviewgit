package com.MapExample;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> charCountMap = getCharOccurrences(str);
        System.out.println(charCountMap);
    }

    public static Map<Character, Integer> getCharOccurrences(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert string to character array and iterate over it
        for (char ch : str.toCharArray()) {
            // Check if the character is already in the map
            if (charCountMap.containsKey(ch)) {
                // If yes, increment its count
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // If no, add the character with count 1
                charCountMap.put(ch, 1);
            }
        }

        return charCountMap;
    }
}
