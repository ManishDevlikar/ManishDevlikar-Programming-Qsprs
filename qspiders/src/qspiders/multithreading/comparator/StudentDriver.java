package qspiders.multithreading.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(3,"Shreyansh",400));
		al.add(new Student(1,"Khush",300));
		al.add(new Student(2,"Ana",200));
		
		Collections.sort(al,new SNameComparator());
		al.forEach((s)->System.out.println(s));
		Collections.sort(al,new IdComparator());
		al.forEach((s)->System.out.println(s));
		Collections.sort(al,new TotalMarksComparator());
		al.forEach((s)->{
			System.out.println(s);
		});
	}
}
