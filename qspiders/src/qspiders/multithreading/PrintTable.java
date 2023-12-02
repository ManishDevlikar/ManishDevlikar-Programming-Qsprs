package qspiders.multithreading;

import java.util.Scanner;

public class PrintTable extends Thread {
	public void run() {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		for (int i = 1; i <=10; i++) {
			System.out.println(num +" * "+i+" = "+num*i);
			System.out.println(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args){
		
		PrintTable t=new PrintTable();
		t.start();
		PrintTable t2=new PrintTable();
		t2.start();
		
	}
}
