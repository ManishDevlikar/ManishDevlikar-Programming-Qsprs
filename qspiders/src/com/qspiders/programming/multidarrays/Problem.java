package com.qspiders.programming.multidarrays;

public class Problem {
	public static void getResult(int[][]arr,int target) {
		int indexSum=0;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==target) {
					indexSum=i+j;
				}
			}
		}
		if(indexSum%2==0) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if(arr[i][j]%2==0) {
						sum+=getSum(arr[i][j]);
					}
				}
			}
			System.out.println(sum);
			
		}else {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if(arr[i][j]%2!=0) {
						sum+=getSum(arr[i][j]);
					}
				}
			}
		}
		
	}
	public static int getSum(int num) {
		int sum=0;
		while(num!=0) {
			int mod=num%10;
			sum+=mod;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[][] arr= {{11,22,33},{44,55,66},{77,88,99}};
		int target=55;
		getResult(arr,target);
		
	}
}
