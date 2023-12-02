package com.basic.java;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

String fruit =sc.next();

switch(fruit) {
case ("mango")->    System.out.println("king of fruit");
case ("banana") -> 	System.out.println("Long Yellow Fruit");
default ->          System.out.println("Invalid Fruit");
	
}
	}

}
