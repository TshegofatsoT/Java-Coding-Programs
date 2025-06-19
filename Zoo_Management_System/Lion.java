
package com.mycompany.zoo_management_system;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    //method for make sound
    @Override
    public void makeSound() {
        System.out.println("Animal roarrrrrs");
    }

    //method for feedAnimals
    @Override
    public void feedAnimal() {
        if (feedCount <= 3) {
            isFed = true;
            feedCount = feedCount + 1;
            System.out.println("\n Feed Count: " + feedCount);
            System.out.println("\n Is Fed: " + isFed);
        } else {
            System.out.println("Feeding exceeded 3.");
        }

    }

    //method for health check
    @Override
    public void healthCheck() {
        if (age > 3) {
            System.out.println("\n Health Check status is Baby animal. ");
        } else if (age >= 12) {
            System.out.println("\n Health Check status is Young animal. ");
        } else if ((age > 25) && (age < 12)) {
            System.out.println("\n Health Check status is Adult animal. ");
        } else {
            System.out.println("\n Health Check status is Old animal. ");
        }
    }

    //method for Special Behavior
    @Override
    public void specialBehavior() {
        System.out.println("Animal is king of the jungle");
    }
}
