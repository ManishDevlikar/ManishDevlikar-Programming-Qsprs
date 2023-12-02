package com.qspiders.programming;

public class FactBetRange {
	public static void factRange(int start ,int end) {
		for (int i = start; i <=end ; i++) {
			int res=1;
			for (int j = 1; j <=i; j++) {
				res*=j;
			}
			System.out.println(res);
		}
		
	}
	public static void main(String[] args) {
		factRange(5,10);
	}
	
}
