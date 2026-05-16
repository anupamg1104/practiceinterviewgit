package com.arraysexample;

import java.util.Arrays;

//i/p 8,0,4,3,1,0,2,9,0,7,0,6
//o/p 0,0,0,0,9,8,7,6,4,3,2,1
public class MoveZeroToLeftThanDecendingOrder {


	public static void main(String[] args) 
	{
		int[] arr = {8, 0, 4, 3, 1, 0, 2, 9, 0, 7, 0, 6};
		int n = arr.length;

		// Move all non-zero elements to one side
		int count = 0;  
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		int k=n-count;
		// Fill the rest with zeroes
		while (count < n) {
			arr[count++] = 0;
		}

		// Sort the non-zero elements in descending order
		Arrays.sort(arr, n - count, n);
//		System.out.println(n+"  "+count);
//		System.out.println(Arrays.toString(arr));
		reverseArray(arr, k, n - 1);

		System.out.println(Arrays.toString(arr));
	}

	private static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
