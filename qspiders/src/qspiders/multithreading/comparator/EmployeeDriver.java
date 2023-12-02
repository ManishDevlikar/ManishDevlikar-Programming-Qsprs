package qspiders.multithreading.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDriver {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(1,"max",20000));
		al.add(new Employee(3,"sand",1000));
		al.add(new Employee(2,"andy",500));
		Collections.sort(al,new SalComparator());
		al.forEach((a)->System.out.println(a));
	}
}
