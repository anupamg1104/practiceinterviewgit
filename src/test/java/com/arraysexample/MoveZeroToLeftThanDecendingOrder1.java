package com.arraysexample;

import java.util.Arrays;

public class MoveZeroToLeftThanDecendingOrder1 {
	public static void main(String[] args) {
		int [] arr={23,0,21,0,11,0,42,0,89};
		int index=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		for(int ar:arr){
			if(ar==0){
				index++;
			}
		}

		for(int i=index;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
