package com.data.stucture;

import java.util.ArrayList;

public class ArrayListBasicExample {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(10);
		list.add(10);
		list.add(12);
		list.add(17);
		list.add(15);
		list.set(0, 07);
		list.contains(1);
		list.remove(0);
		
		System.out.println(list.contains(1));
		System.out.println(list);
	}

}
