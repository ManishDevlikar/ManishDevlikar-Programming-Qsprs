package com.basic.mathfordsa;

public class NoIsPrimeOrNot {
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int a=20;
		for(int i=1;i<=a;i++) {
			System.out.println(i+" "+isPrime(i));
		}
	}
}
