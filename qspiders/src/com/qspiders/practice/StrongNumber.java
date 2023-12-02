package com.qspiders.practice;

public class StrongNumber {
	public static void isStrong(int num) {
		int temp=num;
		int sum=0;
		
		while(temp!=0) {
			int mod=temp%10;
			sum=sum+getFactorial(mod);
			temp/=10;
		}
		if(sum==num) {
			System.out.println("strong number");
		}else {
			System.out.println("Not a strong number");
		}
	}
	public static int getFactorial(int num) {
		int res=1;
		for(int i=1;i<=num;i++) {
			res*=i;
		}
		return res;
	}
	public static void main(String[] args) {
		isStrong(145);
	}
}
