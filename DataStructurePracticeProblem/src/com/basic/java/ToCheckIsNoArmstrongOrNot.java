package com.basic.java;

import java.util.Scanner;

public class ToCheckIsNoArmstrongOrNot {
 static boolean armstsrog(int n) {
	int temp;
	int digits=0;
	int last=0;
	int sum=0;
	temp=n;
	while(temp>0) {
		temp=temp/10;
		digits++;
	}
	temp=n;
	while(temp>0) {
		last=temp%10;
		sum=(int) (sum+(Math.pow(last, digits)));
		temp=temp/10;
	}
	return n==sum;
//	if(n==sum) {
//		return true;
//	}else {
//		return false;
//	}
}
 public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Number");
	num=sc.nextInt();
	System.out.println(armstsrog(num));
//	
//	if(armstsrog(num)) {
//		System.out.println("True");
//	}else {
//		System.out.println("False");
//	}
}
}
