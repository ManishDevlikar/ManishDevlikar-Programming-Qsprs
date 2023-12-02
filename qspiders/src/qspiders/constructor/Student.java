package qspiders.constructor;
//Example for constructor Overloading
public class Student {
	int rollno;
	String name;
	String[] subjects;
	Student (){
		
	}
	Student(int rollno){
		this.rollno=rollno;
	}
	Student (int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	Student(int rollno,String name,String[] subjects){
		this.rollno=rollno;
		this.name=name;
		this.subjects=subjects;
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(1);
		Student s3=new Student(3,"manish");
		String[] sub= {"marathi","english"};
		Student s4=new Student(4,"sunny",sub);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4.subjects[1]);
	}

}
