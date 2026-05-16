package com.java8practice;

import java.util.*;
import java.util.stream.Collectors;

//Example 6: Grouping Employees by Department
//Scenario: Group employees by department.

class Employee4 {
    String name, department;

    public Employee4(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee4> employees = Arrays.asList(
            new Employee4("John", "IT"),
            new Employee4("Alice", "HR"),
            new Employee4("Bob", "IT"),
            new Employee4("David", "Finance"),
            new Employee4("Eve", "HR")
        );

        // Group employees by department
        Map<String, List<Employee4>> groupedEmployees = employees.stream()
                                                                .collect(Collectors.groupingBy(emp -> emp.department));

        System.out.println("Employees grouped by department: " + groupedEmployees);
    }
}

//Explanation
//collect(Collectors.groupingBy(emp -> emp.department)) → Groups employees by department.
