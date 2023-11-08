package com.lbrce;
import java.util.Scanner;

public class AgeValidation {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        // Validate the age input
        if (age < 0) {
            System.out.println("Invalid age. Please enter a positive number.");
        } else {
            // Check the eligibility of voting
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        }

        // Close the Scanner object
        sc.close();
    }
}

