package qspiders.multithreading.comparator;
import java.util.Comparator;
public class Student {
	int id;
	String name;
	int totalMarks;
	
	public Student(int id,String name,int totalMarks) {
		this.id=id;
		this.name=name;
		this.totalMarks=totalMarks;
	}
	public String toString() {
		return id+" "+name+" "+totalMarks;
	}
}
class IdComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		if(s1.id>s2.id) {
			return 1;
		}else if(s1.id<s2.id) {
			return -1;
		}else {
			return 0;
		}
	}
}
class SNameComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s1.name.compareTo(s2.name);
	}
}
class TotalMarksComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		if(s1.totalMarks>s2.totalMarks) {
			return 1;
		}else if(s1.totalMarks<s2.totalMarks) {
			return -1;
		}else {
			return 0;
		}
	}
}