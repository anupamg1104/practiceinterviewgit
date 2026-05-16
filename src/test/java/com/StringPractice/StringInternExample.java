package com.StringPractice;

public class StringInternExample {
    public static void main(String[] args) {
        
        // Creating two string literals - these are automatically interned by JVM
        String str1 = "OpenAI";
        String str2 = "OpenAI";

        // Both str1 and str2 will point to the same object in the string pool
        System.out.println("str1 == str2: " + (str1 == str2)); // true

        // Creating a new String object using the 'new' keyword (not interned)
        String str3 = new String("OpenAI");

        // str1 and str3 have the same value, but are different objects
        System.out.println("str1 == str3: " + (str1 == str3)); // false
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true

        // Now using intern() on str3 will return the reference from the string pool
        String str4 = str3.intern();

        // str1 and str4 now refer to the same object from the pool
        System.out.println("str1 == str4: " + (str1 == str4)); // true
    }
}


// Explanation in comments:
//1. str1 and str2 are string literals, so Java places them in the string pool, making 
//them refer to the same memory location.
//2. str3 is created with new, which always creates a new object in heap memory, 
//even if the value is already in the pool.
//3. Calling intern() on str3 checks if the value is already in the pool:
//     (a) .  If yes, it returns the existing reference from the pool (like str1).
//     (b) .  If not, it adds the value to the pool and returns the new pooled reference.
//4. str4 is now the same reference as str1.