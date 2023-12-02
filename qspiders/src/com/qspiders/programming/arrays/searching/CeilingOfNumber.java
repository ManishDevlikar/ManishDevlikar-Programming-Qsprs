package com.qspiders.programming.arrays.searching;

// number which is smallest in an array which is greater or equal to target
public class CeilingOfNumber {
	public static int getCeiling(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		if (target > arr[arr.length - 1]) {
			return -1;
		}
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				return arr[mid];
			}
		}
		return arr[start];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 9, 10 };
		System.out.println(getCeiling(arr, 7));
	}
}
