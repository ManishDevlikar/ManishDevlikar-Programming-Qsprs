package com.basic.java;

import java.util.Scanner;

public class ArmstrongBetweenAllThreeDigitNumber {
public static boolean armstrong(int n) {
	int original=n;
	int sum=0;
	while(n>0) {
		int rem=n%10;
		n=n/10;
		sum=sum+rem*rem*rem;
	}return sum==original;
//	if(sum==original) {
//		return true;
//	}return false;
}
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		for(int i=100;i<1000;i++) {
			if(armstrong(i)) {
				System.out.println(i+" ");
			}
		}

	}

}
