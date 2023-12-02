package com.qspiders.programming;

public class ArmStrongNUmber {
	public static void isArmStrongNumber(int num) {
		int sum=0;
		int temp=num;
		int power=getCount(num);
		while(temp!=0) {
			int mod=temp%10;
			sum+=getPower(mod, power);
			temp/=10;
		}
		if(sum==num) {
			System.out.println("num is ArmStrong");
		}else {
			System.out.println("num is not a ArmStrong");
		}
		
	}
	
	public static int getCount(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
	}
	
	public static int getPower(int num,int power) {
		int res=1;
		for (int i = 1; i <=power; i++) {
			res*=num;
		}
		return res;
	}
	public static void main(String[] args) {
		
		isArmStrongNumber(4);
	}
}
