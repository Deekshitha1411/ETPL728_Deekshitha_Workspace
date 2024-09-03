package com.evergent.corejava.exceptionhandling;

import java.util.LinkedHashSet;

public class CF13_LinkedHashSet {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lh=new LinkedHashSet();
		lh.add("apple");
		lh.add("banana");
		lh.add("orange");
		lh.add("mango");
		lh.add("grapes");
		
		System.out.println("linkedhashset: "+lh);
		System.out.println("iterating over linkedhashset");
		for(String fruit:lh) {
			System.out.println(fruit);
		}
		System.out.println("contains 'mango' :"+lh.contains("mango"));
		lh.remove("banana");
		System.out.println("after removing: "+lh);
		System.out.println(lh.size());
		lh.clear();
		System.out.println("after clearing: "+lh);
		

	}

}
