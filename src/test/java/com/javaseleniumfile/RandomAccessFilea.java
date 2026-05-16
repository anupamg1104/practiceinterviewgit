package com.javaseleniumfile;

import java.io.RandomAccessFile;
import java.io.IOException;


public class RandomAccessFilea {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("./src/main/resources/readfile.txt", "r")) {
            String line;
            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
