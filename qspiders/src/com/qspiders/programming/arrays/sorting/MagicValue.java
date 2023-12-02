package com.qspiders.programming.arrays.sorting;

public class MagicValue {
	public static void main(String... args) {
		int arr[]= {1,2,3,5,4,7,6};
		System.out.println(getMagicNumber(arr));
		
	}
	public static int getMagicNumber(int arr[]) {
		int good=0,bad=0;
		int b[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			b[i]=arr[i];
		}
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==b[i]) {
				good+=arr[i];
			}else {
				bad+=arr[i];
			}
		}
		return good-bad;
	}
}
