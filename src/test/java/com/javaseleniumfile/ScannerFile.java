package com.javaseleniumfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("./src/main/resources/readfile.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
     // Writing to the file
        try (PrintWriter writer = new PrintWriter(new FileWriter("./src/main/resources/readfile.txt", true))) {
            writer.println("This is a new line written to the file.");
            writer.println("Another line added to the file.");
            System.out.println("\nWriting to file completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
//        FileWriter f=new FileWriter("./src/main/resources/readfile.txt");
    }
}

