package com.numberProgramAgain;
import java.util.Scanner;
public class SmallestDigit {

	public static void main(String[] args) {
		
		       // Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = new Scanner(System.in).nextInt();
		        int smallestDigit = findSmallestDigit(number);
		        System.out.println("The smallest digit in the number is: " + smallestDigit);
		    }

		    private static int findSmallestDigit(int num) {
		        int smallest = 1;
		        while (num > 0) {
		            int digit = num % 10;
		            if (digit > smallest) {
		                smallest = digit;
		            }
		            num /= 10;
		        }
		        return smallest;
	}

}
