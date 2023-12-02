package com.qspiders.programming.multidarrays;
// find max count of k in a number
public class MaxCountOfK {
	public static int getMax(int[] arr,int k) {
		int maxCountNumber=0;
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			int temp=arr[i];
			int count=0;
			while(temp>0) {
				int mod=temp%10;
				if(mod==k) {
					count++;
				}
				temp/=10;
			}
			if(count>maxCountNumber) {
				maxCountNumber=count;
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr= {1222,2222,3421,1232};
		System.out.println(getMax(arr,2));
	}
}
