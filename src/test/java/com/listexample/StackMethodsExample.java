package com.listexample;

import java.util.Stack;

public class StackMethodsExample {

    public static void main(String[] args) {
        // 1. Creating a Stack
        Stack<String> books = new Stack<>();
        books.push("Java Programming");
        books.push("Data Structures");
        books.push("Algorithms");
        books.push("Operating Systems");
        System.out.println("Original Stack: " + books);

        // 2. Accessing the Top Element without Removing
        System.out.println("Top element (peek): " + books.peek());

        // 3. Removing the Top Element
        String removedBook = books.pop();
        System.out.println("Removed top element: " + removedBook);
        System.out.println("Stack after pop: " + books);

        // 4. Searching for an Element
        int position = books.search("Data Structures");
        System.out.println("Position of 'Data Structures': " + position);

        // 5. Checking if Stack is Empty
        boolean isEmpty = books.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // 6. Iterating through the Stack
        System.out.print("Stack elements: ");
        for (String book : books) {
            System.out.print(book + " ");
        }
        System.out.println();

        // 7. Adding More Elements
        books.push("Computer Networks");
        books.push("Databases");
        System.out.println("Stack after adding more books: " + books);

        // 8. Removing All Elements
        books.clear();
        System.out.println("Stack after clearing: " + books);
    }
}
