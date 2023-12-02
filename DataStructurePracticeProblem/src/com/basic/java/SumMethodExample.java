package com.basic.java;
import java.util.Scanner;
public class SumMethodExample {

	
	
	
//public static int sum(int a,int b) {
//	int result=a+b;
//	return result;
//}


//	public static int sum(){
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter First Number: ");
//		int a=sc.nextInt();
//		System.out.print("Enter Second Number: ");
//		int b=sc.nextInt();
//		int sum=a+b;
//		return sum;
//	}
	
	public static int sum(int a,int b){
		int sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) {
//		System.out.println(sum(2,5));
//		System.out.println(sum());
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b=sc.nextInt();
		System.out.println(sum(a,b));
	}

}
