package com.oop.comparingClasses;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		
	
	Student manish = new Student(1,89.0f);
	Student jatin = new Student(2,98.0f);
	Student kaustubh = new Student(3,88.0f);
	Student ishwar = new Student(4,78.0f);
	Student aayush = new Student(5,76.0f);
	Student max = new Student(6,90.0f);
	Student[] list= {manish,jatin,kaustubh,ishwar,aayush,max};
	System.out.println("before sorting");
	System.out.println(Arrays.toString(list));
	
//	Arrays.sort(list, new Comparator<Student>(){
//		@Override
//			public int compare(Student o1,Student o2) {				
//			return -(int)(o1.percentage-o2.percentage);
//		}
//		});
	
	// above expression using lambda
	
	Arrays.sort(list,(o1,o2)-> (int)(o1.percentage-o2.percentage));
	
	System.out.println("after sorting");
	System.out.println(Arrays.toString(list));
//	if(manish.compareTo(max)<0) {
//		System.out.println("Max Has More Percentage");
//		System.out.println(manish.compareTo(max));
//	}else {
//		System.out.println("Manish Has More Marks");
//		System.out.println(manish.compareTo(max));
//	}
	
}
}
