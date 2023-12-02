package com.linkList.singleLinkList;

public class Main {
public static void main(String[] args) {
	LinkList ll = new LinkList();
	ll.insertFirst(3);
	ll.insertFirst(8);
	ll.insertFirst(6);
	ll.insertFirst(9);
	ll.display();
	ll.insertLast(100);
	ll.display();
	ll.insertAt(12, 3);
	ll.display();
	ll.deleteFirst();
	ll.display();
	ll.deleteLast();
	ll.display();
	ll.delete(2);
	ll.display();
	System.out.println(ll.find(8));
	
	
	
}
}
