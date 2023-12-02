package com.data.stucture;
import java.util.*;
public class ArrayIndexElementDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n-1];
		for(int i=0; i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("enter index position where you want to delete number");
		int m=s.nextInt();
		for(int i=0;i<a.length;i++) {
			if(i<m) {
				b[i]=a[i];
			}else if(i==m) {
				continue;
			}else {
				b[i-1]=a[i];
			}
		}
		
		System.out.println("all elements are");
		for(int i=0;i<n-1;i++) {
			System.out.println(b[i]);
		}

	}

}
