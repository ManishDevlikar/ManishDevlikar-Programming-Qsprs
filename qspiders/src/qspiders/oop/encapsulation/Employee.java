package qspiders.oop.encapsulation;

public class Employee {
	private int eId;
	String name;
	String designation;
	private double salary;
	
	public int getEId() {
		return eId;
	}
	public void setEId(int eId) {
		this.eId=eId;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	Employee(int eId,String name,String designation,double salary){
		this.eId=eId;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
	
	public void printDetails() {
		System.out.println("empID : "+this.getEId());
		System.out.println("empName : "+this.name);
		System.out.println("empDesignation : "+this.designation);
		System.out.println("empSalary : "+this.getSalary()+"\n");
	}
}
