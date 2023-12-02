package com.qspiders.programming.arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class MagicValue {
	public static void main(String[] args) {

		int arr1[]= {0,4,0,0,1,3,4,1,0,2};
		int arr2[]=new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i]=arr1[i];
		}
			for (int i = 1; i < arr2.length; i++) {
				int temp=arr2[i];
				int j=i;
				
				while(j>0 && arr2[j-1]>temp) {
					arr2[j]=arr2[j-1];
					j--;
				}
				arr2[j]=temp;
			}
		int goodSum=0;
		int badSum=0;
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i]==arr2[i]) {
				goodSum+=arr1[i];
			}else {
				badSum+=arr1[i];
			}
		}
		System.out.println(goodSum-badSum);
	}
}
