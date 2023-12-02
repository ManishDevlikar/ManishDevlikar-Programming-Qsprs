package com.bitwise_and_number_system;

public class FindTheUniqueNumberFromArray {
	static int uniqueNumber(int[] arr ) {
		int unique=0;
		for(int n:arr) {
			unique=unique^n;
		}
		return unique;
	}
	public static void main(String[] args) {
		int[] arr= {2,1,3,2,3,1,4,6,4};	
	System.out.println(uniqueNumber(arr));
	}
}
