package com.numberProgramAgain;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n =153;
		if(armstrong(n)==n) System.out.println("Armstrong Number");
		else System.out.println("Not a Armstrong Number");
		
	}
	public static int count(int n) {
		int count =0;
		while(n>0) {
			count ++;
			n/=10;
		}
		return count;
	}
	
	public static int armstrong(int n ) {
		int m=n;
		int sum=0;
		while(n>0) {
			int r = n%10;
			sum+= Math.pow(r, count(m));
			n/=10;
		}
		return sum;
		
	}
	
	

}
