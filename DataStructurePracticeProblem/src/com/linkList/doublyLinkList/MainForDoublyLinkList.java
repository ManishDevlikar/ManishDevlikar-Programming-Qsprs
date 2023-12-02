package com.linkList.doublyLinkList;

public class MainForDoublyLinkList {
public static void main(String[] args) {
	DoublyLinkList dll= new DoublyLinkList();
	dll.insertFirst(2);
	dll.insertFirst(3);
	dll.insertFirst(4);
	dll.insertFirst(5);
	dll.insertLast(99);
	dll.displayRev();
}
}
