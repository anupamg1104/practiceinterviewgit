package com.javaseleniumfile;
 
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileInputStream_InputStreamReader {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("./src/main/resources/readfile.txt");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

