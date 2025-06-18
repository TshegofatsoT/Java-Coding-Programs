package com.mycompany.catclasses;

public class Cat {

    String catType;
    String habitat;
    String foodType;

    //constructor
    public Cat(String catType, String habitat, String foodType) {
        this.catType = catType;
        this.habitat = habitat;
        this.foodType = foodType;
    }

    // Get method for Cat Type
    public String getCatType() {
        return catType;
    }

    // Set method for Cat Type
    public void setCatType(String catType) {
        this.catType = catType;
    }

    // Get method for Habita
    public String getHabitat() {
        return habitat;
    }

    // Set method for habitat
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Get method for Food Type
    public String getFoodType() {
        return foodType;
    }

    // Set method for Food Type
    public void setFoodType(String catType) {
        this.foodType = catType;
    }

    //method
    public void displayInfo() {

        System.out.println("Cat Type: " + catType + ", Haitat: " + habitat + ", food: " + foodType);
    }

}
