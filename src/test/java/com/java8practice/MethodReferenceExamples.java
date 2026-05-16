package com.java8practice;

import java.util.*;
import java.util.function.*;

public class MethodReferenceExamples {

	public static void main(String[] args) {

		// ✅ 1. Static Method Reference
		// Syntax: ClassName::staticMethod
		Function<Integer, Double> squareRoot = Math::sqrt; // instead of: x -> Math.sqrt(x)
		System.out.println("Square root of 25 is: " + squareRoot.apply(25));

		// ✅ 2. Instance Method Reference of a Specific Object
		// Syntax: object::instanceMethod
		Consumer<String> printer = System.out::println; // instead of: s -> System.out.println(s)
		printer.accept("Hello from System.out::println");

		// ✅ 3. Instance Method of Arbitrary Object of a Class
		// Syntax: ClassName::instanceMethod
		List<String> names = Arrays.asList("banana", "Apple", "cherry");
		names.sort(String::compareToIgnoreCase); // instead of: (s1, s2) -> s1.compareToIgnoreCase(s2)
		System.out.println("Sorted names (case-insensitive): " + names);

		// ✅ 4. Constructor Reference
		// Syntax: ClassName::new
		Supplier<List<String>> listSupplier = ArrayList::new; // instead of: () -> new ArrayList<>()
		List<String> newList = listSupplier.get();
		newList.add("Java");
		newList.add("Selenium");
		System.out.println("List created using constructor reference: " + newList);

		// ✅ 5. Custom Class Method Reference Example
		MethodReferenceExamples demo = new MethodReferenceExamples();
		List<String> cities = Arrays.asList("Delhi", "Mumbai", "Kolkata");

		// Using instance method of custom object
		cities.forEach(demo::printUpperCase); // instead of: city -> demo.printUpperCase(city)
	}

	// Custom method used in method reference
	public void printUpperCase(String input) {
		System.out.println(input.toUpperCase());
	}
}

//        ✅ What You'll Learn:
//        |Part| Concept                             | Line                          |
//        |----| ----------------------------------- | ----------------------------- |
//        | 1️  | Static Method Reference             | `Math::sqrt`                  |
//        | 2️  | Instance Method of Specific Object  | `System.out::println`         |
//        | 3️  | Instance Method of Arbitrary Object | `String::compareToIgnoreCase` |
//        | 4️  | Constructor Reference               | `ArrayList::new`              |
//        | 5️  | Custom Method Reference             | `demo::printUpperCase`        |

