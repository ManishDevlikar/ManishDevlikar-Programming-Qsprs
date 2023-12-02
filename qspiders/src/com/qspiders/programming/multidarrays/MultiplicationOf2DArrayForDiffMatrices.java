package com.qspiders.programming.multidarrays;

public class MultiplicationOf2DArrayForDiffMatrices {
	public static void main(String[] args) {
		int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2= {{1,3,1},{2,3,2},{1,0,2}};
		int[][] arr3=new int[arr1.length][arr2[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				int sum=0;
				for (int k = 0; k < arr2.length; k++) {
					sum=sum+arr1[i][k]*arr2[k][j];
				}
				arr3[i][j]=sum;
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println();
		}
	}


}
