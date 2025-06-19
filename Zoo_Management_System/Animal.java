package com.mycompany.zoo_management_system;

abstract class Animal {

    //Initialize name, age and isFed
    private String name;
    int age;
    int feedCount;
    boolean isFed;

    //Constructor for Animal class
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.isFed = false;
        this.feedCount = 0;
    }

    //Get method for name
    public String getName() {
        return name;
    }

    //Get method for age
    public int getAge() {
        return age;
    }

    //Get method for isFed
    public boolean getIsFed() {
        return isFed;
    }

    //Set method for name
    public void setName(String name) {
        this.name = name;
    }

    //Set method for name
    public void setAge(int age) {
        this.age = age;
    }

    //Set method for name
    public void setIsFed(boolean isFed) {
        this.isFed = isFed;
    }

    //methods
    public abstract void makeSound();
    public abstract void feedAnimal();
    public abstract void healthCheck();
    public abstract void specialBehavior();
}
