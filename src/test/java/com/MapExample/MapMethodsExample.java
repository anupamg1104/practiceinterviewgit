package com.MapExample;

import java.util.HashMap;
import java.util.Map;

public class MapMethodsExample {

    public static void main(String[] args) {
        // 1. Creating a Map
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        System.out.println("Original Map: " + students);

        // 2. Accessing a Value by Key
        System.out.println("Student with ID 102: " + students.get(102));

        // 3. Iterating through the Map
        System.out.println("Students:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // 4. Checking if Key or Value Exists
        boolean hasKey = students.containsKey(101);
        boolean hasValue = students.containsValue("Alice");
        System.out.println("Does the map contain key 101? " + hasKey);
        System.out.println("Does the map contain value 'Alice'? " + hasValue);

        // 5. Removing an Entry
        students.remove(103);
        System.out.println("Map after removing student with ID 103: " + students);

        // 6. Checking the Size of the Map
        System.out.println("Size of the map: " + students.size());

        // 7. Clearing the Map
        students.clear();
        System.out.println("Map after clearing: " + students);
    }
}

