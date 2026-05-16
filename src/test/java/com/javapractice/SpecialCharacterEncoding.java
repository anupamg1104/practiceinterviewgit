package com.javapractice;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class SpecialCharacterEncoding {
    public static void main(String[] args) {
        // List of common special characters
        char[] specialChars = {
            '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/',' ',
            ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~'
        };

        System.out.println("Special Character Encoding:");
        System.out.println("--------------------------------------");

        // Loop through each character and encode it
        for (char c : specialChars) {
            try {
                String encodedValue = URLEncoder.encode(String.valueOf(c), StandardCharsets.UTF_8.toString());
                System.out.println("Character: '" + c + "'  |  Encoded Value: " + encodedValue);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

//Why + Instead of %20 for ' '?
//URLEncoder.encode() uses the application/x-www-form-urlencoded format for encoding, 
//where a space is replaced by +.
//If you explicitly want %20, you need to replace + manually.

