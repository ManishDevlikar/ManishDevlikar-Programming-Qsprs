package com.basic.java;

import java.util.Scanner;

public class ArmstrongNumber {
	static boolean armstrongNumber(int n) {
		int original=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			sum=sum+rem*rem*rem;
		}
//		if(sum==original) {
//			return true;
//		}return false;
		return sum==original;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println( armstrongNumber(n));

	}

}
