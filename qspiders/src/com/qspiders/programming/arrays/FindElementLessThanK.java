package com.qspiders.programming.arrays;
import java.util.Scanner;
public class FindElementLessThanK {
	static int getLessThan(int arr[],int target) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<target){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter "+ size +" Element in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter element to check total less than element");
		int target=sc.nextInt();
		System.out.println("Total less than "+target+" element: "+getLessThan(arr,target));
	}
}
