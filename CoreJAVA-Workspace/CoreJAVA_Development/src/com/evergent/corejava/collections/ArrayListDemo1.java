package com.evergent.corejava.collections;

import java.util.ArrayList;


public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList myList=new ArrayList();
		myList.add(100);
		myList.add("hello");
		myList.add(45.05);
		myList.add(100);
		myList.remove(1);
		
		System.out.println(myList);

	}

}
