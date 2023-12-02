package com.qspiders.practice;

public class ArmStrongNumber {
	public static void isArmstrong(int num) {
		int temp=num;
		int digit=digits(num);
		int result=0;
		while(temp!=0) {
			int mod=temp%10;
			result=result+pow(mod,digit);
			temp/=10;
		}
		if(num==result) {
			System.out.println("ArmStrong");
		}else {
			System.out.println("Not ArmStrong");
		}
	}
	public static int digits(int num) {
		int digit=0;
		while(num!=0) {
			digit++;
			num/=10;
		}
		return digit;
	}
	public static int pow(int num,int digits) {
		int res=1;
		for (int i = 0; i < digits; i++) {
			res=res*num;
		}
		return res;
	}
	public static void main(String[] args) {
//		System.out.println(pow(5,3));
		isArmstrong(154);
	}
}
