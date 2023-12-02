package com.bitwise_and_number_system;

public class PrintNumberIsPrimeOrNot {
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int number=2;number<n;number++) {
			if(n%number*number==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int n=20;
		for(int i=0;i<=n;i++) {
			System.out.println(i+" "+isPrime(i));
		}
	}
	
}
