package qspiders.multithreading.comparator;

import java.util.Comparator;

public class Employee {
	int id;
	String name;
	int sal;
	
	Employee(int id, String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public String toString() {
		return id+" "+name+" "+sal;
	}
}

class SalComparator implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		if(e1.sal>e2.sal) {
			return 1;
		}else if(e1.sal<e2.sal) {
			return -1;
		}else {
			return 0;
		}
	}
}
class NameComparator implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}
