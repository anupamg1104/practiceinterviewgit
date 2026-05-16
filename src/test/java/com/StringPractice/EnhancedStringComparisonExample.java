package com.StringPractice;

public class EnhancedStringComparisonExample {
    public static void main(String[] args) {
        System.out.println("--- Using String ---");
        // String is immutable
        String string = "Hello";
        
        // Append: Strings require reassignment as they're immutable
        string = string.concat(" World");
        System.out.println("String after Append: " + string);

        // Replace: Creates a new String object
        string = string.replace("World", "Java");
        System.out.println("String after Replace: " + string);

        // Substring: Extract a part of the string
        String substring = string.substring(6, 10);
        System.out.println("Substring: " + substring);

        // Upper case conversion
        System.out.println("String in Upper Case: " + string.toUpperCase());

        // Character at a specific index
        System.out.println("Character at index 1: " + string.charAt(1));

        // Check if string starts with a prefix
        System.out.println("Starts with 'Hello': " + string.startsWith("Hello"));

        // Split the string
        String[] splitArray = string.split(" ");
        System.out.println("Split String: ");
        for (String part : splitArray) {
            System.out.println(part);
        }

        // Trim whitespace
        String stringWithSpaces = "   Trim me   ";
        System.out.println("String after Trim: '" + stringWithSpaces.trim() + "'");

        
        
        
        
        
        System.out.println("\n--- Using StringBuffer ---");
        // StringBuffer is mutable
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Append: Modifies the existing object
        stringBuffer.append(" World");
        System.out.println("StringBuffer after Append: " + stringBuffer);

        // Insert: Add text at a specific position
        stringBuffer.insert(6, "Java ");
        System.out.println("StringBuffer after Insert: " + stringBuffer);

        // Delete: Remove characters from index 6 to 10
        stringBuffer.delete(6, 11);
        System.out.println("StringBuffer after Delete: " + stringBuffer);

        // Replace: Replace part of the string
        stringBuffer.replace(6, 11, "Beautiful");
        System.out.println("StringBuffer after Replace: " + stringBuffer);

        // Reverse the string
        stringBuffer.reverse();
        System.out.println("StringBuffer after Reverse: " + stringBuffer);

        // Set a character at a specific index
        stringBuffer.reverse(); // Revert to original order for demonstration
        stringBuffer.setCharAt(0, 'h');
        System.out.println("StringBuffer after SetCharAt: " + stringBuffer);

        // Capacity: Get the capacity of the buffer
        System.out.println("StringBuffer Capacity: " + stringBuffer.capacity());

        // Ensure capacity: Expand capacity if needed
        stringBuffer.ensureCapacity(50);
        System.out.println("StringBuffer after EnsureCapacity: " + stringBuffer.capacity());

        
        
        
        
        System.out.println("\n--- Using StringBuilder ---");
        // StringBuilder is also mutable but not thread-safe
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // Append: Modifies the existing object
        stringBuilder.append(" World");
        System.out.println("StringBuilder after Append: " + stringBuilder);

        // Insert: Add text at a specific position
        stringBuilder.insert(6, "Java ");
        System.out.println("StringBuilder after Insert: " + stringBuilder);

        // Delete: Remove characters from index 6 to 10
        stringBuilder.delete(6, 11);
        System.out.println("StringBuilder after Delete: " + stringBuilder);

        // Replace: Replace part of the string
        stringBuilder.replace(6, 11, "Beautiful");
        System.out.println("StringBuilder after Replace: " + stringBuilder);

        // Reverse the string
        stringBuilder.reverse();
        System.out.println("StringBuilder after Reverse: " + stringBuilder);

        // Set a character at a specific index
        stringBuilder.reverse(); // Revert to original order for demonstration
        stringBuilder.setCharAt(0, 'h');
        System.out.println("StringBuilder after SetCharAt: " + stringBuilder);

        // Capacity: Get the capacity of the builder
        System.out.println("StringBuilder Capacity: " + stringBuilder.capacity());

        // Ensure capacity: Expand capacity if needed
        stringBuilder.ensureCapacity(50);
        System.out.println("StringBuilder after EnsureCapacity: " + stringBuilder.capacity());

        System.out.println("\n--- Key Differences ---");
        System.out.println("1. String is immutable: Any operation creates a new object.");
        System.out.println("2. StringBuffer is mutable and thread-safe (synchronized).");
        System.out.println("3. StringBuilder is mutable but not thread-safe, making it faster than StringBuffer.");
    }
}




//Explanation of Methods Used
//
//String Methods:
//concat(): Combines two strings; a new object is created.
//replace(): Replaces characters in the string.
//substring(): Extracts a part of the string.
//toUpperCase(): Converts all characters to uppercase.
//charAt(): Retrieves a character at a specific index.
//startsWith(): Checks if the string starts with a specific prefix.
//split(): Splits the string into an array based on a delimiter.
//trim(): Removes leading and trailing whitespace.
//
//
//StringBuffer and StringBuilder Methods:
//append(): Adds text to the end of the object.
//insert(): Inserts text at a specific index.
//delete(): Removes a substring from the object.
//replace(): Replaces characters in the object.
//reverse(): Reverses the content.
//setCharAt(): Sets a character at a specific position.
//capacity(): Returns the current capacity of the buffer.
//ensureCapacity(): Ensures a minimum capacity for the buffer.
//
//
//Key Differences (Output Summary):
//String:
//Immutable: Creates new objects for every operation.
//Suitable for fixed or minimal modifications.
//StringBuffer:
//Mutable: Modifies the same object.
//Thread-safe: Synchronized methods ensure safe multi-threaded access.
//Slightly slower than StringBuilder due to synchronization.
//StringBuilder:
//Mutable: Modifies the same object.
//Not thread-safe: No synchronization, but faster for single-threaded environments.
//
