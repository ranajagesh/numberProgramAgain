package com.numberProgramAgain;

public class FibonacciRec {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {

			System.out.println(fibonacci(i));
		}
		
	}
	public static int fibonacci(int n) {
		if(n<=1) return n;
		if(n<=2) return 1;
		
		return fibonacci(n-1)+fibonacci(n-2)+fibonacci(n-3);
	}

}
