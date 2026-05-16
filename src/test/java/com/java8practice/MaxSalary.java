package com.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Example 5: Finding the Maximum Salary Employee
//Scenario: Find the employee with the highest salary.

class Employee3 {
	String name;
	double salary;

	public Employee3(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " - " + salary;
	}
}

public class MaxSalary {
	public static void main(String[] args) {
		List<Employee3> employees = Arrays.asList(
				new Employee3("John", 60000),
				new Employee3("Alice", 45000),
				new Employee3("Bob", 70000),
				new Employee3("David", 40000)
				);

		// Find employee with max salary
		Optional<Employee3> maxSalaryEmployee = employees.stream()
				.max((e1, e2) -> Double.compare(e1.salary, e2.salary));

		maxSalaryEmployee.ifPresent(emp -> System.out.println("Highest Salary Employee: " + emp));
	}
}

//Explanation
//max((e1, e2) -> Double.compare(e1.salary, e2.salary)) → Finds the max salary employee.
//Optional.ifPresent(emp -> System.out.println(emp)) → Prints if a value is present.
