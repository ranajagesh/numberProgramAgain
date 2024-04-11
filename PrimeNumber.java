package com.numberProgramAgain;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a number");
//		int n = sc.nextInt();
//		for(int i=n;;i++) {
//			if(isPrime(i)) {
//				System.out.println(i);
//				break;
//				}
//			}
		
			
//		int st = 1;
//		int end = 100;
//		int primeCount = 0;
//		
//		for(int i=st;i<=end;i++) {
//			if(isPrime(i)) {
//				primeCount++;				
//				if(primeCount<=3)
//				
//				System.out.println(i);
//			}
//		}
		
//		int count = 1;
//		int index = 1;
//		int number = 2;
//		
//		while(index<=100) {
//			if(isPrime(number)) {
//				if(index%4==1) {
//					System.out.println("Prime No "+index+": "+number);
//					count++;
//				}
//				index++;
//			}
//			number++;
//		}
		
		int startNumber = 1; // Start with the third alternative number
        int count = 0; // Count of printed prime numbers

        while (count < 10) { // You can change 10 to any desired number of prime numbers you want to find
            if (isPrime(startNumber)) {
                System.out.println(startNumber);
                count++;
            }
            startNumber += 3; // Move to the next third alternative number
        }
		
	}
	
	public static boolean isPrime(int num) {
		if(num<=1) return false;
		int count = 0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) return true;
		else
		return false;
	}

}
