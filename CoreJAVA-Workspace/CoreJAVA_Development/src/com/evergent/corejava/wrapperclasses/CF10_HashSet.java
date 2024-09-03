package com.evergent.corejava.wrapperclasses;
import java.util.HashSet;
import java.util.Iterator;

public class CF10_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> myList=new HashSet<Integer>();
		myList.add(100);
		myList.add(80);
		myList.add(90);
		myList.add(100);
		System.out.println(myList);
		
		Iterator iterator=myList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
