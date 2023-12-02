package com.linkList.doublyLinkList.practice;

public class dl {
	private Node head;
	private Node tail;
	private int size;
	
	public dl() {
		this.size=0;
	}
	
	public void insertFirst(int data) {
		Node node=new Node(data);
		node.next=head;
		node.prev=null;
		
		if(head!=null) {
		head.prev=node;
		}
		head=node;
		if(tail==null) {
			tail=head;
		}
	}
	public void insertLast(int data) {
		Node node=new Node(data);
		if(tail==null) {
			insertFirst(data);
			return;
		}
		tail.next=node;
		node.prev=tail;
		tail=node;
		node.next=null;
		}
	public void insertLastWithoutTail(int data) {
		Node node =new Node(data);
		Node last=head;
		node.next=null;
		
		if(head==null) {
			node.prev=null;
			head=node;
			return;
		}
		while(last.next!=null) {
			last=last.next;
		}
		last.next=node;
		node.prev=last;
	}
	public Node find(int data) {
		Node node=head;
		while(node!=null) {
			if(node.data==data) {
				return node;
			}
			node=node.next;
		}
		return null;
		
	}
	public void insert(int after,int data) {
		Node p=find(after);
		if(p==null) {
			System.out.println("does not exist");
			return;
		}
		Node node =new Node(data);
		node.next=p.next;
		p.next=node;
		node.prev=p;
		if(node.next!=null) {
			node.next.prev=node;
		}
	
	}
	public void display() {
		Node node=head;  
		while(node!=null) {
			System.out.print(node.data +"->");
			node=node.next;
			}
		System.out.println("NULL");
	}
	
	public void displayRev() {
		Node node=head;
		Node last=tail;
		while(node!=null) {
			last=node;
			node=node.next;
			}
		System.out.println("print in reverse");
		while(last!=null) {
			System.out.print(last.data+"->");
			last=last.prev;
		}
		System.out.println("start");
	}
	
	
	
	private class Node{
		private int data;
		Node next;
		Node prev;
	public Node(int data){
		this.data=data;
	}
	public Node(int data,Node next,Node prev) {
		this.data=data;
		this.next=next;
		this.prev=prev;
	}
	}
}


