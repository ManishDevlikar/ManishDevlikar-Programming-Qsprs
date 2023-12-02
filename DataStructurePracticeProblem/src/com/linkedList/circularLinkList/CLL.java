package com.linkedList.circularLinkList;

public class CLL {
	private Node head;
	private Node tail;
	private int size;
	public CLL() {
		this.size=0;
		this.head=null;
		this.tail=null;
	}
	
	public void insert(int data) {
		Node node =new Node(data);
		if(head==null) {
			head=node;
			tail=node;
			return;
		}
		tail.next=node;
		node.next=head;
		tail=node;
	}
	public void delete(int data) {
		Node node=head;
		if(node==null) {
			return;
		}
		if(node.data==data) {
			head=head.next;
			tail.next=head;
			return;
		}
		do {
			Node n=node.next;
			if(n.data==data) {
				node.next=n.next;
				break;
			}
			node=node.next;
		}while(node!=head);
	}
	
	public void display() {
		Node node=head;
		if(node!=null) {
			do {
				System.out.print(node.data+"->");
				node=node.next;
			}while(node!=head);
		}System.out.println("head");
	} 
	
	private class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
		}
		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}
	}
}
