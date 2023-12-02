package com.qspiders.programming.multidarrays;

public class SumOfDiagonalElementsUsingSingeLoop {
	public static void getDiagonalSum(int[][] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i][i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		getDiagonalSum(arr);
	}
}
