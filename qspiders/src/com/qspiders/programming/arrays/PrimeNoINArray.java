package com.qspiders.programming.arrays;

public class PrimeNoINArray {
	public static void getPrime(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			isPrime(arr[i]);
		}
	}
	public static void isPrime(int num) {
		if(getTotalFactor(num)==2) {
			System.out.print(num+" ");
		}
	}
	public static int getTotalFactor(int num) {
		int count=0;
		for (int i = 1; i <=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr= {4,5,7,9,10,13,11,14,17,3,23,50,77,67,69,71,3};
		getPrime(arr);	
	}
}
