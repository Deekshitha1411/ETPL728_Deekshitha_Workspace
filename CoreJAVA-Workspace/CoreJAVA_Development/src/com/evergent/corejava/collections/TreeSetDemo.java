package com.evergent.corejava.collections;

import java.util.TreeSet;
import java.util.Iterator;


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet myList=new TreeSet();
		myList.add(100);
		//myList.add("hello");
		//myList.add(45.05);
		myList.add(10);
		
		System.out.println(myList);
		Iterator i=myList.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}
