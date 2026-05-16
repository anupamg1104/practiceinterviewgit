package com.javaseleniumfile;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class ObjectMapperExample {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // Reading JSON data into a tree structure (JsonNode)
            JsonNode rootNode = mapper.readTree(new File("data.json"));

            // You can access elements of the JSON as needed
            String name = rootNode.path("name").asText();
            int age = rootNode.path("age").asInt();
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
