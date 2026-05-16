package com.listexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethodsExample {

	public static void main(String[] args) {
		// 1. Creating a List
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Apple"); // Lists allow duplicates
		System.out.println("Original List: " + fruits);

		// 2. Accessing Elements
		System.out.println("Element at index 1: " + fruits.get(1));

		// 3. Iterating through the List
		System.out.print("Fruits: ");
		for (String fruit : fruits) {
			System.out.print(fruit + " ");
		}
		System.out.println();

		// 4. Sorting the List
		Collections.sort(fruits);
		System.out.println("Sorted List: " + fruits);

		// 5. Removing an Element
		fruits.remove("Apple"); // Removes the first occurrence
		System.out.println("List after removing 'Apple': " + fruits);

		// 6. Checking if List Contains an Element
		boolean containsCherry = fruits.contains("Cherry");
		System.out.println("Does the list contain 'Cherry'? " + containsCherry);

		// 7. Clearing the List
		fruits.clear();
		System.out.println("List after clearing: " + fruits);
	}
}
