package com.mycompany.assessment_task_tshegofatso;

import java.util.Scanner;

public class Assessment_Task_Tshegofatso {

    public static void main(String[] args) {
        String studName, subject, grade;
        int score1, score2, score3;
        double avg;

        Scanner sc = new Scanner(System.in);
        
        //Input name
        System.out.print("Please enter your name: ");
        studName = sc.nextLine();

        //Input subject name
        System.out.print("Please enter the subject name: ");
        subject = sc.nextLine();

        //Input score
        System.out.print("Please enter your score 1: ");
        score1 = sc.nextInt();

        //Input score
        System.out.print("Please enter your score 2: ");
        score2 = sc.nextInt();

        //Input score
        System.out.print("Please enter your score 3: ");
        score3 = sc.nextInt();
           
        
        //proccessing or calculations
        if ((score1 >= 0) && (score1 <= 100)) {
            avg = (score1 + score2 + score3) / 3;
            if ((avg >= 80) && (avg <= 100)) {
                grade = "A";
            } else if ((avg >= 70) && (avg <= 79)) {
                grade = "B";
            } else if ((avg >= 60) && (avg <= 69)) {
                grade = "C";
            } else if ((avg >= 50) && (avg <= 59)) {
                grade = "D";
            } else {
                grade = "F";
            }
            
            //Display
            System.out.println("******************************************* ");
            System.out.println("Student Name: " + studName);
            System.out.println("Subject Name: " + subject);
            System.out.println("Score 1 : " + score1);
            System.out.println("Score 2 : " + score2);
            System.out.println("Score 3 : " + score3);
            System.out.println("Average : " + Math.round(avg));
            System.out.println("Grade : " + grade);
        } else {
            System.out.println("The score must be between 0 and 100 only!");
        }

    }
}
