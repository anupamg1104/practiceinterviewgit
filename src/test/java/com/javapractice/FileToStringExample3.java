package com.javapractice;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileToStringExample3 {

	public static void main(String[] args) {
		String content ="";
		int max=0;
		String maxRepeatedTime="";

		StringBuilder contentBuilder = new StringBuilder();
		try (Scanner scanner = new Scanner(new File("./src/main/resources/readfile.txt"))) {
			while (scanner.hasNextLine()) {
				contentBuilder.append(scanner.nextLine()).append("\n");
			}
		} catch (FileNotFoundException e) {
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

