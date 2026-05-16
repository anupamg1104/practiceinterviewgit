package com.javaseleniumfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class UTF8FileWriter {
    public static void main(String[] args) {
        String content = "Empuraan के विवादित सीन्स के लिए Mohanlal ने फैंस से मांगी माफी";
        File file = new File("./src/main/resources/output.txt");

        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8)) {
            writer.write(content);
            System.out.println("File written successfully with UTF-8 encoding.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
