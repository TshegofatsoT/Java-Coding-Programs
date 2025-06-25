/*The Student class inherits from the base class called Person. 
The Student class  will also display the StudentID and Course name.
The class will also display information from the Person class*/

package com.mycompany.studentregistrationsystem;

public class Student extends Person{
    //This is private variables for the Student class.
    private String studentID;
    private String course;

     //Constructor to initialise the Student ID and Course.
    public Student(String studentID, String course, String name, int age) {
        super(name, age);
        this.studentID = studentID;
        this.course = course;
    }

    //Method to get the students ID.
    public String getStudentID() {
        return studentID;
    }

    //Method to get the course name.
    public String getCourse() {
        return course;
    }

    //Method to override the displayInfo and display the students ID and Course name.
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
    }
}
