package com.linkList.singleLinkList.prac;

public class main {
	public static void main(String[] args) {
		LL list=new LL();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);
		list.insertLast(50);
		list.insertAt(15, 2);
		list.display();
		list.deleteFirst();
		list.display();
		list.deleteLast();
		list.display();
		list.deleteAt(1);
		list.display();
		 list.find(10);
		
	}
}
