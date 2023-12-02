package com.qspiders.programming.arrays;

public class PrintOddEven {
	public static void odd(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.println("Odd Numbers "+arr[i]);
			}
		}
	}
	public static void even(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even NO "+arr[i]);
			}
		}
	}
	public static int productOfAllOdds(int arr[]) {
		int prod=1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0) {
				prod*=arr[i];
			}
		}
		return prod;
	}
	public static void main(String[] args) {
		int arr[]= {2,5,6,7,8,10,56,2,4,8,9,47};
		int arr2[]= {56,-1,-3,-5,7,8,10};
		odd(arr);
		even(arr);
		System.out.println("Product Of Odd Numbers "+productOfAllOdds(arr));	
		System.out.println("Total remainder "+div(arr));
		System.out.println("Largest Number 	"+larget(arr2));
		System.out.println("smallest Number "+smallest(arr2));
		System.out.println("Second Largest Number "+secondLargest(arr2));
	}
	public static int div(int arr[]) {
		int num=6;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			int mod=arr[i]%6; 
				count+=mod;
			
		}
		return count;
	}
	public static int larget(int arr[]) {
		int largest=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			
		}
		return largest;
	}
	public static int smallest(int arr[]) {
		int small=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
			
		}
		return small;
	}
	public static int secondLargest(int arr[]) {
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				second=largest;
				largest=arr[i];
			}else if(arr[i]>second&&arr[i]!=largest) {
				second=arr[i];
			}
		}
		return second;
	}
	
}
