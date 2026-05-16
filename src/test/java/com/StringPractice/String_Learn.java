package com.StringPractice;

public class String_Learn {
	public static void main(String[] args) {
		String s1="automation";
		boolean b=s1.matches("(.*)m(.*)");
		boolean b1=s1.contains("m");
		System.out.println(b+" "+b1);
		
//		 matches Method
//		 Definition: matches(String regex) checks if the entire string matches a given regular expression.
//
//		 Key Points:
//
//		 It requires the whole string to match the regex pattern.
//		 Uses regular expressions for pattern matching.
//		 Returns true if the string matches the pattern, otherwise false.
//		 Suitable for complex pattern matching.
		 
		 
		String s = "automation";

		// Match the whole string
		System.out.println(s.matches("automation")); // true

		// Check if string contains 'm' using regex
		System.out.println(s.matches("(.*)m(.*)")); // true

		// Check if string is only alphabets
		System.out.println(s.matches("[a-zA-Z]+")); // true
		
		
//		contains Method
//		Definition: contains(CharSequence sequence) checks if the string contains the specified sequence of characters.
//
//		Key Points:
//
//		Does not use regular expressions.
//		It simply looks for the presence of a substring within the string.
//		Returns true if the substring is found, otherwise false.
//		Suitable for simple substring checks.
		
		
		String s2 = "automation";

		// Check if string contains "auto"
		System.out.println(s2.contains("auto")); // true

		// Check if string contains "m"
		System.out.println(s2.contains("m")); // true

		// Check if string contains "test"
		System.out.println(s2.contains("test")); // false
		
		
//	Feature	                 matches	                                       contains
//	Purpose 	Matches the entire string against a regex.	   Checks for the presence of a substring.
//	Usage	    Requires a regular expression.	               Uses a simple sequence of characters.
//	Scope	    Whole string must conform to the pattern.	   Checks only for the existence of the sequence.
//	Complexity	Supports complex patterns with regex.	       Suitable for simple substring searches.
//	Output	    Returns true/false based on regex match.	   Returns true/false for substring presence.
//	Example	    "12345".matches("\\d{5}") -> true.	           "automation".contains("auto") -> true.



	}
}
