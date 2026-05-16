package com.javaseleniumfile;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileUtilsExample {
    public static void main(String[] args) {
        try {
            // Copy a file
            File srcFile = new File("./src/main/resources/readfile.txt");
            File destFile = new File("./src/main/resources/destination.txt");
            FileUtils.copyFile(srcFile, destFile);

            // Read file contents
            String content = FileUtils.readFileToString(new File("./src/main/resources/readfile.txt"), "UTF-8");
            System.out.println("File Content: " + content);

            // Write to a file
            FileUtils.writeStringToFile(new File("./src/main/resources/output.txt"), "Empuraan के विवादित सीन्स के लिए Mohanlal ने फैंस से मांगी माफी", "UTF-8");

            
            String content1 = "Empuraan के विवादित सीन्स के लिए Mohanlal ने फैंस से मांगी माफी";
            File outputFile = new File("./src/main/resources/output1.txt");

            // Ensure proper UTF-8 encoding
            FileUtils.writeStringToFile(outputFile, content1, StandardCharsets.UTF_8);
            // Delete a file
            FileUtils.forceDelete(new File("./src/main/resources/destination.txt"));

            // Check file size
            long size = FileUtils.sizeOf(new File("./src/main/resources/output.txt"));
            System.out.println("File Size: " + size + " bytes");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

