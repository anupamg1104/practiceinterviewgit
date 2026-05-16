package com.javaseleniumfile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class FilesReadAllLines {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("./src/main/resources/readfile.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

