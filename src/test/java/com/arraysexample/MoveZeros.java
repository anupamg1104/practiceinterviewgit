 package com.arraysexample;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {2, 8, 0, 7, 0, 6, 0};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosToEnd(int[] arr) {
        int index = 0; // Index for placing non-zero elements

        // Traverse the array and place non-zero elements at the beginning
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill the remaining array with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
