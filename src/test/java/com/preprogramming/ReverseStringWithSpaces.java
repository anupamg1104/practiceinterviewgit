package com.preprogramming;


public class ReverseStringWithSpaces { 
	    public static void main(String[] args) {
	        // Original input
	        String original = "Hello Worlds";
	        
	        // Split the string by space
	        String[] words = original.split(" ");
	        StringBuilder reversedResult = new StringBuilder();

	        for (String word : words) {
	            // Reverse each word
	            StringBuilder sb = new StringBuilder(word);
	            reversedResult.append(sb.reverse().toString()).append(" ");
	        }

	        // Remove the trailing space and print
	        System.out.println("Original String: " + original);
	        System.out.println("Reversed String: " + reversedResult.toString().trim());
	    }
	}

