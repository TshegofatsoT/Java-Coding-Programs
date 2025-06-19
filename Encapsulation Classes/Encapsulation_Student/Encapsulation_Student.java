package com.mycompany.encapsulation_student;

import java.util.Scanner;

public class Encapsulation_Student {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student stud = new Student("Tshegofatso", 27);
        int age = stud.getAge();
        String name = stud.getName();

        System.out.println("Hi " + name + " your age is " + age + ".");

        //Enter score 1
        System.out.println("Please enter your name: ");
        name = scan.nextLine();

        //Enter score 2
        System.out.println("And age: ");
        age = scan.nextInt();

        System.out.println("Updated details:");

        stud.setName(name);
        stud.setAge(age);

        System.out.println("Hi " + stud.getName() + " your age is " + stud.getAge() + ".");

    }
}
