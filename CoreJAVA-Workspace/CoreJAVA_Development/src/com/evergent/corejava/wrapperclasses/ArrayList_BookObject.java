package com.evergent.corejava.wrapperclasses;

import java.util.ArrayList;

class Book{
	String name;
	public Book(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
	
}
public class ArrayList_BookObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("core java");
		Book b2=new Book("let us c");
		ArrayList myList=new ArrayList();
		myList.add(b1);
		myList.add(b2);
		System.out.println(myList);

	}

}
