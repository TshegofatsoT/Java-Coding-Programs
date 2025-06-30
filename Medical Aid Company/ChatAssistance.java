package com.mycompany.medicalaidcompany;

import java.util.Scanner;

public class ChatAssistance {
    // Chat assistant that responds to simple questions

    public void startChat() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nChat Bot Assistant is online. (type 'exit' to quit)");

        while (true) {
            System.out.print("> ");
            String question = input.nextLine().toLowerCase();

            if (question.equals("exit")) {
                break;
            }
            if (question.contains("hi") || question.contains("hello")) {
                System.out.println("Hi there! I am your ChatAssistance.");
            } else if (question.contains("doctor") || question.contains("gp")) {
                    System.out.println("Bot: GP visits are fully covered.");
                } else if (question.contains("hospital")) {
                    System.out.println("Bot: Hospital stays are covered up to R200,000.");
                } else if (question.contains("medication")) {
                    System.out.println("Bot: Chronic medication is included.");
                } else if (question.contains("premium")) {
                    System.out.println("Bot: Your monthly premium is R999.99.");
                } else {
                    System.out.println("Bot: Please ask about 'doctor', 'hospital', 'medication', or 'premium'.");
                }
            }
        }
    }
