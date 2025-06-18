package com.mycompany.scannerinput;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        
        //Initialise the variables
        String  birthDate, phoneNo, idNo;
        float salary;
 
        //Call the input class
        Scanner sc = new Scanner(System.in);
        
        //Get user Inputs
        System.out.print("Please enter your Date of Birth:");
        birthDate = sc.nextLine();
        
        System.out.print("Please enter your phone number:");
        phoneNo = sc.nextLine();
        
        System.out.print("Please enter your ID No:");
        idNo = sc.nextLine();
        
        System.out.print("Please enter your salary:");
        salary= sc.nextFloat();
        
        //Display user inputs 
        System.out.println("Date of Birth is "+ birthDate + " phone number "+ phoneNo + " ID No "+ idNo + "  Salary is R"+ salary);
    }
}
