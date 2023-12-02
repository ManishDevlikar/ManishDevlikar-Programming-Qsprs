package com.basic.java;
import java.util.Scanner;

public class NestedSwitchStatement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int employeeID=sc.nextInt();
		String department=sc.next();
		switch (employeeID) {
		case 101:
			System.out.println("Manish Devlikar");
			break;
		case 102:
		    System.out.println("Raj Tangadi");
		    break;
		case 103:
			System.out.println("Sunny Devlikar");
	
			switch(department) {
			case "IT":
				System.out.println("IT Department");
				break;
			case "Managegment":
				System.out.println("Management Department");
				break;
			case "DigitalMarketing":
				System.out.println("Digital Marketing Department");
				break;
				default:
					System.out.println("No Such Department");
			}
			break;
			default:
				System.out.println("Enter valid id");
		}

	}

}
