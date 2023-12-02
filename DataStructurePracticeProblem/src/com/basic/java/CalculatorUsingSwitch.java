package com.basic.java;
import java.util.Scanner;
public class CalculatorUsingSwitch {

	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.print("Enter(+,-,*,/,%)operator: ");
char operator = sc.next().charAt(0);
System.out.print("Enter First Number: ");
int a=sc.nextInt();
System.out.print("Enter Second Number: ");
int b=sc.nextInt();
int result=0;
sc.close();
switch(operator) {

case '+' ->System.out.println(result=a+b);
case '-' ->System.out.println(result=a-b);
case '*' ->System.out.println(result=a*b);
case '/' ->System.out.println(result=a/b);
case '%' ->System.out.println(result=a%b);
default -> System.out.println("invalid Operator");

}
	}

}
