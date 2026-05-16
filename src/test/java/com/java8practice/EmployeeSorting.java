package com.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Example 2: Sorting a List of Employees by Salary
//Scenario: Sort employees in descending order of salary.

class Employee1 {
    String name;
    double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
            new Employee1("John", 60000),
            new Employee1("Alice", 45000),
            new Employee1("Bob", 70000),
            new Employee1("David", 40000)
        );

        // Sort employees by salary in descending order
        List<Employee1> sortedEmployees = employees.stream()
                                                  .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
                                                  .collect(Collectors.toList());

        System.out.println("Employees sorted by salary: " + sortedEmployees);
    }
}

//Explanation
//sorted((e1, e2) -> Double.compare(e2.salary, e1.salary)) → Sorts in descending order.

