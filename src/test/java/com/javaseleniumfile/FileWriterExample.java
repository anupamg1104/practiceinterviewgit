package com.javaseleniumfile;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            // Creating FileWriter object
            FileWriter writer = new FileWriter("./src/main/resources/output.txt");

            // Writing a single character
            writer.write(65);  // Writes 'A'
            
            // Writing a string
            writer.write("BCDEFG\n");
            
            // Writing a portion of a string
            writer.write("Hello, World!", 7, 5);  // Writes "World"
            writer.write("\n");
            
            // Writing a character array
            char[] chars = {'H', 'e', 'l', 'l', 'o'};
            writer.write(chars);
            writer.write("\n");
            
            // Flushing the writer to ensure all data is written to the file
            writer.flush();
            
            // Closing the writer
            writer.close();

            System.out.println("Writing to file completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

