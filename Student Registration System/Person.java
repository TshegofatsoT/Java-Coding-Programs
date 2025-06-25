/*This is the base class to store a persons Name and Age. 
The class has a get method for name and age. 
The class also has a display method to display the name 
and age.*/

package com.mycompany.studentregistrationsystem;

public class Person {
    //This is private variables for Person class.
    private String name;
    private int age;

    //Constructor to initialise the name and age.
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method to get the persons name.
    public String getName() {
        return name;
    }

    //Methood to get the persons Age.
    public int getAge() {
        return age;
    }

    //Method to display the persons name and age 
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
