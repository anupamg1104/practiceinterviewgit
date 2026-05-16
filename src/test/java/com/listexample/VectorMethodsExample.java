package com.listexample;

import java.util.Collections;
import java.util.Vector;

public class VectorMethodsExample {

    public static void main(String[] args) {
        // 1. Creating a Vector
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10); // Vectors allow duplicates
        System.out.println("Original Vector: " + numbers);

        // 2. Accessing Elements
        System.out.println("Element at index 2: " + numbers.get(2));

        // 3. Iterating through the Vector
        System.out.print("Vector elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 4. Checking the Size and Capacity
        System.out.println("Size of Vector: " + numbers.size());
        System.out.println("Capacity of Vector: " + numbers.capacity());

        // 5. Removing an Element by Index
        numbers.remove(1);
        System.out.println("Vector after removing element at index 1: " + numbers);

        // 6. Checking if Vector Contains an Element
        boolean containsElement = numbers.contains(30);
        System.out.println("Does the vector contain 30? " + containsElement);

        // 7. Sorting the Vector
        Collections.sort(numbers);
        System.out.println("Sorted Vector: " + numbers);

        // 8. Replacing an Element
        numbers.set(2, 50); // Replace element at index 2 with 50
        System.out.println("Vector after replacing index 2 with 50: " + numbers);

        // 9. Clearing the Vector
        numbers.clear();
        System.out.println("Vector after clearing: " + numbers);

        // 10. Checking if the Vector is Empty
        System.out.println("Is the vector empty? " + numbers.isEmpty());
    }
}

