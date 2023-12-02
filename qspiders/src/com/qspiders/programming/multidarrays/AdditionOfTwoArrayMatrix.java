package com.qspiders.programming.multidarrays;

public class AdditionOfTwoArrayMatrix {
	public static void addTwoMatrix(int[][]arr1,int[][]arr2) {
		int c[][]= new int[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for (int j1 = 0; j1 < c.length; j1++) {
			for (int j2 = 0; j2 < c[j1].length; j2++) {
				System.out.print(c[j1][j2]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{1,2,1},{1,0,1},{0,0,1}};
		addTwoMatrix(arr1,arr2);
	}
}
