package com.evergent.corejava.wrapperclasses;

import java.util.LinkedList;

public class CF8_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList mylist=new LinkedList();
		mylist.add("tata");
		mylist.add("bmw");
		mylist.add("volvo");
		mylist.addFirst("maruthi");
		mylist.addLast("safari");
		
		mylist.remove(4);
		System.out.println(mylist);
		mylist.clear();
		System.out.println(mylist);

	}

}
