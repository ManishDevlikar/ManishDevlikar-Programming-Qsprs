package com.data.stucture;
import java.util.*;
public class MultiDimensionalArrayImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int n =s.nextInt();
		System.out.println("enter column");
		int m=s.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=s.nextInt();
			}
		}
		//to print output
		for(int i=0; i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
