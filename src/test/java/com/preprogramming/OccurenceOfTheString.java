package com.preprogramming;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class OccurenceOfTheString {
	public static void main(String[] args) {
		String s = "My India My Pride";

		String[] str = s.split(" ");
		//Step 1 : Create a set collection and add all the String array values into Set
		Set<String> set = new LinkedHashSet<>();
		for(int i=0 ; i<str.length ; i++)
		{
			set.add(str[i]);
		}
		// compare each String value of Set With All the Value Of String Array
		for(String word:set)
		{
			int count = 0;
			for(int i=0 ; i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			//Step 3 : Print both word and count
			System.out.println(word +" - " +count);
		}
	}
}
