package com.arraysexample;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int []a=new int[3];
		a[0]=10;
		a[1]=12;
		a[2]=9;

		int b[]=new int[3];
		for(int i=0,j=b.length-1;i<a.length;i++,j--) {
			b[j]=a[i];
		}
		System.out.println(Arrays.toString(b));

	}
}