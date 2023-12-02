package com.linkList.doublyLinkList.practice;

public class main {
	public static void main(String[] args) {
		
		dl dlist= new dl();
		dlist.insertFirst(2);
		dlist.insertFirst(23);
		dlist.insertFirst(4);
		dlist.insertLast(100);
		dlist.insertLast(150);
		dlist.insertLastWithoutTail(99);
		dlist.insert(23, 49); 
		dlist.display();
		dlist.displayRev();
		
	}
}
