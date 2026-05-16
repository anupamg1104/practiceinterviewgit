package com.java8practice;
import java.util.*;
import java.util.stream.Collectors;

class Employee6 {
	String name, department;

	public Employee6(String name, String department) {
		this.name = name;
		this.department = department;
	}
}

public class EmployeeCountWRTDept {
	public static void main(String[] args) {
		List<Employee6> employees = Arrays.asList(
				new Employee6("John", "IT"),
				new Employee6("Alice", "HR"),
				new Employee6("Bob", "IT"),
				new Employee6("David", "Finance"),
				new Employee6("Eve", "HR")
		);

		// Group by department and map to employee names
		Map<String, List<String>> deptToNames = employees.stream()
				.collect(Collectors.groupingBy(
						emp -> emp.department,
						Collectors.mapping(emp -> emp.name, Collectors.toList())
				));

		// Print department-wise count and names
		deptToNames.forEach((dept, names) -> {
			System.out.println("Department: " + dept);
			System.out.println("Number of employees: " + names.size());
			System.out.println("Employees: " + String.join(", ", names));
			System.out.println();
		});
	}
}


