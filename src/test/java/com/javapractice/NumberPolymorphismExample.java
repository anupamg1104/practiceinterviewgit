package com.javapractice;

import java.util.ArrayList;

public class NumberPolymorphismExample {
	public static void main(String[] args) {
		// Create an ArrayList of Number
		ArrayList<Number> numberList = new ArrayList<>();

		// Add different types of numbers (subclasses of Number)
		numberList.add(10);             // Integer
		numberList.add(25.75);          // Double
		numberList.add(7.2f);           // Float
		numberList.add(5000L);          // Long
		numberList.add((short) 4);      // Short
		numberList.add((byte) 2);       // Byte

		// Print values using polymorphism
		System.out.println("Polymorphic behavior of Number and its subclasses:\n");
		for (Number num : numberList) {
			System.out.println("Class: " + num.getClass().getSimpleName());
			System.out.println("Original Value: " + num);
			System.out.println("As int: " + num.intValue());
			System.out.println("As double: " + num.doubleValue());
			System.out.println("As long: " + num.longValue());
			System.out.println("As float: " + num.floatValue());
			System.out.println("-----------------------------------");
		}
	}
}

