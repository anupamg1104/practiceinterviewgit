package com.pattern;

//    A
//   B B
//  C C C
// D D D D
//E E E E E


public class AlphabetPyramid {
    public static void main(String[] args) {
        int rows = 5 ;
        char ch = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}

