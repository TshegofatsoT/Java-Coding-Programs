
package com.mycompany.salesrecordanalyzer_2darray;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SalesRecordAnalyzer_2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arrProductName = new String[5];
        int[][] arrDailySales = new int[5][7];
        int[] arrWeeklySales = new int[5];

        int bestProd = 0;
        int total;

        //Input product names
        for (int i = 0; i < arrProductName.length; i++) {
            System.out.print("Enter product Name: ");

            try {
                arrProductName[i] = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Only enter string. " + e);
            }
        }

        //Input daily sales 
        for (int p = 0; p < arrProductName.length; p++) {
            total = 0;
            System.out.println("\nEnter sales amount for " + arrProductName[p] + ": ");
            for (int s = 0; s < arrDailySales.length; s++) {
                try {
                    arrDailySales[p][s] = sc.nextInt();
                    if (arrDailySales[p][s] < 0) {
                        System.out.println(" Sales cannot be negative. ");
                    }
                } catch (InputMismatchException e) {
                    System.out.println(" Invalid input. Please enter a number.");
                    sc.next(); // clear invalid input
                }
                total += arrDailySales[p][s];
                System.out.println(arrDailySales[p][s]);
            }
            arrWeeklySales[p] = total;

            if (total > arrWeeklySales[bestProd]) {
                bestProd = p;
            }
        }

        //weekly totals display
        System.out.println("\n--- Weekly Sales Report ---");
        for (int i = 0; i < arrProductName.length; i++) {
            System.out.println(arrProductName[i] + ": R" + arrWeeklySales[i]);
        }

        //best-selling product
        System.out.println("\nBest-selling product: " + arrProductName[bestProd]);

        sc.close();
    }
}
