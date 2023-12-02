package com.bitwise_and_number_system;

public class FindWhichNumberAppearsOneceInArray {
	static int printUnique(int[] arr) {
		int unique=0;
		for(int n:arr){
			unique=unique^n;
		}return unique;
		}
	public static void main(String[] args) {
		int[] arr= {2,3,4,2,3,4,8};
		System.out.println(printUnique(arr));
	}
}
