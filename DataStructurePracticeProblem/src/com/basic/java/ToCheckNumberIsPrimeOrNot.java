package com.basic.java;

import java.util.Scanner;

public class ToCheckNumberIsPrimeOrNot {
	public static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		int c=2;
		while(c*c<=n) {
			if(n%c==0) {
				return false;
			}
			c++;
		}
		return c*c>n;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(isprime(n));

	}

}
