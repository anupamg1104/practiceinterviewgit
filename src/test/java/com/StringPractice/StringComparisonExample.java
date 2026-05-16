package com.StringPractice;

public class StringComparisonExample {
    public static void main(String[] args) {
        // Using String
        String string = "Hello";

        // Append operation
        string = string.concat(" World"); // Strings are immutable
        System.out.println("String after Append: " + string);   //  String after Append: Hello World

        // Replace operation
        string = string.replace("World", "Java");
        System.out.println("String after Replace: " + string);  //  String after Replace: Hello Java


        // Substring operation
        String substring = string.substring(6);
        System.out.println("Substring: " + substring); // Substring: Java


        // Convert to uppercase
        String upperCase = string.toUpperCase();
        System.out.println("String in Upper Case: " + upperCase);  //  String in Upper Case: HELLO JAVA
     

        // Length of the string
        System.out.println("Length of String: " + string.length());   //  Length of String: 10


        
        
        
        System.out.println("\n--- Using StringBuffer ---");

        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Append operation
        stringBuffer.append(" World");
        System.out.println("StringBuffer after Append: " + stringBuffer);    //StringBuffer after Append: Hello World

        // Insert operation
        stringBuffer.insert(6, "Java ");
        System.out.println("StringBuffer after Insert: " + stringBuffer);    // StringBuffer after Insert: Hello Java World

        // Replace operation
        stringBuffer.replace(6, 10, "Beautiful");
        System.out.println("StringBuffer after Replace: " + stringBuffer); //StringBuffer after Replace: Hello Beautiful World

        // Delete operation
        stringBuffer.delete(6, 15);
        System.out.println("StringBuffer after Delete: " + stringBuffer);    //StringBuffer after Delete: Hello  World

        // Reverse operation
        stringBuffer.reverse();
        System.out.println("StringBuffer after Reverse: " + stringBuffer);   //StringBuffer after Reverse: dlroW  olleH

        // Length of the StringBuffer
        System.out.println("Length of StringBuffer: " + stringBuffer.length());  //Length of StringBuffer: 12

        
        
        
        
        System.out.println("\n--- Using StringBuilder ---");

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // Append operation
        stringBuilder.append(" World");
        System.out.println("StringBuilder after Append: " + stringBuilder);

        // Insert operation
        stringBuilder.insert(6, "Java ");
        System.out.println("StringBuilder after Insert: " + stringBuilder);

        // Replace operation
        stringBuilder.replace(6, 10, "Beautiful");
        System.out.println("StringBuilder after Replace: " + stringBuilder);

        // Delete operation
        stringBuilder.delete(6, 15);
        System.out.println("StringBuilder after Delete: " + stringBuilder);

        // Reverse operation
        stringBuilder.reverse();
        System.out.println("StringBuilder after Reverse: " + stringBuilder);

        // Length of the StringBuilder
        System.out.println("Length of StringBuilder: " + stringBuilder.length());
    }
}



//String:
//Immutability: Every operation creates a new String object.
//Less Efficient for Modifications: Repeated modifications result in multiple object 
//creations, consuming more memory and time.
//Common methods used:
//concat()
//replace()
//substring()
//toUpperCase()
//length()
//
//
//StringBuffer:
//Mutability: Modifies the existing object, so it’s more memory-efficient for modifications.
//Thread-Safe: Synchronized methods make it suitable for multi-threaded environments but 
//slightly slower compared to StringBuilder.
//Common methods used:
//append()
//insert()
//replace()
//delete()
//reverse()
//length()
//
//
//StringBuilder:
//Mutability: Like StringBuffer, modifies the existing object.
//Not Thread-Safe: Faster than StringBuffer for single-threaded environments due to the 
//absence of synchronization.
//Common methods used:
//append()
//insert()
//replace()
//delete()
//reverse()
//length()




//Conclusion:
//Use String when immutability is essential or when only a few modifications are needed.
//Use StringBuffer for multi-threaded environments where thread safety is required.
//Use StringBuilder for single-threaded environments where performance is critical.
