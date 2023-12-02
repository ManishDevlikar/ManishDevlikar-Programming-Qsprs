package com.basic.java;

import java.util.Arrays;

public class VariableLengthArgument {
	static void vLength(String ...i) {
		System.out.println(Arrays.toString(i));
	
	}

	public static void main(String[] args) {
		
vLength("manish","raj");
	}

}
