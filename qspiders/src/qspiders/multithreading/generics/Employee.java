package qspiders.multithreading.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// write a program to store and iterate arraylist of employee and print each value using foreach loop
//write a program to store and iterate arraylist of employee on ascending order
public class Employee implements Comparable<Employee>{
	int id;
	String name="";
	int sal;

	Employee(int id,String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	 public String toString() {
		 return id+" "+name+" "+sal;
	 }
		@Override
		public int compareTo(Employee o) {
			
			return this.name.compareTo(o.name);
//			if(this.name.charAt(0)>o.name.charAt(0)) {
//				return 1;
//			}else if(this.name.charAt(0)<o.name.charAt(0)) {
//				return -1;
//			}else {
//				return 0;
//			}
			
		}
	 public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(1,"az",99));
		al.add(new Employee(2,"aa",22));
		al.add(new Employee(5,"af",88));
		al.add(new Employee(3,"ab",5));
		
		Collections.sort(al);
		al.forEach((e)->System.out.println(e)); 
//		for(Employee e:al) {
//			System.out.println(e);
//		}
//		System.out.println(al);
	 }

}
