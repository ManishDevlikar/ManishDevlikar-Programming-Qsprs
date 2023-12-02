package com.qspiders.programming;

public class PerfectNum {
	public static void isPerfect(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			System.out.println(num+ " is Perfect Number");
		}else {
			System.out.println(num+ " is not a Perfect Number");
		}
	}
	public static void main(String[] args) {
		isPerfect(6);
	}
}
