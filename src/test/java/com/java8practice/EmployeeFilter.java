package com.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Example 1: Filtering Employees by Salary
//Scenario: Get a list of employees with a salary greater than 50,000.

public class EmployeeFilter {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("John", 60000),
				new Employee("Alice", 45000),
				new Employee("Bob", 70000),
				new Employee("David", 40000)
				);

//		employees.addAll("ss",2323);
		// Filter employees with salary > 50,000
		List<Employee> highSalaryEmployees = employees.stream()
				.filter(emp -> emp.salary > 50000)
				.collect(Collectors.toList());

		System.out.println("Employees with salary > 50,000: " + highSalaryEmployees);
	}
}

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " - " + salary;
	}
}

//Explanation
//filter(emp -> emp.salary > 50000) → Selects employees earning more than 50,000.
//collect(Collectors.toList()) → Stores the result in a list.

