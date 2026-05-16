package com.java8practice;

import java.util.*;

class Employee7 {
    String name;
    double salary;

    public Employee7(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class EmployeeListExample {
    public static void main(String[] args) {
        List<Employee7> employees = new ArrayList<>(Arrays.asList(
                new Employee7("John", 60000),
                new Employee7("Alice", 45000),
                new Employee7("Bob", 70000),
                new Employee7("David", 40000)
        ));

        // Adding more employees using add() method
        employees.add(new Employee7("Eve", 55000));
        employees.add(new Employee7("Charlie", 75000));

        // Printing the updated list
        for (Employee7 emp : employees) {
            System.out.println(emp);
        }
        
        
        System.out.println("  ***************-----***************** \n \n");
     // 1. Adding new employees
        employees.add(new Employee7("Eve", 55000)); 
        employees.add(new Employee7("Charlie", 75000));

        // 2. Getting an employee at a specific index
        Employee7 empAtIndex2 = employees.get(2);
        System.out.println("Employee at index 2: " + empAtIndex2);

        // 3. Updating an employee at a specific index
        employees.set(1, new Employee7("Alice Updated", 50000));

        // 4. Removing an employee by index
        employees.remove(3); // Removes the employee at index 3

        // 5. Checking if a specific employee exists (by name & salary)
        boolean containsBob = employees.contains(new Employee7("Bob", 70000)); // Won't work as expected due to default equals() behavior
        System.out.println("Contains Bob? " + containsBob);

        // 6. Getting the size of the list
        System.out.println("Total employees: " + employees.size());

        // 7. Iterating over the list
        System.out.println("\nUpdated Employee List:");
        for (Employee7 emp : employees) {
            System.out.println(emp);
        }

        // 8. Clearing all employees
        employees.clear();
        System.out.println("\nAfter clearing, list size: " + employees.size());
    }
}

