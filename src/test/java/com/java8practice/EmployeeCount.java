package com.java8practice;

import java.util.Arrays;
import java.util.List;

//Example 3: Counting Employees in a Department
//Scenario: Count how many employees are in the "IT" department.

class Employee2 {
	String name, department;

	public Employee2(String name, String department) {
		this.name = name;
		this.department = department;
	}
}

public class EmployeeCount {
	public static void main(String[] args) {
		List<Employee2> employees = Arrays.asList(
				new Employee2("John", "IT"),
				new Employee2("Alice", "HR"),
				new Employee2("Bob", "IT"),
				new Employee2("David", "Finance")
				);

		// Count employees in IT department
		long count = employees.stream()
				.filter(emp -> emp.department.equals("IT"))
				.count();

		System.out.println("Number of IT employees: " + count);
	}
}

//Explanation
//filter(emp -> emp.department.equals("IT")) → Selects employees from the IT department.
//count() → Counts the selected employees.

