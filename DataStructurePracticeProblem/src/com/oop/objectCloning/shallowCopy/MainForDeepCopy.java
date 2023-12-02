package com.oop.objectCloning.shallowCopy;

import java.util.Arrays;

public class MainForDeepCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		Human manish = new Human("manish",24);
		Human max=(Human)manish.clone();
		max.element[0]=100;
		System.out.println(Arrays.toString(manish.element));
		System.out.println(Arrays.toString(max.element));
		// deep copy
	}
}
