package com.mycompany.car;

public class Car {

    //Initialise
    String brand;
    String model;
    int year;

    //Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //method
    public void displayInfo() {
        System.out.println("\n Brand: " + brand + "\n Model: " + model + "\n Year: " + year);

    }

    //Main method
    public static void main(String[] args) {
        Car car = new Car("Mazda", "CX 3", 2022);
        car.displayInfo();
    }
}
