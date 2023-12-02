package com.qspiders.programming.arrays;
import java.util.Scanner;
public class ArrayProject {
	public static int[] insert(int arr[],int index,int element) {
		int arr2[]=new int[arr.length+1];
		arr2[index]=element;
		for (int i = 0; i < arr.length; i++) {
			if(i<index) {
				arr2[i]=arr[i];
			}else {
				arr2[i+1]=arr[i];
			}
		}
		return arr2;
	}
	public static void read(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] update(int arr[],int index,int element) {
		arr[index]=element;
		return arr;
	}
	public static int[] delete(int arr[],int index) {
		 if (arr == null || index < 0 || index >= arr.length) {
		  return arr;
         }
		int arr2[]=new int[arr.length-1];
		for(int i=0,k=0;i<arr.length;i++) {
			if(i==index) {
				continue;
			}
			arr2[k++]=arr[i];
		}
		return arr2;
		
	}
	public static int[] create(int size) {
		int arr[]=new int[size];
		return arr;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Create empty array");
		int size=sc.nextInt();
		int arr1[]=create(size);
		System.out.println("Array With Empty Element created");
//		read(arr3);
		
		System.out.println("Choose options:: 1=insert,2=read,3=delete,4=update");
		int input=sc.nextInt();
		if(input==1) {
			System.out.println("enter the index and element to insert into array");
			int index=sc.nextInt();
			int element=sc.nextInt();
			arr1=insert(arr1,index,element);
			read(arr1);
		}
		if(input==2) {
			read(arr1);
		}
		if(input==3) {
			System.out.println("enter the index to delete a element");
			int index=sc.nextInt();
			arr1=delete(arr1,index);
			read(arr1);
		}
		if(input==4) {
			System.out.println("enter the index and element to update the value ");
			int index=sc.nextInt();
			int element=sc.nextInt();
			arr1=update(arr1,index,element);
			read(arr1);
		}
	}
}
