package com.javapractice;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.io.IOException;

public class FileToStringExample {

    public static void main(String[] args) {
    	  String content ="";
    	  int max=0;
    	  String maxRepeatedTime="";
        try {
            Path filePath = Paths.get("./src/main/resources/readfile.txt");
             content = Files.readString(filePath);
            System.out.println(content.replaceAll("[{}:\\[\\]\"]", "").replace(",", "").replaceAll("\\s+", " "));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
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

