package com.java8practice;

import java.util.*;
import io.restassured.RestAssured;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarKeywordDemo {

	public static void main(String[] args) {

		// ✅ Example 1: Using var for primitive types
		var age = 30; // inferred as int
		var price = 99.99; // inferred as double
		var name = "Anupam"; // inferred as String
		System.out.println("Name: " + name + ", Age: " + age + ", Price: " + price);

		// ✅ Example 2: Using var with collections
		var fruits = List.of("Apple", "Banana", "Orange"); // inferred as List<String>
		for (var fruit : fruits) { // var = String
			System.out.println("Fruit: " + fruit);
		}

		// ✅ Example 3: Using var with streams
		var filtered = fruits.stream()
				.filter(f -> f.startsWith("A"))
				.toList(); // inferred as List<String>
		System.out.println("Filtered Fruits: " + filtered);

		// ✅ Example 4: Using var in Selenium WebDriver (UI Automation)
		WebDriver driver = new ChromeDriver(); // driver itself can't use var here unless already imported
		driver.get("https://www.google.com");

		var searchBox = driver.findElement(By.name("q")); // inferred as WebElement
		searchBox.sendKeys("ChatGPT");
		searchBox.submit();

		var links = driver.findElements(By.tagName("a")); // inferred as List<WebElement>
		for (var link : links) {
			System.out.println("Link text: " + link.getText());
		}

		driver.quit();

		// ✅ Example 5: Using var in API Testing with RestAssured
		var response = RestAssured.get("https://gorest.co.in/public/v2/users"); // inferred as Response
		System.out.println("Status Code: " + response.getStatusCode());
		System.out.println("Response Body: " + response.asPrettyString());

		// ⚠️ Note: var cannot be used without initialization
		// var x; // ❌ Compilation error: cannot infer type without initialization

		// ⚠️ var cannot be used at class level or as return type
		// private var count = 10; // ❌ Not allowed outside method
	}
}

//📌 Key Points About var:
//	
//	| Aspect                  | Description                                              |
//	| ----------------------- | -------------------------------------------------------- |
//	| **Introduced in**       | Java 10                                                  |
//	| **Used for**            | Local variables only (inside methods, blocks, loops)     |
//	| **Cannot be used for**  | Fields (class-level), method parameters, or return types |
//	| **Type is inferred**    | At compile time based on the initializer                 |
//	| **Must be initialized** | Yes, you must assign a value when declaring              |
//	| **Final?**              | You can combine `final` with `var`                       |
