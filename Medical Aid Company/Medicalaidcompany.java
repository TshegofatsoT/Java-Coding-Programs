package com.mycompany.medicalaidcompany;

import java.util.ArrayList;
import java.util.Scanner;

public class MedicalAidCompany {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();
        MedicalPlan plan = new MedicalPlan();
        ChatAssistance chat = new ChatAssistance();

        System.out.println("=== Welcome to Medical Aid Company ===");

// Get and store member info
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
// clear buffer
        input.nextLine();
        System.out.print("Enter your ID number: ");
        String id = input.nextLine();

        Member member = new Member(name, age, id);
        members.add(member); // store in array list

        int choice;
        do {
// Menu options
            System.out.println("\n--- Menu ---");
            System.out.println("1. View Member Info");
            System.out.println("2. View Medical Aid Plan");
            System.out.println("3. Chat with Assistant");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            choice = input.nextInt();
// clear buffer
            input.nextLine(); 

// Switch to handle menu choices
            switch (choice) {
                case 1:
                    for (Member m : members) {
                        m.displayMemberInfo();
                    }
                    break;
                case 2:
                    plan.displayPlanInfo();
                    break;
                case 3:
                    chat.startChat();
                    break;
                case 0:
                    System.out.println("Thank you for using Medical Aid Assistant. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 0);
    }
}
