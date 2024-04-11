package com.numberProgramAgain;

public class NeonNumber {

	public static void main(String[] args) {
		int n = 132;
		if(neonNum(n)) System.out.println("Neon Number");
		else System.out.println("Not Neon Number");
	}
	public static boolean neonNum(int n) {
		int sum = 0,mul = 1;
		while(n>0) {
			int r = n%10;
			sum+=r;
			mul*=r;
			n/=10;
		}
		return sum==mul;
	}

}
