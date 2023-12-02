package com.oop.objectCloning.shallowCopy;

import java.util.Arrays;

public class MainForShallowCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		Human manish = new Human("manish",20);
		System.out.println(manish.age);
		Human max =  (Human)manish.clone();
		System.out.println(max.age);
		System.out.println(Arrays.toString(max.element));
		max.element[1]=100;
		// manish's array also change 
		System.out.println(Arrays.toString(manish.element));
	}
}
