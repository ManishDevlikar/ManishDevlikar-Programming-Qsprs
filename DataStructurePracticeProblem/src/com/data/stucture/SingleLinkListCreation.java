package com.data.stucture;

import java.util.Scanner;

public class SingleLinkListCreation {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	public void creation() {
		int data,n;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("enter data");
		data=sc.nextInt();
		Node new_node=new Node(data);  //object of node class
		if(head==null) {
			head=new_node;
		}
		else {
			new_node.next=head;
			head=new_node;
		}
		System.out.println("do you want to continue press 1");
		n=sc.nextInt();
		}
		while(n==1);
	}
	public void traverser() {
		Node temp=head;
		if (head==null) {
			System.out.println("list is emplty");
		}else {
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		
	}
	public static void main(String[] args) {
		SingleLinkListCreation sll=new SingleLinkListCreation();
		sll.creation();
		sll.traverser();
	}

}
