package com.mycompany.encapsulation_employeeclass;

import java.util.Scanner;

public class Encapsulation_EmployeeClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Create an employee object
        Employee emp = new Employee("Tshegofatso", 28000);

        System.out.println("Initial Employee Details:");

        System.out.println("Employee: " + emp.getName() + ", Salary: R" + emp.getSalary());

        // Input new name
        System.out.print("\nPlease enter your name: ");
        String name = scan.nextLine();

        // Input new salary
        System.out.print("New salary: ");
        double salary = scan.nextDouble();

        // Update and display new employee details
        emp.setName(name);
        emp.setSalary(salary);

        System.out.println("\nUpdated Employee Details:");
        emp.display();

        scan.close();
    }
}
