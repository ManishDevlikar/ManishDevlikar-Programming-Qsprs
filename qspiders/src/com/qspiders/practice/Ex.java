package com.qspiders.practice;

import java.util.Arrays;

public class Ex {
    static int xAndY(int x, int y, int[] a) {
        int temp=-1;

        for(int i=0;i<a.length;i++){
            if(a[i]>=x && a[i]<=y){
                temp=a[i];
            }
        }
        return temp;
    }
	 public static void main(String[] args) {
		int arr[]= {11,2,7};
//		System.out.println(xAndY(5,5,arr));
		
		plusOne(arr);
	}
	 
	 public static void plusOne(int[] arr) {
		 for(int i=0;i<arr.length;i++) {
			 int num=0;
			while(arr[i]!=0) {
				int mod=arr[i]%10;
				num=(num*10)+mod;
				arr[i]/=10;
			}
			if(i==arr.length) {
				num+=1;
			}
			System.out.println(num);
		  }
	    }
}

