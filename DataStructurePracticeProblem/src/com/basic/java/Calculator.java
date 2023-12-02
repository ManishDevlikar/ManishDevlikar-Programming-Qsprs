package com.basic.java;
import java.util.Scanner;
public class Calculator {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

int ans=0;
      while(true) {
    	  System.out.print("Enter The Operator(+,-,*,/,%): ");
    	  char op =sc.next().trim().charAt(0);
    	  if(op == '+' || op == '-' || op == '*' || op == '%' || op== '/') {
    		  System.out.print("Enter Tow Numbers");
    		  int num1 = sc.nextInt();
    		  int num2=sc.nextInt();
    		  if (op=='+') {
    			  ans=num1+num2;
    		  }
    		  if(op=='-') {
    			  ans=num1-num2;
    		  }
    		  if(op=='*') {
    			  ans=num1*num2;
    		  }
    		  if(op=='/') {
    			  if (num2!=0) {
    			  ans=num1/num2;
    		  }
    		  }
    		  if(op=='%') {
    			  ans=num1%num2;
    		  }
    		  
    	  }else if(op =='x'||op=='X') {
    		  break;
    	  
    	  }else {
			  System.out.println(" Invalid Operator Enter (+,-,%,*,/) one of mention symbol or to stop press 'x' or 'X' ");
		  }
    	  System.out.println(ans);
      }
	}

}
