package com.numberProgramAgain;

public class PerfectNumber {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(isPerfect(i)==i) System.out.println(i);
		}

	}
	
	public static int isPerfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) sum+=i;
		}
		return sum;
	}

}
