// Class for storing member information
package com.mycompany.medicalaidcompany;

public class Member {

    String name;
    int age;
    String idNumber;

    public Member(String name, int age, String idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    public void displayMemberInfo() {
        System.out.println("\n--- Member Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID Number: " + idNumber);
    }
}
