package com.javaseleniumfile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;

public class FIlesLine {
    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(Paths.get("./src/main/resources/readfile.txt"))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

