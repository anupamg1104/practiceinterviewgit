package com.StringPractice;

public class RegexExamples {
	public static void main(String[] args) {
		//    Example 1: Check if string contains a specific character
		String s1 = "automation";
		boolean b1 = s1.matches("(.*)m(.*)");
		System.out.println("Does 'automation' contain 'm'? " + b1); //    true

		//    Example 2: Check if string starts with a specific word
		String s2 = "automation testing";
		boolean b2 = s2.matches("^automation(.*)");
		System.out.println("Does 'automation testing' start with 'automation'? " + b2); //    true

		//    Example 3: Check if string ends with a specific word
		String s3 = "test automation";
		boolean b3 = s3.matches("(.*)automation$");
		System.out.println("Does 'test automation' end with 'automation'? " + b3); //    true

		//    Example 4: Check if string contains only digits
		String s4 = "12345";
		boolean b4 = s4.matches("\\d+");
		System.out.println("Does '12345' contain only digits? " + b4); //    true

		//    Example 5: Check if string is a valid email address
		String email = "test@example.com";
		boolean b5 = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
		System.out.println("Is 'test@example.com' a valid email address? " + b5); //    true

		//    Example 6: Check if string contains only alphabets
		String s6 = "automation";
		boolean b6 = s6.matches("[a-zA-Z]+");
		System.out.println("Does 'automation' contain only alphabets? " + b6); //    true

		//    Example 7: Check if string contains a specific word
		String s7 = "Welcome to automation testing!";
		boolean b7 = s7.matches("(.*)automation(.*)");
		System.out.println("Does 'Welcome to automation testing!' contain 'automation'? " + b7); //    true

		//    Example 8: Check if string contains exactly 5 digits
		String s8 = "12345";
		boolean b8 = s8.matches("\\d{5}");
		System.out.println("Does '12345' contain exactly 5 digits? " + b8); //    true

		//    Example 9: Check if string contains uppercase and lowercase letters
		String s9 = "AutoMation";
		boolean b9 = s9.matches(".*[A-Z].*") && s9.matches(".*[a-z].*");
		System.out.println("Does 'AutoMation' contain both uppercase and lowercase letters? " + b9); //    true

		//    Example 10: Validate a phone number (e.g., 10-digit numbers)
		String phone = "9876543210";
		boolean b10 = phone.matches("\\d{10}");
		System.out.println("Is '9876543210' a valid 10-digit phone number? " + b10); //    true
	}
}

//   Explanation of Additional Examples:
//   Starts with a Word:
//   Regex: ^automation(.*) ensures the string starts with automation.

//   Ends with a Word:
//   Regex: (.*)automation$ ensures the string ends with automation.

//   Only Digits:
//   Regex: \\d+ checks if the string contains only one or more digits.

//   Email Validation:
//   Regex: ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$ validates email format.

//   Only Alphabets:
//   Regex: [a-zA-Z]+ checks if the string contains only alphabetic characters.

//   Contains Exactly 5 Digits:
//   Regex: \\d{5} checks for exactly 5 digits.

//   Both Uppercase and Lowercase Letters:
//   Use .*[A-Z].* for uppercase and .*[a-z].* for lowercase.

//   Phone Number Validation:
//   Regex: \\d{10} checks if the string is exactly 10 digits long.