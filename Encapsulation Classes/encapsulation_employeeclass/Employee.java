package com.mycompany.encapsulation_employeeclass;
             
public class Employee {

    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display employee details
    public void display() {
        System.out.println("Hi there, " + name);
        System.out.println("Your salary is: R" + salary);
    }
}
