package qspiders.multithreading.generics;
import java.util.*;
//write a program to store and iterate ArrayList of student and print each value using for-each loop
//write a program to store and iterate ArrayList of student on ascending order
public class Student implements Comparable<Student>{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
	@Override
	public int compareTo(Student s) {
		if(this.id>s.id) {  // sorting on id
			return 1;
		}else if(this.id<s.id) {
			return -1;
		}else {
			return 0;
		}
//		return this.name.compareTo(s.name); // sorting on name
	}
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(4,"manish"));
		al.add(new Student(3,"sunny"));
		al.add(new Student(2,"lucy"));
		al.add(new Student(1,"mikasa"));
		Collections.sort(al);
		for(Student s:al) {
			System.out.println(s);
		}
		
		al.forEach((i)->System.out.println(i.id)); // using for-each function
		
//		ListIterator ll = al.listIterator(); // using list iterator
//		while(ll.hasNext()) {
//			System.out.println(ll.next());
//		}
	}

	
}
