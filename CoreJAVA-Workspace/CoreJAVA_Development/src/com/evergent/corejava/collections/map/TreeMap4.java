package com.evergent.corejava.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String>srMap=new TreeMap<>();
		srMap.put(102, "raju");
		srMap.put(101, "balu");
		srMap.put(103, "ramu");
		srMap.put(104, "david"); 
		srMap.
		
		System.out.println(srMap);
		System.out.println("students records(sorted by id): ");
		
		for(Map.Entry<Integer, String>entry:srMap.entrySet()) {
			System.out.println("id: "+entry.getKey()+" name: "+entry.getValue());
		}
	}

}
