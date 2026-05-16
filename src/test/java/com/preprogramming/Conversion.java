package com.preprogramming;

import java.util.Scanner;


public class Conversion{

	static String cD2Binary(int dec){
		String bin="";
		do{
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
		}while(dec!=0);
		return bin;
	}
	static String cD2Octal(int dec){
		String oct="";
		do{
			int r=dec%8;
			oct=r+oct;
			dec=dec/8;
		}while(dec!=0);
		return oct;
	}
	static String cD2Hexa(int dec){
		String hexa="";
		do{
			int r=dec%16;
			if(r<10)
				hexa=r+hexa;
			else
				hexa=(char)(r+55)+hexa;
			dec=dec/16;
		}while(dec!=0);
		return hexa;
	}

	public static void main(String [] args)
	{      System.out.println("Enter decimal number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String Binary=cD2Binary(n);
	String Octal=cD2Octal(n);
	String Hexa=cD2Hexa(n);
	System.out.println("binary code for "+n+" is "+Binary);
	System.out.println("octal code for "+n+" is "+Octal);
	System.out.println("hexa code for "+n+" is "+Hexa);
	}
}
