package com.qspiders.programming.arrays.searching;

// greatest number in array which is less than or equal to target
public class FloorOfNumber {
	public static int getFloor(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return end;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 7 };
		System.out.println(getFloor(arr, 1));
	}
}
