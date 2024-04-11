package com.numberProgramAgain;
import java.util.Scanner;
public class First2Last2 {

	public static void main(String[] args) {
		

		        // Create a Scanner object to take user input
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter an integer
		        System.out.print("Enter an integer: ");

		        // Read the integer from the user
		        int number = scanner.nextInt();

		        // Close the scanner to prevent resource leak
		        scanner.close();

		        // Extract the first two digits
		        int firstTwoDigits = number / 100;
		        System.out.println(firstTwoDigits);

		        // Extract the last two digits
		        int lastTwoDigits = number % 100;
		        System.out.println(lastTwoDigits);

		        // Add the first two digits and last two digits
		        int sum = firstTwoDigits + lastTwoDigits;

		        // Display the result
		        System.out.println("Sum of first two digits and last two digits: " + sum);

	}

}
