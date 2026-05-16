package com.pattern;

//A 
//B B 
//C C C 
//D D D D 
//E E E E E 

public class CharPattern {
public static void main(String[] args) {
	int rows=5;
	char ch = 'A'; // Starting point
	for (int i = 1; i <= rows; i++) {
	    for (int j = 1; j <= i; j++) {
	        System.out.print(ch + " ");
//	        ch++; // Increment character
	    }
	    ch++; // Increment character
	    System.out.println();
	}

}
}
