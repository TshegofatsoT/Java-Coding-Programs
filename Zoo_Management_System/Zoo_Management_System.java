package com.mycompany.zoo_management_system;

import java.util.Scanner;

public class Zoo_Management_System {

    public static void main(String[] args) {
        String animalName;
        int age;
        int choice;

        Scanner sc = new Scanner(System.in);

        System.out.println("Name of Animal: ");
        animalName = sc.nextLine();

        System.out.println("How old is the animal: ");
        age = sc.nextInt();

        System.out.println("Select a choice between 1 and 3: ");
        choice = sc.nextInt();

        Animal giraffe = new Giraffe(animalName, age);
        giraffe.makeSound();

        Animal tiger = new Tiger(animalName, age);
        tiger.makeSound();

        Animal lion = new Giraffe(animalName, age);
        lion.makeSound();

        switch (choice) {
            case 1 ->
                giraffe.feedAnimal();
            case 2 ->
                giraffe.healthCheck();
            case 3 ->
                giraffe.specialBehavior();
            default ->
                System.out.println("Invalid Choice");
        }

        switch (choice) {
            case 1 ->
                tiger.feedAnimal();
            case 2 ->
                tiger.healthCheck();
            case 3 ->
                tiger.specialBehavior();
            default ->
                System.out.println("Invalid Choice");
        }

        switch (choice) {
            case 1 ->
                lion.feedAnimal();
            case 2 ->
                lion.healthCheck();
            case 3 ->
                lion.specialBehavior();
            default ->
                System.out.println("Invalid Choice");
        }

    }
}
