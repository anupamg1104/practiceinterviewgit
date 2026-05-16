package com.pattern;

public class ConditionalStatementsPattern {
public static void main(String[] args) {
	int rows=5;
	for (int i = 1; i <= rows; i++) {
	    for (int j = 1; j <= i; j++) {
	        if (j % 2 == 0) {
	            System.out.print("X ");  // print X on even columns
	        } else {
	            System.out.print("* ");  // print * on odd columns
	        }
	    }
	    System.out.println();
	}

}
}
