package com.mycompany.abstract_animal;

abstract class Animal {

    public abstract void amimalSound();

    public void sleep() {
        System.out.println("zzz");
    }
}

class Pig extends Animal {

    @Override
    public void amimalSound() {
        System.out.println("The pig said wee wee.");
    }

}

public class Abstract_Animal {

    public static void main(String[] args) {
        //Call the Pig object
        Pig pig = new Pig();
        
        //Call the pig 
        pig.amimalSound();
        pig.sleep();
    }
}
