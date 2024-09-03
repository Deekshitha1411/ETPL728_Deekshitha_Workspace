package com.evergent.corejava.wrapperclasses;

import java.util.LinkedHashSet;

public class CF13_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lHashSet=new LinkedHashSet<>();
		lHashSet.add("apple");
		lHashSet.add("banana");
		lHashSet.add("orange");
		lHashSet.add("mango");
		lHashSet.add("grapes");
		
		//displaying linkedhashset
		System.out.println("linkedhashset: "+lHashSet);
		//iterating it
		System.out.println("iterating over linkedhashset");
		for (String fruit : lHashSet) {
			System.out.println(fruit);
		}
		//checking if the set contain an element
		System.out.println("contains mango:"+lHashSet.contains("mango"));
		//remove an element
		lHashSet.remove("banana");
		System.out.println("after removing: "+lHashSet);
		//checing size of linkedhashset
		System.out.println(lHashSet.size());
		//clearing
		lHashSet.clear();
		System.out.println(lHashSet);

	}

}
