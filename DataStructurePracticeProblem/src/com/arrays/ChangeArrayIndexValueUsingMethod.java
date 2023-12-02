package com.arrays;

import java.util.Arrays;

public class ChangeArrayIndexValueUsingMethod {
static void change(int[] arr) {
	arr[2]=80;
	}
	public static void main(String[] args) {
int numbers[]={1,2,3,4,5};
System.out.println(Arrays.toString(numbers));
change(numbers);
System.out.println(Arrays.toString(numbers));

	}

}
