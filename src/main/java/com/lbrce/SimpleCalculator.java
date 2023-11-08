package com.lbrce;
import java.util.*;
public class SimpleCalculator {

	    public static void main(String args[]) {
	        // Create a Scanner object to read user input
	        Scanner sc = new Scanner(System.in);

	        // Prompt the user to enter two numbers
	        System.out.println("Enter the first number: ");
	        int num1 = sc.nextInt();
	        System.out.println("Enter the second number: ");
	        int num2 = sc.nextInt();

	        // Prompt the user to choose an operation
	        System.out.println("Choose an operation: ");
	        System.out.println("1. Addition");
	        System.out.println("2. Multiplication");
	        System.out.println("3. Subtraction");
	        System.out.println("4. Division");
	        int choice = sc.nextInt();

	        // Declare a variable to store the result
	        double result = 0;

	        // Perform the chosen operation using a switch case
	        switch (choice) {
	            case 1: // Addition
	                result = num1 + num2;
	                break;
	            case 2: // Multiplication
	                result = num1 * num2;
	                break;
	            case 3: // Subtraction
	                result = num1 - num2;
	                break;
	            case 4: // Division
	                // Check if the second number is zero to avoid division by zero error
	                if (num2 == 0) {
	                    System.out.println("Cannot divide by zero.");
	                } else {
	                    result = num1 / num2;
	                }
	                break;
	            default: // Invalid choice
	                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
				extracted();
	        }

	        // Ensure that the output is always positive
	        if (result < 0) {
	            result = -result; // Make the result positive by changing its sign
	        }

	        // Display the output
	        System.out.println("The result of the operation is: " + result);

	        // Close the Scanner object
	        sc.close();
	    }

		private static void extracted() {
		}
	}


