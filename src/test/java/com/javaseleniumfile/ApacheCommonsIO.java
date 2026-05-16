package com.javaseleniumfile;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ApacheCommonsIO {
    public static void main(String[] args) {
        try {
            List<String> lines = FileUtils.readLines(new File("./src/main/resources/readfile.txt"), "UTF-8");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

