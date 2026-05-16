 package com.arraysexample;

import java.util.Arrays;

public class ArrayMethodsExample {

    public static void main(String[] args) {
        // 1. Declare and Initialize an Array
        int[] numbers = {5, 3, 8, 1, 9};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 2. Accessing Elements
        System.out.println("Element at index 2: " + numbers[2]);          // Element at index 2: 8

        // 3. Traversing the Array
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();       // Array elements: 5 3 8 1 9

        // 4. Sorting the Array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));  // Sorted Array: [1, 3, 5, 8, 9]

        // 5. Copying the Array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));   //  Copied Array: [1, 3, 5, 8, 9]
        
        int[] copiedArray1 = Arrays.copyOf(numbers, numbers.length+3);
        System.out.println("Copied Array 1: " + Arrays.toString(copiedArray1));   //  Copied Array: [1, 3, 5, 8, 9]

        // 6. Searching in a Sorted Array
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of 8 after sorting: " + index);         // Index of 8 after sorting: 3

        // 7. Filling the Array
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Array after fill(): " + Arrays.toString(filledArray));    // Array after fill(): [7, 7, 7, 7, 7]

        // 8. Comparing Arrays
        boolean areEqual = Arrays.equals(numbers, copiedArray);
        System.out.println("Are numbers and copiedArray equal? " + areEqual);          //  Are numbers and copiedArray equal? true

        // 9. Copying Partial Array
        int[] partialCopy = Arrays.copyOfRange(numbers, 1, 4); // Copy elements from index 1 to 3 (exclusive of 4)
        System.out.println("Partial Copy of Array (index 1 to 3): " + Arrays.toString(partialCopy));   //  Partial Copy of Array (index 1 to 3): [3, 5, 8]

        // 10. Reverse the Array (Manual Method)
        reverseArray(numbers); // Call to helper method
        System.out.println("Reversed Array: " + Arrays.toString(numbers));           //  Reversed Array: [9, 8, 5, 3, 1]

        // 11. Finding Maximum and Minimum Value
        int max = findMax(numbers); // Call to helper method
        int min = findMin(numbers); // Call to helper method
        System.out.println("Maximum value: " + max);     // Maximum value: 9
        System.out.println("Minimum value: " + min);     // Minimum value: 1

        // 12. Calculating Sum of Array Elements
        int sum = calculateSum(numbers); // Call to helper method
        System.out.println("Sum of Array elements: " + sum);   // Sum of Array elements: 26

        // 13. Checking if Array Contains a Value
        boolean containsValue = contains(numbers, 8); // Call to helper method
        System.out.println("Does the array contain 8? " + containsValue);    // Does the array contain 8? true
    }

    // Helper Method: Reverse the Array
    private static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // Helper Method: Find Maximum Value in an Array
    private static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Helper Method: Find Minimum Value in an Array
    private static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Helper Method: Calculate Sum of Array Elements
    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Helper Method: Check if Array Contains a Specific Value
    private static boolean contains(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}


//         Explanation of Additional Methods
//         Comparing Arrays
//         Arrays.equals(numbers, copiedArray) compares if two arrays are identical in terms of 
//         content.
//         
//         Partial Array Copy
//         Arrays.copyOfRange(numbers, 1, 4) copies a specific range of elements (from index 1 to 3).
//         
//         Reverse Array
//         reverseArray(numbers) is a manual implementation to reverse an array by swapping elements
//         from the start and end.
//         
//         Finding Maximum and Minimum
//         findMax() and findMin() iterate through the array to find the largest and smallest elements.
//         
//         Calculating Sum
//         calculateSum() adds all elements in the array to return the total sum.
//         
//         Checking if Array Contains a Value
//         contains(numbers, 8) iterates through the array to check if a specific value exists.

