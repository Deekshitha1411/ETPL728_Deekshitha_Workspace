package com.evergent.corejava.collections.map;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap myMap=new HashMap();
		myMap.put(100.0,89);
		myMap.put(2000,"bhanu");
		myMap.put(3000, "abbas");
		myMap.put(100, "welcome");
		myMap.put(null, "abc");
		myMap.put(700, null);
		myMap.put(null, "xyz");
		myMap.put(600, null);
		
		System.out.println(myMap);
		

	}

}
