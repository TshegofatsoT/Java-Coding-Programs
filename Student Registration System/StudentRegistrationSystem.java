package com.mycompany.studentregistrationsystem;

import java.util.Scanner;

public class StudentRegistrationSystem {

    public static void main(String[] args) {
        //Scanner object to get user inputs.
        Scanner sc = new Scanner(System.in);

        //Array for student object
        Student[] student = new Student[30];

        //integer variables for options, age and counter. 
        int option, age, count = 0;

        //string variables for name, student ID and Course Name
        String name, studID, courseName;

        //While loop to allow different students to register
        while (true) {

            //Displays menu options
            System.out.println("2025 Student Registration Menu");
            System.out.println("1. Register New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.println("Choose between the following option 1 - 3: ");

            //try statement to catch bad user input
            try {
                //user input for option 1-3
                option = Integer.parseInt(sc.nextLine());

                //switch statement for otion 1 - 2
                switch (option) {
                    case 1:

                        //Checks if there is still space for registrations.
                        if (count > student.length) {
                            System.out.println("Student Registration is now full! No more registrations allowed.");
                        }

                        //Input for student ID
                        System.out.print("Please enter your student ID: ");
                        studID = sc.nextLine();

                        //Input for course name
                        System.out.print("Please enter your course name: ");
                        courseName = sc.nextLine();

                        //Input for student name
                        System.out.print("Please enter your name: ");
                        name = sc.nextLine();

                        //Input for  student age
                        System.out.print("Please enter your age: ");
                        age = Integer.parseInt(sc.nextLine());

                        //Array to store student ID, courseName, name, age
                        student[count] = new Student(studID, courseName, name, age);

                        //Displays successful after student registers
                        System.out.println("You have registered successfully.");

                        //increase the student counter after registering the student
                        count++;

                        break;

                    //To view all students who registered
                    case 2:
                        System.out.println("\nViewing All Registered students");
                        //Checks if students registered
                        if (count == 0) {
                            System.out.println("There are no students that are registered.");
                        } else {
                            //If students registered it displays a list of all students who registered
                            for (int i = 0; i < count; i++) {
                                System.out.println("----------------");
                                student[i].displayInfo();
                            }
                        }
                        break;
                    case 3:
                        //Exits the program
                        System.out.println("Thank you. Exiting.");
                        sc.close();
                        return;
                    default:
                        //When user entered options besides 1-3.
                        System.out.println("Please select options between 1, 2 or 3.");
                }
                //Triggered when user enters strings. 
            } catch (NumberFormatException e) {
                
                System.out.println("Enter an integer value. " + e);
            }
        }
    }
}


