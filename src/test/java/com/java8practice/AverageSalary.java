package com.java8practice;

import java.util.*;
import java.util.stream.Collectors;

class Employee5 {
    String name, department;
    double salary;

    public Employee5(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class AverageSalary {
    public static void main(String[] args) {
        List<Employee5> employees = Arrays.asList(
            new Employee5("John", "IT", 60000),
            new Employee5("Alice", "HR", 50000),
            new Employee5("Bob", "IT", 70000),
            new Employee5("David", "Finance", 40000),
            new Employee5("Eve", "HR", 60000)
        );

        // Calculate average salary by department
        Map<String, Double> avgSalaryByDept = employees.stream()
                                                       .collect(Collectors.groupingBy(emp -> emp.department,
                                                               Collectors.averagingDouble(emp -> emp.salary)));

        System.out.println("Average salary by department: " + avgSalaryByDept);
    }
}

//Explanation
//groupingBy(emp -> emp.department, averagingDouble(emp -> emp.salary)) → Groups employees and calculates average salary.