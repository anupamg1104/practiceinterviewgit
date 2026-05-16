package com.listexample;

import java.util.HashSet;
import java.util.Set;

public class SetMethodsExample {

    public static void main(String[] args) {
        // 1. Creating a Set
        Set<String> cities = new HashSet<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("New York"); // Sets do not allow duplicates
        System.out.println("Original Set: " + cities);

        // 2. Checking if Set Contains an Element
        boolean containsLA = cities.contains("Los Angeles");
        System.out.println("Does the set contain 'Los Angeles'? " + containsLA);

        // 3. Removing an Element
        cities.remove("Chicago");
        System.out.println("Set after removing 'Chicago': " + cities);

        // 4. Iterating through the Set
        System.out.print("Cities: ");
        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();

        // 5. Checking the Size of the Set
        System.out.println("Size of the set: " + cities.size());

        // 6. Clearing the Set
        cities.clear();
        System.out.println("Set after clearing: " + cities);
    }
}

