package com.javaseleniumfile;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_Example {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("./src/main/resources/readfile.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

