package com.numberProgramAgain;

public class HappyNumber {

	public static void main(String[] args) {
		int n=6;
		int m=n;
		while(m!=1 && m!=4) {
			isHappy(m);			
		}
		if(m==1) {
			System.out.println("happy Number");
		}
		else {
			System.out.println("Not Happy Number");
		}		
		
	}
	public static int isHappy(int n) {
		int sum = 0;
		while(n>0) {
			int r = n%10;
			int sq = r*r;
			sum+=sq;
			n/=10;
		}
		return sum;
	}

}
