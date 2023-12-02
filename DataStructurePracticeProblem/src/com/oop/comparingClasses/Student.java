package com.oop.comparingClasses;

public class Student {  //implements Comparable<Student> 
	int rollNo;
	float percentage;
	public Student(int rollNo,float percentage) {
		this.rollNo=rollNo;
		this.percentage=percentage;
	}
//	@Override
//	public int compareTo(Student o) {
//		int diff=(int)(this.percentage-o.percentage);
//		return diff;
//	}
	@Override
	public String toString() {
		return percentage+"";
	}
}
