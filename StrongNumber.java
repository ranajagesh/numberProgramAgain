package com.numberProgramAgain;

public class StrongNumber {

	public static void main(String[] args) {
		
		int st=1;
		int end = 100000;
		int count =1;
		for(int i=st;i<=end;i++) {
			if(isStrong(i)==i) {
				count++;
				if(count%2!=0) System.out.println(i);
			}		
		}
	}
	
	public static int fact(int n) {
		int product = 1;
		for(int i=1;i<=n;i++) {
			product*=i;
		}
		return product;
	}
	
	public static int  isStrong(int n) {
		int sum=0;
		while(n>0) {
			int r = n%10;
			sum+=fact(r);
			n/=10;
		}
		return sum;
	}

}
