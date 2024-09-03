package com.evergent.corejava.collections;

import java.util.HashSet;


public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet myList=new HashSet();
		myList.add(45.55);
		myList.add("hello");
		myList.add("hello");

		myList.add(100);
		
		myList.add(100);
		System.out.println(myList);

	}

}
