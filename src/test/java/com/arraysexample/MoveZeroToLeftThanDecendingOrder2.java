package com.arraysexample;

import java.util.Arrays;

public class MoveZeroToLeftThanDecendingOrder2 {
	public static void main(String[] args) {
        int a[] = {8, 0, 4, 3, 1, 0, 2, 9, 0, 7, 0, 6};

        // Step 1: Sort in descending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Step 2: Count zeroes
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }

        // Step 3: Shift non-zero elements to the right position
        int index = a.length - 1; // Start placing from the end
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                a[index--] = a[i]; // Place non-zero element at the rightmost position
            }
        }

        // Step 4: Fill zeroes at the beginning
        while (index >= 0) {
            a[index--] = 0;
        }

        // Print the final array
        System.out.println(Arrays.toString(a));
    }
}
