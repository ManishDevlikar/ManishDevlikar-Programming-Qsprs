package qspiders.oop.encapsulation;

public class Company {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"manish","devloper",100000);
		emp1.printDetails();
		
		Employee emp2 = new Employee(102,"sunny","devloper",100000);
		emp2.printDetails();
		
		Employee emp3 = new Employee(103,"raj","devloper",100000);
		emp3.printDetails();
		
		Employee emp4 = new Employee(104,"yash","devloper",100000);
		emp4.printDetails();
		
		Employee emp5 = new Employee(105,"jay","devloper",100000);
		emp5.printDetails();

		
//		Employee emp1 = new Employee();
//		emp1.setEId(101);
//		emp1.setSalary(100000);
//		emp1.name="manish";
//		emp1.designation="Devloper";
//	
//		Employee emp2 = new Employee();
//		emp2.setEId(102);
//		emp2.setSalary(100000);
//		emp2.name="sunny";
//		emp2.designation="Devloper";
//		
//		Employee emp3 = new Employee();
//		emp3.setEId(103);
//		emp3.setSalary(100000);
//		emp3.name="raj";
//		emp3.designation="Devloper";
//		
//		Employee emp4 = new Employee();
//		emp4.setEId(104);
//		emp4.setSalary(100000);
//		emp4.name="yash";
//		emp4.designation="Devloper";
//		
//		Employee emp5 = new Employee();
//		emp5.setEId(105);
//		emp5.setSalary(100000);
//		emp5.name="jay";
//		emp5.designation="Devloper";
//		
//		System.out.println("empID 1: "+emp1.getEId());
//		System.out.println("empName 1: "+emp1.name);
//		System.out.println("empDesignation 1: "+emp1.designation);
//		System.out.println("empSalary 1: "+emp1.getSalary()+"\n");
//		
//		System.out.println("empID 2: "+emp2.getEId());
//		System.out.println("empName 2: "+emp2.name);
//		System.out.println("empDesignation 2: "+emp2.designation);
//		System.out.println("empSalary 2: "+emp2.getSalary()+"\n");
//		
//		System.out.println("empID 3: "+emp3.getEId());
//		System.out.println("empName 3: "+emp3.name);
//		System.out.println("empDesignation 3: "+emp3.designation);
//		System.out.println("empSalary 3: "+emp3.getSalary()+"\n");
//		
//		System.out.println("empID 4: "+emp4.getEId());
//		System.out.println("empName 4: "+emp4.name);
//		System.out.println("empDesignation 4: "+emp4.designation);
//		System.out.println("empSalary 4: "+emp4.getSalary()+"\n");
//		
//		System.out.println("empID 5: "+emp5.getEId());
//		System.out.println("empName 5: "+emp5.name);
//		System.out.println("empDesignation 5: "+emp5.designation);
//		System.out.println("empSalary 5: "+emp5.getSalary()+"\n");
	}

}
