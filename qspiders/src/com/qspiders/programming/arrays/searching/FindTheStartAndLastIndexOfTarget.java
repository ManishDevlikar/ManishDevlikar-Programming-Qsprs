package com.qspiders.programming.arrays.searching;

import java.util.Arrays;

public class FindTheStartAndLastIndexOfTarget {
	public static int[] getIndexes(int[] arr, int target) {
		int[] res = { -1, -1 };
		int start = getStartAndEndIndex(arr, target, true);
		int end = getStartAndEndIndex(arr, target, false);
		res[0] = start;
		res[1] = end;
		return res;
	}

	public static int getStartAndEndIndex(int[] arr, int target, boolean isStart) {
		int start = 0;
		int end = arr.length - 1;
		int res = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] < target) {
				end = mid - 1;
			} else if (arr[mid] > target) {
				start = mid + 1;
			} else {
//				Occurrences storing in res 
				res = mid;
//				checks for the last and first Occurrences
				if (isStart) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 5, 5, 7, 8 };

		System.out.println(Arrays.toString(getIndexes(arr, 5)));
	}
}
