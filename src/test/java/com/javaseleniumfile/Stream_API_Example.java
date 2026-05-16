package com.javaseleniumfile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;

public class Stream_API_Example {
    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(Paths.get("./src/main/resources/readfile.txt"))) {
            stream.filter(line -> line.contains("specificWord"))
                  .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

