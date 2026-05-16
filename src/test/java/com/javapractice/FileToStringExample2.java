package com.javapractice;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileToStringExample2 {

	public static void main(String[] args) {
		String content ="";
		int max=0;
		String maxRepeatedTime="";
		StringBuilder contentBuilder = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader("./src/main/resources/readfile.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				contentBuilder.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		content = contentBuilder.toString();
		System.out.println(content.replaceAll("[{}:\\[\\]\"]", "").replace(",", "").replaceAll("\\s+", " "));


		String qw=content.replaceAll("[{}:\\[\\]\"]", "").replace(",", "").replaceAll("\\s+", " ");
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
			if(count>max) {
				max=count;
				maxRepeatedTime=word;

			}
		}
		System.out.println();
		System.out.println(maxRepeatedTime+" max count is "+max);

	}
}

