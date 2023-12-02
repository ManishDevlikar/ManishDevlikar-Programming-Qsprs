package com.data.stucture;
import java.util.*;

public class ArrayElementAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Array Size");
			int n=s.nextInt();//Number to enter
			int a[]=new int[n];//array with having n number
			int b[]=new int[n+1];//new array 
			for(int i=0;i<n;i++) {
				System.out.println("enter values you want to Print");
			a[i]=s.nextInt(); //it will accept n no of values
			}
			System.out.println("enter at which index you want to add value");
			int m=s.nextInt();//position in array at which you want to add new value
			System.out.println("enter value you want to add ");
			int p=s.nextInt();//enter value you want to add
			for(int i=0;i<n+1;i++) {
				if(i<m) { // checks the index is it at m or not if no then print same no as array a having
					b[i]=a[i];
				}else if(i==m) { // if index is m then add p value
					b[i]=p;
				}else {
					b[i]=a[i-1]; 
				}
			}
			
			
			
			System.out.println("updated array");
			for(int i=0;i<n+1;i++) {
				System.out.println(b[i]);
				
			}
	}

}