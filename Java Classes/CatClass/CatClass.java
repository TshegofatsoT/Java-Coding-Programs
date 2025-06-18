package com.mycompany.catclasses;

public class CatClasses {

    public static void main(String[] args) {

        Cat cat1 = new Cat("African Wild Cat", "Bush", "Birds");
        cat1.displayInfo();

        Cat cat2 = new Cat("Cheetah", "Grass Land", "Impala");
        cat2.displayInfo();

        Cat cat3 = new Cat("Leopard", "Forest", "Monkeys");
        cat3.displayInfo();

        Cat cat4 = new Cat("Lion", "Savanna", "Zebra");
        cat4.displayInfo();

        Cat cat5 = new Cat("Caracal", "Savanna", "Rodents");
        cat5.displayInfo();

        cat5.setCatType("African Civet");

        cat5.setHabitat("Kruger");

        cat5.setFoodType("Reptiles");

        System.out.println("\nUpdated Cat Data :");
        System.out.println("******************************************");
        cat1.displayInfo();
        cat2.displayInfo();
        cat3.displayInfo();
        cat4.displayInfo();
        cat5.displayInfo();
    }
}
