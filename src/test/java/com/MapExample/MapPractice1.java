package com.MapExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPractice1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] arr=s.toLowerCase().split(" ");
	
	Map<String,Integer> map = new LinkedHashMap<>();
	for(String word:arr) {
		if(map.containsKey(word)) {
			map.put(word,map.get(word)+1);
		}else
		{
			map.put(word, 1);
		}	
	}
	for(Map.Entry<String, Integer> entry:map.entrySet()) {
		System.out.println(entry.getKey()+" = "+entry.getValue());
	}
}
}
