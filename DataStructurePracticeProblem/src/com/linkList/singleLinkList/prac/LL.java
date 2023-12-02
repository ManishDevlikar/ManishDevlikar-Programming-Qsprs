package com.linkList.singleLinkList.prac;

public class LL {
	
	private Node head;
	private Node tail;
	private int size;
	
	public LL() {
		this.size=0;
	}

	public void insertFirst(int data) {
		Node node=new Node(data);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=head;
		}
		size++;
		
	}
	public void insertLast(int data) {
		Node node = new Node(data);
		if(tail==null) {
			insertFirst(data);
			return;
		}
		tail.next=node;
		tail=node;
		size++;
	}
	public void insertAt(int data,int index) {
		if(index==0) {
			insertFirst(data);
			return;
		}
		if(index==size) {
			insertLast(data);
			return;
		}
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		Node node =new Node(data,temp.next);
		temp.next=node;
		size++;
	}
	public int deleteFirst() {
		int val=head.data;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return val;
	}
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		Node secondLast=get(size-2);
		int val=tail.data;
		tail=secondLast;
		tail.next=null;
		size--;
		return val;
		
	}
	public int deleteAt(int index) {
		if(index==0) {
			return deleteFirst();
		}
		if(index==size-1) {
			return deleteLast();
		}
		Node prev=get(index-1);
		int val=prev.next.data;
		prev.next=prev.next.next;
		size--;
		return val;
		}
	public Node find(int val) {
		Node node=head;
		while(node!=null) {
			if(node.data==val) {
				return node;
			}
			node=node.next;
		}
		return null;
	}
	
	public Node get(int index) {
		Node node=head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data=data;
		}
		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}
	}

}