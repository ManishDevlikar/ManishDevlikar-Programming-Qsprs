package com.qspiders.programming.multidarrays;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr size of outer array");
		int outer=sc.nextInt();
		int[][] arr=new int[outer][]; 
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter size for inner arr");
			int size=sc.nextInt();
			arr[i]= new int[size];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter element");
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
