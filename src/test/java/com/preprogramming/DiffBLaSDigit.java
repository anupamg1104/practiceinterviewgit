package com.preprogramming;

import java.util.Scanner;


class DiffBLaSDigit{

	static int bigestdigit(int x){
		int r;
		int bi=0;
		while(x!=0){
			r=x%10;
			x=x/10;
			if(r>=bi)
				bi=r;
		}
		return bi;
	}

	static int smallestdigit(int x){
		int r;
		int sm=9;
		while(x!=0){
			r=x%10;
			x=x/10;
			if(r<=sm)
				sm=r;
		}
		return sm;
	}

	public static void main(String [] args)
	{Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();

	int big=bigestdigit(n);
	int small=smallestdigit(n);
	System.out.println(big);
	System.out.println(small);

	System.out.println(big-small);
	}
}

