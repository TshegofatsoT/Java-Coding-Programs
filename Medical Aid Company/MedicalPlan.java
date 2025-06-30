 // Class to store a predefined medical aid plan
package com.mycompany.medicalaidcompany;

public class MedicalPlan {

    String planName = "Basic Cover";
    double monthlyPremium = 999.99;
    String benefits = "GP visits, Hospital cover, Dental, Chronic Medication";

    public void displayPlanInfo() {
        System.out.println("\n--- Medical Aid Plan ---");
        System.out.println("Plan: " + planName);
        System.out.println("Monthly Premium: R" + monthlyPremium);
        System.out.println("Benefits: " + benefits);
    }
}
