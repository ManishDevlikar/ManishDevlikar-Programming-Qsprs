package com.qspiders.programming;

public class ArmstrongNumberSeries {
	public static void isArmStrong(int start,int end) {
		for(int i=start;i<=end;i++) {
			int temp=i;
			int sum=0;
			int power=getDigits(i);
			while(temp!=0) {
				int mod=temp%10;
				sum+=getPower(mod,power);
				temp/=10;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}		
	public static int getDigits(int num) {
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
		isArmStrong(1,1000);
	}
}
