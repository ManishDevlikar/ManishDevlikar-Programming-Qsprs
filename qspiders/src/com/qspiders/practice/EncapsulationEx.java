package com.qspiders.practice;

public class EncapsulationEx {
	public static void main(String[] args) {
		Bank b1=new Bank("manish",1000);
		b1.setDeposite(2000);
		b1.setDeposite(2000);
		b1.setDeposite(6000);
		b1.setWithd(5000);
		b1.display();
		
		NPB b2=new NPB("Messi",1000);
		b2.setDeposite(2000);
		b2.setDeposite(2000);
		b2.setDeposite(6000);
		b2.setWithd(5000);
		b2.display();
	}
	
}

class Bank{
	String name;
	private int withd;
	private int deposite;
	private int totalAmount;
	
	public Bank(String name) {
		this.name=name;
	}
	public Bank(String name,int deposite) {
		this(name);
		this.deposite=deposite;
//		this.totalAmount=totalAmount;
	}
	
	public void setWithd(int amount) {
		if(amount<=totalAmount) {
			this.totalAmount=this.totalAmount-amount;
		}
		System.out.println("You withd : "+amount+" Rupees");
	}
	
	public void setDeposite(int deposite) {
		this.totalAmount+=deposite;
		this.deposite=deposite;
		System.out.println("You deposited: "+deposite);
	}
	public int getDeposite() {
		return this.deposite;
		
	}
	public int getTotalAmount() {
		return this.totalAmount;
	}
	
	public  void display() {
		System.out.println(this.name);
//		System.out.println("Withd Money: "this.withd);
		System.out.println("Recent Deposite: "+this.deposite);
		System.out.println("Total Balance: "+this.totalAmount);
	}
}

class NPB extends Bank{

	public NPB(String name,int deposite) {
		super(name,deposite);
	}
	public void display() {
		System.out.println(this.name);
		System.out.println("Recent Deposite: "+this.getDeposite());
		System.out.println("Total Balance: "+this.getTotalAmount());
	}
	
}