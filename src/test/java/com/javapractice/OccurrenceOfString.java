package com.javapractice;

import java.util.HashSet;
import java.util.Scanner;

public class OccurrenceOfString {
	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		String qw=sc.nextLine();
		String qw = "My India My Pride my";
		String[] str=qw.split(" ");
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		System.out.println(set.toString());
		
		for(String word:set) {
			int count=0;
		for(int j=0;j<str.length;j++) {
		if(word.equals(str[j])) {
		count++;}
		}
		System.out.println(word+" count is "+count);
		}

	}
}
