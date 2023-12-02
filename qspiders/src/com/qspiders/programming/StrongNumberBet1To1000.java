package com.qspiders.programming;
// Strong number between 1 to 1000
public class StrongNumberBet1To1000 {
	static void getStrongNumber(int start,int end) {
		for(int i=start;i<=end;i++) {
			int sum=0;
			int temp=i;
			while(temp!=0) {
				int digit=temp%10;
				sum+=factorial(digit);
				temp/=10;
			}
			printStrong(sum,i);
		}
	}
	public static void printStrong(int num1,int num2) {
		if(num1==num2) {
			System.out.println(num2);
		}
	}
	public static int factorial(int num) {
		int fact=1;
		for(int j=1;j<=num;j++) {
			fact*=j;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		getStrongNumber(1,1000);
//		System.out.println(factorial(1));
//		System.out.println(factorial(4));
//		System.out.println(factorial(6));
	}
}
