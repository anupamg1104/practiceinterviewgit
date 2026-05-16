package com.arraysexample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArraySearch {
	public static void main(String[] args) {
		int[] arr = {1,3,3,4,5,6,6,7,8,9,9};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to search: ");
		int search = sc.nextInt();
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("Found at index: " + i);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Element not found");
		}
		
		
		// duplicate
		int[] arr1 = {1, 2, 3, 2, 4, 5, 1};
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		for (int num : arr1) {
		    if (!seen.add(num)) {
		        duplicates.add(num);
		    }
		}
		System.out.println("Duplicates: " + duplicates);

	}
	
	
	
}
