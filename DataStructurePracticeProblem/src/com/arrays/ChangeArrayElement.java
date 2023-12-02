package com.arrays;
import java.util.Arrays;
public class ChangeArrayElement {
	public static void change(int[] nums) {
		nums[0]=88;
	}
	public static void main(String[] args) {
	int arr[]= {12,13,14,15};
	change(arr);
	System.out.println(Arrays.toString(arr));
	
	     }
	}
