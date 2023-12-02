package com.qspiders.practice;

import java.util.ArrayList;

public class MaxAndMin {
	 public static int sumOfMaxMin(int[] arr, int n) {
		    int max=Integer.MIN_VALUE;
		    int min=Integer.MAX_VALUE;

		      for(int i=0;i<arr.length;i++){
		        if(arr[i]>max){
		          max=arr[i];
		        }
		        if(arr[i]<min){
		          min=arr[i];
		        }
		      }
//			    System.out.println(max);
//			    System.out.println(min);
		      return max+min;
		  }
	 public static void main(String[] args) {
		int arr[]= {-1,-4,5,8,9,3,3};
//		System.out.println(sumOfMaxMin(arr,6));
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(4);
		arr1.add(2);
		arr1.add(1);
		arr1.add(3);
		arr1.add(1);
		System.out.println(findDuplicate(arr1));
		
		System.out.println(findDuplicate2(arr));
	}
	 
	 public static int findDuplicate(ArrayList<Integer> arr) {
			for(int i=0;i<arr.size();i++){
				for(int j=i+1;j<arr.size();j++){
					if(arr.get(i)==arr.get(j)){
						return arr.get(i);
					}
				}
			}
			return -1;
		}
	 
	 public static int findDuplicate2(int[]arr) {
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]==arr[j]){
						return arr[i];
					}
				}
			}
			return -1;
		}
}
