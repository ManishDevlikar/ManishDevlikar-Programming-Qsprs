package com.qspiders.programming;

public class FindLargetConverNegToPos {
	public static void largest(int num) {
		int max=-9;
		num=NegToPos(num);
		while(num!=0) {
			int mod=num%10;
			if(mod>max) {
				max=mod;
			}
			num=num/10;
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		largest(-9395);
	}
	
	public static int NegToPos(int num) {
		if(num<0) {
			return num*-1;
		}
		return num;
	}
}
