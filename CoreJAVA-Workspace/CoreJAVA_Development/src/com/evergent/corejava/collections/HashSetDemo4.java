package com.evergent.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet myList=new HashSet();
		myList.add(100);
		myList.add("hello");
		myList.add(45.05);
		myList.add(100);
		System.out.println(myList);
		
		Iterator i=myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());        
		}

	}

}
