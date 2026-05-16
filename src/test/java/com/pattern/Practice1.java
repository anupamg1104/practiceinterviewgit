package com.pattern;


//* * * * * 
// * * * * 
//  * * * 
//   * * 
//    * 
public class Practice1 {
public static void main(String[] args) {
int rows=5;
	for (int i = rows; i >= 1; i--) {
	    for (int j = i; j < rows; j++) {  // printing spaces
	        System.out.print(" ");
	    }
	    for (int k = 1; k <= i; k++) {    // printing stars
	        System.out.print("* ");
	    }
	    System.out.println();
	}

}
}
